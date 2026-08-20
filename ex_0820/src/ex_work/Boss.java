package ex_work;

public class Boss {

    private String name;
    private int hp;
    private int maxHp;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getMaxHp() {
        return maxHp;
    }
    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public void areaAttack(Character target1, Character target2){
        target1.setHp(target1.getHp() - 20);
        target2.setHp(target2.getHp() - 20);

        if( !target1.isAlive() )
            target1.setHp(0);
        if( !target2.isAlive() )
            target2.setHp(0);

        System.out.printf(
            "[%s]이 광역 공격을 발사했습니다! [%s]과 [%s]이 피해를 입었습니다.\n"
            , name, target1.getName(), target2.getName());

    }

    public void showInfo(){
        System.out.printf("%s : %d / %d\n", name, hp, maxHp);
    }
    
}
