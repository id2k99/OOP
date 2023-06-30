public class Witch extends Magics{

    int magicAttack;
    public void magicAttack(){

        return;
    }
    public Witch(String name) {
        super(name);
        super.health = 100;
        super.initiative = 4;
        super.defence = 1;
        this.magicAttack = 7;
    }

}
