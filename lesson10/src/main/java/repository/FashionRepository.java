package repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Cosmetic;
import model.Fashion;
import model.Food;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class FashionRepository {
    public ArrayList<Fashion> getData() throws FileNotFoundException {
        ArrayList<Fashion> arrayList = new ArrayList<>();
        FileReader fileReader = new FileReader("Fashion.json");
        Gson gson = new Gson();
        Type object = new TypeToken<ArrayList<Fashion>>(){}.getType();
        arrayList = gson.fromJson(fileReader,object);
        return arrayList;
    }
    public void displayData(ArrayList<Fashion> list){
        for(Fashion i: list){
            System.out.println(i);
        }
    }
}
