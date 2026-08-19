package ex6_work;

public class Grade {

    public int calPoint( int price, String grade ){

        if( grade.equalsIgnoreCase("VIP") ){
            return (int)(price * 0.1);

        }else if( grade.equalsIgnoreCase("GOLD")){
            return (int)(price * 0.05);

        }else if( grade.equalsIgnoreCase("SILVER")){
            return (int)(price * 0.03);

        }else{
            System.out.println("회원등급이 올바르지 않습니다");
            return 0;
            
        }

    }
    
}
