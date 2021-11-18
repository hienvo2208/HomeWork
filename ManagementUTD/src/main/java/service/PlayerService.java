package service;

import dao.PlayerRepository;
import model.Player;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class PlayerService {
    public ArrayList<Player> selectGk() {
        PlayerRepository playerRepository = new PlayerRepository();
        ArrayList<Player> listPlayer = playerRepository.getData();
        ArrayList<Player> listGk = new ArrayList<>();
        Random random = new Random();
        int gkSize = 0;
        while (gkSize < 1) {
            int randomGk = random.nextInt(23);
            if (listPlayer.get(randomGk).getPosition().equals("GK")) {
                listGk.add(listPlayer.get(randomGk));
                gkSize++;
            }
        }
        return listGk;
    }

    public ArrayList<Player> select4DF() {
        PlayerRepository playerRepository = new PlayerRepository();
        ArrayList<Player> listPlayer = playerRepository.getData();
        ArrayList<Player> listDF = new ArrayList<>();
        Random random = new Random();
        int gkSize = 0;
        while (gkSize < 4) {
            int randomGk = random.nextInt(23);
            if (listPlayer.get(randomGk).getPosition().equals("DF")) {
                listDF.add(listPlayer.get(randomGk));
                gkSize++;
            }
        }
        return listDF;
    }

    public ArrayList<Player> select3DF() {
        PlayerRepository playerRepository = new PlayerRepository();
        ArrayList<Player> listPlayer = playerRepository.getData();
        ArrayList<Player> listDF = new ArrayList<>();
        Random random = new Random();
        int dfSize = 0;
        while (dfSize < 3) {
            int randomGk = random.nextInt(23);
            if (listPlayer.get(randomGk).getPosition().equals("DF")) {
                listDF.add(listPlayer.get(randomGk));
                dfSize++;
            }
        }
        return listDF;
    }

    public ArrayList<Player> select3MF() {
        PlayerRepository playerRepository = new PlayerRepository();
        ArrayList<Player> listPlayer = playerRepository.getData();
        ArrayList<Player> listMF = new ArrayList<>();
        Random random = new Random();
        int mfSize = 0;
        while (mfSize < 3) {
            int randomGk = random.nextInt(23);
            if (listPlayer.get(randomGk).getPosition().equals("MF")) {
                listMF.add(listPlayer.get(randomGk));
                mfSize++;
            }
        }
        return listMF;
    }

    public ArrayList<Player> select4MF() {
        PlayerRepository playerRepository = new PlayerRepository();
        ArrayList<Player> listPlayer = playerRepository.getData();
        ArrayList<Player> listMF = new ArrayList<>();
        Random random = new Random();
        int mfSize = 0;
        while (mfSize < 4) {
            int randomGk = random.nextInt(23);
            if (listPlayer.get(randomGk).getPosition().equals("MF")) {
                listMF.add(listPlayer.get(randomGk));
                mfSize++;
            }
        }
        return listMF;
    }

    public ArrayList<Player> select5MF() {
        PlayerRepository playerRepository = new PlayerRepository();
        ArrayList<Player> listPlayer = playerRepository.getData();
        ArrayList<Player> listMF = new ArrayList<>();
        Random random = new Random();
        int mfSize = 0;
        while (mfSize < 5) {
            int randomGk = random.nextInt(23);
            if (listPlayer.get(randomGk).getPosition().equals("MF")) {
                listMF.add(listPlayer.get(randomGk));
                mfSize++;
            }
        }
        return listMF;
    }
    public ArrayList<Player> select3FW() {
        PlayerRepository playerRepository = new PlayerRepository();
        ArrayList<Player> listPlayer = playerRepository.getData();
        ArrayList<Player> listFW = new ArrayList<>();
        Random random = new Random();
        int fwSize = 0;
        while (fwSize < 3) {
            int randomGk = random.nextInt(23);
            if (listPlayer.get(randomGk).getPosition().equals("FW")) {
                listFW.add(listPlayer.get(randomGk));
                fwSize++;
            }
        }
        return listFW;
    }
    public ArrayList<Player> select2FW() {
        PlayerRepository playerRepository = new PlayerRepository();
        ArrayList<Player> listPlayer = playerRepository.getData();
        ArrayList<Player> listFW = new ArrayList<>();
        Random random = new Random();
        int fwSize = 0;
        while (fwSize < 2) {
            int randomGk = random.nextInt(23);
            if (listPlayer.get(randomGk).getPosition().equals("FW")) {
                listFW.add(listPlayer.get(randomGk));
                fwSize++;
            }
        }
        return listFW;
    }
}
