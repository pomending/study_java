package ex_work;

public class Item {

    private String name;
    private int weight;
    private int stock;

    public Item( String name, int weight, int stock ){
        this.name = name;
        this.weight = weight;
        this.stock = stock;
    }

    public boolean decreaseStock(int count){
        if(count > stock){
            return false;
        }else{
            stock -= count;
            return true;
        }
    }

    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }

    public int getStock(){
        return stock;
    }
    
}
