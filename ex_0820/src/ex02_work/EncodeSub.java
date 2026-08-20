package ex02_work;

public class EncodeSub {

    private char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^',
            '&', '*', '(', ')', '-', '_', '+', '=', '|',
            '[', ']', '{', '}', ';', ':', ',', '.', '/' };

    private char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y',
            'u', 'i', 'o', 'p' };           

    private String code = "";

    //StringBuffer result = new StringBuffer();

    public String encode(String str){

        for( int i = 0; i < str.length(); i++ ){
        
            char ch = str.charAt(i);

            if( ch <= '9' && ch >= '0' ){
                code += numCode[ch - '0'];
                //result.append(numCode[ch - '0']);

            }else if( ch <= 'z' && ch >= 'a' ){
                code += abcCode[ch - 'a'];
                //result.append(abcCode[ch - 'a']);

            }

        }

        return code;
        //return result.toString();

    }

}
