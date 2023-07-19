package unit;

import java.util.ArrayList;

public abstract class Warriors extends Base {

    public Warriors(int x, int y, int number) {
        super(x, y, number);
    }

    @Override
    public void step(ArrayList<Base> Own, ArrayList<Base> Enemy) {
        if (this.currentHP == 0) {return;}         // Проверяем здоровье
        int nearstEnemyIndex = findNearest(Enemy); //  Ищем ближайшего врага

        int enemyX = Enemy.get(nearstEnemyIndex).coordinates.x;
        int enemyY = Enemy.get(nearstEnemyIndex).coordinates.y;

        if(Math.abs(this.coordinates.y - enemyY) > Math.abs(this.coordinates.x-enemyX)){  // Определяем как идти по X или по Y
            if(this.coordinates.y < enemyY) {
                this.coordinates.y += 1;
            }
            else {
                this.coordinates.y -= 1;
            }
        }
        else {
            if(this.coordinates.x < enemyX) {
                this.coordinates.x -= 1;
            }
            else {
                this.coordinates.x += 1;
            }
        }

//        if (this.numberTeam == 1 && this.coordinates.y + 1 == enemyY) {
//            attack(Enemy);
//            this.state = "Attack!";
//        }
//        if (this.numberTeam == 2 && this.coordinates.y - 1 == enemyY) {
//            attack(Enemy);
//            this.state = "Attack!";
//        }

    }
}