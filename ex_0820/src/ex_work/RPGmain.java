package ex_work;

public class RPGmain {

    public static void main(String[] args) {
        
        Boss boss = new Boss();
        boss.setName("레드 드래곤");
        boss.setMaxHp(100);
        boss.setHp(100);
        
        Character c1 = new Character();
        c1.setName("타락파워전사");
        c1.setJob("전사");
        c1.setMaxHp(100);
        c1.setHp(80);

        Character c2 = new Character();
        c2.setName("아시안느");
        c2.setJob("힐러");
        c2.setMaxHp(50);
        c2.setHp(40);

        Item item1 = new Item();
        item1.setName("체력 포션");
        item1.setType("potion");
        item1.setValue(30);

        Item item2 = new Item();
        item2.setName("화염 구슬");
        item2.setType("weapon");
        item2.setValue(20);

        c1.showInfo();
        c2.showInfo();

        boss.areaAttack(c1, c2);
        c2.attack(c1);
        c1.attack(boss);
        boss.areaAttack(c1, c2);

        System.out.println(c1.getName() + " : " + c1.isAlive());
        System.out.println(c2.getName() + " : " + c2.isAlive());

        c1.showInfo();
        c2.showInfo();
        boss.showInfo();

    }
    
}
