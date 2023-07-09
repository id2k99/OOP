package unit;

import java.util.ArrayList;

public class Sniper extends Archers{

    public Sniper(int x, int y) {
        super(x,y);
        super.health = 100;
        super.arrows = 10;
        super.initiative = 9;
        super.defence = 3;
        super.attack = new int[]{15, 30};
    }

    @Override
    public String getInfo() {
        return "Sniper" + " " + this.name + " Health " + this.health + " Arrows " + this.arrows;
    }

    @Override
    public void attack(ArrayList<Base> teamEnemy) {
        Base enemy = teamEnemy.get(findNearest(teamEnemy));
        enemy.health -= (this.attack[1] + this.attack[0])/2 - enemy.defence;
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
