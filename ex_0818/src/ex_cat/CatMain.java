package ex_cat;

public class CatMain {

    public static void main(String[] args) {
        
        Cat c1 = new Cat();
        c1.name = "나비";
        c1.hunger = 5;
        for( int i = 0; i < 10; i++ ){

            c1.eat(1);
            c1.play();
            if( c1.hunger >= 8 ){
                System.out.println("밥내놔");
                c1.eat(1);
            }

        }

    }
    
}
