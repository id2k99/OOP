package unit;

import java.util.ArrayList;

public class Sniper extends Archers{

    public Sniper(int x, int y) {
        super(x,y);
        super.health = 100;
        super.arrows = 10;
        super.initiative = 4;
        super.defence = 3;
        super.attack = new int[]{9, 19};
    }

    @Override
    public String getInfo() {
        return "Sniper" + " " + this.name + " Health " + this.health + " Arrows " + this.arrows;
    }

    @Override
    public void attack(ArrayList<Base> teamEnemy) {
        teamEnemy.get(findNearest(teamEnemy)).health -= (this.attack[1]- this.attack[0])/2;
    }

    @Override
    public void step(ArrayList<Base> teamOwn, ArrayList<Base> teamEnemy) {
        if (this.health <= 0 || this.arrows == 0 ) {return;}
        attack(teamEnemy);
        for(Base c: teamOwn){
            if (c.getClass() == Countryman.class) {return;}
        }
        this.arrows -= 1;
    }
}
