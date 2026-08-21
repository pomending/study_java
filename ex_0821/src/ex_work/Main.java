package ex_work;

public class Main {

    public static void main(String[] args) {
        
        Item notebook = new Item("노트북", 2, 10);
        Item monitor = new Item("모니터", 5, 4);

        Truck kTruck = new Truck("김트럭", 20);

        kTruck.showInfo();

        kTruck.load(notebook, 5);
        kTruck.load(monitor, 5);
        kTruck.load(monitor, 3);
        kTruck.load(notebook, 6);
        kTruck.load(notebook, 4);

        kTruck.showInfo();
        kTruck.unloadAll();
        kTruck.load(monitor, 4);

    }
    
}
