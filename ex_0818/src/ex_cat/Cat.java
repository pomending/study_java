package ex_cat;

public class Cat {

    String name;
    int hunger;

    public void eat(int amount){

        hunger -= amount;
        if(hunger < 0)
            hunger = 0;
        System.out.println("현재 배고픔 : " + hunger);

    }

    public void play(){
        hunger += 2;
        System.out.println(name + "이(가) 재밌게 노는중");
    }

    public void getStatus(){
        System.out.println(name + "의 배고픔 : " + hunger);
    }

    
    
}
