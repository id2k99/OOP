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

        List<Base> teamOne = new ArrayList<>();
        List<Base> teamTwo = new ArrayList<>();
        createTeam(teamOne);
        createTeam(teamTwo);

        System.out.println("TeamOne:");
        getTeamInfo(teamOne);
        System.out.println("TeamTwo:");
        getTeamInfo(teamTwo);

        }
    public static void createTeam(List<Base> teamList){
        int teamCount = 10;
        Random rand = new Random();
        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(7);
            switch (val) {
                case 0:
                    teamList.add(new Arbalester());
                    break;
                case 1:
                    teamList.add(new Sniper());
                    break;
                case 2:
                    teamList.add(new Monk());
                    break;
                case 3:
                    teamList.add(new Witch());
                    break;
                case 4:
                    teamList.add(new Pikerman());
                    break;
                case 5:
                    teamList.add(new Robber());
                    break;
                case 6:
                    teamList.add(new Countryman());
                    break;
                default:
                    // teams.add(new BaseHero());
                    break;
            }
        }
    }

    public static void getTeamInfo(List<Base> teamList){
        for (int i = 0; i < teamList.size(); i++) {
            System.out.println(teamList.get(i).getInfo());
        }
        System.out.println();
    }
}
