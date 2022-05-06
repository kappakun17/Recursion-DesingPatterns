package lasertaggame.monster.skill;

public class Skill{
    protected int damege;
    protected String description;

    public Skill(int damege, String description){
        this.damege = damege;
        this.description = description;
    }

    public int getDamege(){
        return this.damege;
    }

    public String getDescription(){
        return this.description;
    }
}