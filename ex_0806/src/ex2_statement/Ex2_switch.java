package ex2_statement;

public class Ex2_switch {

    public static void main(String[] args) {
        
        String str = "A";
        String res = "";

        switch ( str ){//비교값

            case "A":  //조건값
                res = "90 ~ 100";
                break;

            case "B": 
                res = "80 ~ 89";
                break;

            case "C":
                res = "70 ~ 79";
                break;
                
            case "D":
                res = "60 ~ 69";
                break;

            case "F":
                res = "59점 이하";
                break;
            
            default:
                res = "올바른 성적을 입력하세요";
                break;
        }

        System.out.println(res);

    }
    
}
