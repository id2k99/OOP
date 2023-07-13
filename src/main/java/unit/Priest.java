package unit;

import java.util.ArrayList;

public class Priest extends Magics{

    protected int hill;

    public Priest(int x, int y) {
        super(x,y);
        super.maxHP = 100;
        super.currentHP = super.maxHP;
        super.initiative = 7;
        super.defence = 1;
        this.hill = 5;

    }
    @Override
    public String getInfo() {
        return "Priest" + " " + this.name + " " + this.state +" " + " Health " + this.currentHP;
    }

    protected int findMinHealth(ArrayList<Base> ownTeam){
        int friendIndex = 0;
        int minHealth = 150;
        for (int i = 0; i < ownTeam.size(); i++) {
            if(ownTeam.get(i).currentHP < minHealth){
                minHealth = ownTeam.get(i).currentHP;
                friendIndex = i;
            }
        }

        return friendIndex;
    }

    public void hill(ArrayList<Base> ownTeam) {
        Base friend = ownTeam.get(findMinHealth(ownTeam));
        friend.currentHP += this.hill;
//        if (friend.currentHP > friend.maxHP){
//            friend.currentHP = friend.maxHP;
//        }
        //this.mana -= 10;
        friend.state = "Healed";
    }
    @Override
    public void step(ArrayList<Base> Owm, ArrayList<Base> Enemy) {
        for (int i = 0; i < Owm.size() ; i++) {
            if (!Owm.get(i).state.equals("Die") && Owm.get(i).currentHP < Owm.get(i).maxHP){
                hill(Owm);
            }

        }


        //magicAttack(Enemy);

    }
}
