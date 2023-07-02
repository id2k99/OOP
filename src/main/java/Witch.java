public class Witch extends Magics{

    int magicAttack;
    public static int count = 1;
    public void magicAttack(){

        return;
    }
    public Witch() {
        super("witch" + " "+ count);
        super.health = 100;
        super.initiative = 4;
        super.defence = 1;
        this.magicAttack = 7;
        count++;
    }

}
