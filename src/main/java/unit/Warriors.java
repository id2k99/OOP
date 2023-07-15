package unit;

import java.util.ArrayList;

public abstract class Warriors extends Base{


    public Warriors(int x, int y, int number) {
        super(x,y, number);
    }

    @Override
    public void step(ArrayList<Base> Own, ArrayList<Base> Enemy) {
        if (this.currentHP == 0) {return;}

        int nearstEnemyIndex = findNearest(Enemy);
        int enemyX = Enemy.get(nearstEnemyIndex).coordinates.x;
        int enemyY = Enemy.get(nearstEnemyIndex).coordinates.y;

        if(this.numberTeam == 1 && this.coordinates.y +1 < enemyY){
            this.coordinates.y +=1;
            if(this.coordinates.y +1 == enemyY){
               attack(Enemy);
               this.state = "Attack!";
            }
        }

        if(this.numberTeam == 1 && this.coordinates.y +1 == enemyY){
                          attack(Enemy);
                this.state = "Attack!";
            }


        if (this.numberTeam == 2 && this.coordinates.y -1 > enemyY) {
            this.coordinates.y -=1;
            if(this.coordinates.y -1 == enemyY){
               attack(Enemy);
                this.state = "Attack!";
            }
        }
        if(this.numberTeam == 2 && this.coordinates.y -1 == enemyY){
            attack(Enemy);
            this.state = "Attack!";
        }
    }
}


//    int enemyX = Enemy.get(findNearest(Enemy)).coordinates.x;
//    int enemyY = Enemy.get(findNearest(Enemy)).coordinates.y;
//
//        if(this.numberTeam == 1 && this.coordinates.x -1 < enemyX){
//        this.coordinates.x +=1;
//        }
//        if (this.numberTeam == 2 && this.coordinates.x -1 > enemyX) {
//        this.coordinates.x -=1;
//        }
