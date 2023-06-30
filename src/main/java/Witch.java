public class Witch extends Magics{

    int magicAttack;
    public Witch(String name) {
        super(name);
        super.level = 1;
        super.health = 100;
        super.initiative = 4;
        super.defence = 1;
        this.magicAttack = 7;
    }

}
