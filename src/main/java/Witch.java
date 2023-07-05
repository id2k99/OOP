public class Witch extends Magics{

    int magicAttack;
    public void magicAttack(){

        return;
    }
    public Witch(int x, int y) {
        super(x,y);
        super.health = 100;
        super.initiative = 4;
        super.defence = 1;
        this.magicAttack = 7;
    }
    @Override
    public String getInfo() {
        return "Witch" + " " + this.name + " " + "Coordinates: " +  this.coordinates;
    }


    @Override
    public void step() {

    }
}
