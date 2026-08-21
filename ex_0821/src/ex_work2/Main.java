package ex_work2;

public class Main {

    public static void main(String[] args) {

        Scooter s1 = new Scooter("S-01", 15);
        Scooter s2 = new Scooter("S-02", 80);

        User u1 = new User("철수", 2000);

        u1.rentScooter(s1);
        u1.rentScooter(s2);
        u1.rentScooter(s1);
        u1.returnScooter(15);
        u1.rentScooter(s2);

    }

}
