package ex_work;

public class Party {

    private int memberCount;
    private Character[] members = new Character[3];

    public boolean addMember(Character member){

        if(memberCount < 3){
            members[memberCount] = member;
            memberCount++;
            return true;
        }else{
            System.out.println("파티가 가득 찼습니다.");
            return false;
        }

    }

    public void printPartyStatus(){

        for( int i = 0; i < memberCount; i++ ){
            members[i].showInfo();
        }

    }
    
}
