import dao.PlayerRepository;
import model.Player;
import service.PlayerService;
import service.TeamService;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("-------------MEMU--------------");
        System.out.println("1. DANH SACH CAU THU.");
        System.out.println("-------------------------------");
        System.out.println("Nhap lua chon: ");
        boolean flag = true;
        while(flag){
            int section = scanner.nextInt();
            switch (section){

                case 0:
                    flag = false;
                    break;
                case 1:
                    danhsachcauthu();
                    break;
                case 2:
                    list442();
                    break;
                case 3:
                    list433();
                    break;
                case 4:
                    list352();
                    break;
                default:
                    System.out.println("Nhap lai lua chon: ");
                    section = scanner.nextInt();
            }

        }
    }

    private static void list442() {
        TeamService teamService = new TeamService();
        ArrayList<Player> list = teamService.team442();
        for(Player i: list){
            System.out.println(i);
        }
    }
    private static void list433() {
        TeamService teamService = new TeamService();
        ArrayList<Player> list = teamService.team433();
        for(Player i: list){
            System.out.println(i);
        }
    }
    private static void list352() {
        TeamService teamService = new TeamService();
        ArrayList<Player> list = teamService.team352();
        for(Player i: list){
            System.out.println(i);
        }
    }


    private static void danhsachcauthu() {
            PlayerRepository playerRepository = new PlayerRepository();
            ArrayList<Player> teamList = playerRepository.getData();
            for(Player i: teamList){
                System.out.println(i);
            }


    }
}
