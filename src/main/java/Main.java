import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


//        Countryman countryman1 = new Countryman();
//        Pikerman pikerman1 = new Pikerman();
//        Robber robber1 = new Robber();
//        Arbalester arbalester1 = new Arbalester();
//        Sniper sniper1 = new Sniper();
//        Monk monk1 = new Monk();
//        Witch witch1 = new Witch();
        int numberTeam = 1;
        List<Base> teamOne = new ArrayList<>();
        List<Base> teamTwo = new ArrayList<>();
        createTeam(teamOne, numberTeam);
        numberTeam++;
        createTeam(teamTwo, numberTeam);
        numberTeam++;

        System.out.println("TeamOne:");
        getTeamInfo(teamOne);
        System.out.println("TeamTwo:");
        getTeamInfo(teamTwo);

        }
    public static void createTeam(List<Base> teamList, int numberTeam){
        int teamCount = 10;
        int coordinateY = 1;
        int coordinateX;
        Random rand = new Random();
        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(7);
            if (numberTeam%2 != 0){
                coordinateX = 1;
            }
            else {
                coordinateX = 10;
            }
            switch (val) {
                case 0:
                    teamList.add(new Arbalester(coordinateX,coordinateY));
                    break;
                case 1:
                    teamList.add(new Sniper(coordinateX,coordinateY));
                    break;
                case 2:
                    teamList.add(new Monk(coordinateX,coordinateY));
                    break;
                case 3:
                    teamList.add(new Witch(coordinateX,coordinateY));
                    break;
                case 4:
                    teamList.add(new Pikerman(coordinateX,coordinateY));
                    break;
                case 5:
                    teamList.add(new Robber(coordinateX,coordinateY));
                    break;
                case 6:
                    teamList.add(new Countryman(coordinateX,coordinateY));
                    break;
                default:
                    break;
            }
            coordinateY++;

        }

    }
    public static void getTeamInfo(List<Base> teamList){
        for (int i = 0; i < teamList.size(); i++) {
            System.out.println(teamList.get(i).getInfo());
        }
        System.out.println();
    }
}
