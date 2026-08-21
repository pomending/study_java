package ex_work2;

public class Scooter {

    private String id;
    private int battery;
    private boolean isRented;

    public String getId() {
        return id;
    }

    public int getBattery() {
        return battery;
    }

    public boolean isRented() {
        return isRented;
    }

    public Scooter( String id, int battery ){
        this.id = id;
        this.battery = battery;
        isRented = false;
    }

    public boolean startRent(){
        if( isRented || battery < 20 )
            return false;

        else{
            isRented = true;
            return true;
        }
    }

    public void finishRent(){
        isRented = false;
    }

    public void useBattery( int amount ){
        battery -= amount;
        if( battery < 0 )
            battery = 0;
    }

    

}
