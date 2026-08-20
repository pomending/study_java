package ex_work;

public class Character {

    private String name;
    private String job;
    private int hp;
    private int maxHp;
    private int mp;
    private int maxMp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
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

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getMaxMp() {
        return maxMp;
    }

    public void setMaxMp(int maxMp) {
        this.maxMp = maxMp;
    }


    public void useItem(Item item){
        if(item.getType().equals("potion")){
            hp += item.getValue();
            if( hp > maxHp )
                hp = maxHp;
        }

    }

    public void useItem(Item item, Character target){
        if(item.getType().equals("weapon")){
            target.hp -= item.getValue();
        }

    }

    public boolean isAlive(){
        if( hp > 0 )
            return true;
        else
            return false;
    }

    public void attack(Boss boss){

        if("전사".equals(getJob())){
            boss.setHp(boss.getHp() - 30);
            System.out.println(
                "[" + name + "]이(가) 보스에게 강력한 칼날 베기를 사용했습니다!");

            if( boss.getHp() <= 0 ){
                boss.setHp(0);
                System.out.println("보스를 처치했습니다!");
            }

        }

    }

    public void attack(Character target){

        if("힐러".equals(getJob())){
            target.hp += 25;
            if(target.hp > target.maxHp){
                target.hp = target.maxHp;
            }
            System.out.printf(
                "[%s]이(가) [%s]을(를) 치유했습니다!\n", name, target.name);

        }

    }

    public void useSkill(Skill skill, Character target){

        if( mp < skill.getManaCost() ){
            System.out.printf("[%s]의 마나가 부족합니다!", name);
            return;
        }else{
            
            mp -= skill.getManaCost();

            if("ATTACK".equals(skill.getType())){
                target.hp -= skill.getPower();
            }else if("HEAL".equals(skill.getType())){
                target.hp += skill.getPower();
                if(target.hp > target.maxHp)
                    target.hp = target.maxHp;
            }
        }

    }

    public void showInfo(){
        System.out.printf("%s(%s) , HP : %d / %d  MP : %d / %d\n", name, job, hp, maxHp, mp, maxMp);
    }
    
}
