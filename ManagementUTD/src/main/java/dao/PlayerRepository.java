package dao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Player;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class PlayerRepository {
   public ArrayList<Player> getData(){
       ArrayList<Player> listPlayer = new ArrayList<>();
       try {
           FileReader fileReader = new FileReader("football_player_final.json");
           Type object = new TypeToken<ArrayList<Player>>(){}.getType();
           Gson gson = new Gson();
           listPlayer = gson.fromJson(fileReader,object);
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
       return listPlayer;
   }
}
