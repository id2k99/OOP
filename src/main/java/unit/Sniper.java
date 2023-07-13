package unit;

public class Sniper extends Archers{

    public Sniper(int x, int y) {
        super(x,y);
        super.maxHP = 100;
        super.currentHP = super.maxHP;
        super.arrows = 10;
        super.initiative = 9;
        super.defence = 3;
        super.attack = new int[]{15, 30};
    }

    @Override
    public String getInfo() {
        return "Sniper" + " " + this.name + " " + this.state +" " + " Health " + this.currentHP + " Arrows " + this.arrows;
    }

}
