package ex_string;

public class StringValidation {

    String password;

    public void makePassword( String pw ){

        if( pw.length() < 8 )
            System.out.println("비밀번호는 8자리 이상이어야 합니다.");
        if( pw.equals("Admin1234!") )
            System.out.println("관리자 계정으로 접속합니다");

    }
    
}
