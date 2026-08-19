package ex_work;

public class Book {
    
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public boolean isBorrowed() {
        return isBorrowed;
    }
    public void setBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public void displayInfo(){
        if( this.isBorrowed ){
            System.out.printf("제목 : %s, 저자 : %s, ISBN : %s, 현재 대출중 \n", this.getTitle(), this.getAuthor(), this.getIsbn());
        }else{
            System.out.printf("제목 : %s, 저자 : %s, ISBN : %s, 대출중 아님\n", this.getTitle(), this.getAuthor(), this.getIsbn());
        }
    }
    
}
