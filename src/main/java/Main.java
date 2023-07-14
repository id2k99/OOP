import unit.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;


public class Main {
    public static ArrayList<Base> team = new ArrayList<>();
    public static ArrayList<Base> teamOne = new ArrayList<>();
    public static ArrayList<Base> teamTwo = new ArrayList<>();

    public static void main(String[] args) {

        int numberTeam = 1;

        createTeam(teamOne, numberTeam);
        numberTeam++;
        createTeam(teamTwo, numberTeam);
        numberTeam++;
        team.addAll(teamOne);
        team.addAll(teamTwo);
        team.sort(Comparator.comparingInt((Base c) -> c.initiative));

        System.out.println("TeamOne:");
        getTeamInfo(teamOne);
        System.out.println("TeamTwo:");
        getTeamInfo(teamTwo);


        int i= 1;
        while (i < 30){
            for (Base c: team) {
                if (teamOne.contains(c)){
                    c.step(teamOne, teamTwo);
                }
                else {
                    c.step(teamTwo, teamOne);
                }
            }
            View.view();
            i++;
        }

    }

    public static void createTeam(ArrayList<Base> teamList, int numberTeam){
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
                    teamList.add(new Priest(coordinateX,coordinateY));
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
        System.out.println("===============================================");
    }

}

//        System.out.println("TeamOne:");
//        getTeamInfo(teamOne);
//        System.out.println("TeamTwo:");
//        getTeamInfo(teamTwo);