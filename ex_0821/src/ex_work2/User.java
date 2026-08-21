package ex_work2;

public class User {

    private String name;
    private int balance;
    private Scooter rentedScooter;

    public User( String name, int balance ){
        this.name = name;
        this.balance = balance;
        rentedScooter = null;
    }

    public boolean rentScooter( Scooter scooter ){

        if( rentedScooter != null ){
            System.out.println("[실패] 이미 대여 중인 킥보드가 있습니다.");
            return false;
        }

        if( balance < 1000 ){
            System.out.println("[실패] 잔액 부족 (최소 1,000원 필요)");
            return false;
        }

        if( scooter.isRented() || scooter.getBattery() < 20 ){
            System.out.println("[실패] 해당 킥보드는 현재 대여할 수 없습니다 (배터리 부족 또는 사용 중).");
            return false;                
        }

        rentedScooter = scooter;
        scooter.startRent();
        System.out.printf("[성공] %s님이 %s 대여 완료\n", name, scooter.getId());
        return true;

    }

    public void returnScooter( int useMinutes ){

        if( rentedScooter == null ){
            System.out.println("[오류] 대여 중인 킥보드가 없습니다.");
            return;
        }

        int fare;

        if( useMinutes <= 10 )
            fare = 1000;
        else
            fare = 1000 + 100 * (useMinutes - 10);

        rentedScooter.useBattery(useMinutes);
        balance -= fare;

        System.out.println("[반납 완료]");
        System.out.println("이용 시간 : " + useMinutes + " 분");
        System.out.println("요금 : " + fare + " 원");
        System.out.println("남은 잔액 : " + balance + " 원");
        System.out.println("킥보드 배터리 : " + rentedScooter.getBattery() + "%");

        rentedScooter.finishRent();
        rentedScooter = null;

    }
    
}
