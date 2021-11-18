package service;

import model.Player;

import java.util.ArrayList;

public class TeamService {
    public ArrayList<Player> team442(){
        ArrayList<Player> listTeam442 = new ArrayList<>();
        PlayerService playerService = new PlayerService();
        for(Player i: playerService.selectGk()){
            listTeam442.add(i);
        }
        for(Player i: playerService.select4DF()){
            listTeam442.add(i);
        }
        for(Player i: playerService.select4MF()){
            listTeam442.add(i);
        }
        for(Player i: playerService.select2FW()){
            listTeam442.add(i);
        }
        return listTeam442;
    }
    public ArrayList<Player> team433(){
        ArrayList<Player> listTeam433 = new ArrayList<>();
        PlayerService playerService = new PlayerService();
        for(Player i: playerService.selectGk()){
            listTeam433.add(i);
        }
        for(Player i: playerService.select4DF()){
            listTeam433.add(i);
        }
        for(Player i: playerService.select3MF()){
            listTeam433.add(i);
        }
        for(Player i: playerService.select3FW()){
            listTeam433.add(i);
        }
        return listTeam433;
    }
    public ArrayList<Player> team352(){
        ArrayList<Player> listTeam352 = new ArrayList<>();
        PlayerService playerService = new PlayerService();
        for(Player i: playerService.selectGk()){
            listTeam352.add(i);
        }
        for(Player i: playerService.select3DF()){
            listTeam352.add(i);
        }
        for(Player i: playerService.select5MF()){
            listTeam352.add(i);
        }
        for(Player i: playerService.select2FW()){
            listTeam352.add(i);
        }
        return listTeam352;
    }
}
