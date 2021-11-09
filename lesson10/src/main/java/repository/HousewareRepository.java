package repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Cosmetic;
import model.Food;
import model.Houseware;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class HousewareRepository {
    public ArrayList<Houseware> getData() throws FileNotFoundException {
        ArrayList<Houseware> arrayList = new ArrayList<>();
        FileReader fileReader = new FileReader("Houseware.json");
        Gson gson = new Gson();
        Type object = new TypeToken<ArrayList<Houseware>>(){}.getType();
        arrayList = gson.fromJson(fileReader,object);

        return arrayList;
    }
    public void displayData(ArrayList<Houseware> list){
        for(Houseware i: list){
            System.out.println(i.toString());
        }

    }
}
