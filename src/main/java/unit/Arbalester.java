package unit;

public class Arbalester extends Archers{

    public Arbalester(int x, int y) {
        super(x,y);
        super.maxHP = 100;
        super.currentHP = 100;
        super.arrows = 10;
        super.initiative = 10;
        super.defence = 5;
        super.attack = new int[]{15, 25};

    }
    @Override
    public String getInfo() {
        return "Arbalester" + " " + this.name + " " + this.state +" " + "Health " + this.currentHP + " Arrows " + this.arrows;
    }

}
