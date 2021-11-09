package repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Cosmetic;
import model.Food;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class CosmeticRepository {
    public ArrayList<Cosmetic> getData() throws FileNotFoundException {
        ArrayList<Cosmetic> arrayList = new ArrayList<>();
        FileReader fileReader = new FileReader("Cosmetics.json");
        Gson gson = new Gson();
        Type object = new TypeToken<ArrayList<Cosmetic>>(){}.getType();
        arrayList = gson.fromJson(fileReader,object);
        return arrayList;
    }
    public void displayData(ArrayList<Cosmetic> list){
        for(Cosmetic i: list){
            System.out.println(i);
        }
    }

}
