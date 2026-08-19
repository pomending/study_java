package ex_work;

public class Library {

    Book[] books = new Book[5];
    int count = 0;

    public void addBook(Book book){

        if(count >= 5){
            System.out.println("도서관이 가득 찼습니다");
        }else{
            books[count] = book;
            count++;
            System.out.println("현재 책 " + count + "권");
        }

    }

    public void lendBook(String isbn){

        for( int i = 0; i < count; i++ ){

            if( isbn.equals(books[i].getIsbn())&& !books[i].isBorrowed()){
                books[i].setBorrowed(true);
                System.out.println("대출 완료");
            }

        }

    }

    public void returnBook(String isbn){

        for( int i = 0; i < count; i++ ){

            if( isbn.equals(books[i].getIsbn()) && books[i].isBorrowed()){
                books[i].setBorrowed(false);
                System.out.println("반납 완료");
            }

        }

    }

    public void showAllBooks(){

        for( int i = 0; i < count; i++ ){
            books[i].displayInfo();
        }


    }
    
}
