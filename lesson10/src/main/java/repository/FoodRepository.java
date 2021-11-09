package repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Cosmetic;
import model.Food;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class FoodRepository {
    public ArrayList<Food> getData() throws FileNotFoundException {
        ArrayList<Food> arrayList = new ArrayList<>();
        FileReader fileReader = new FileReader("food.json");
        Gson gson = new Gson();
        Type object = new TypeToken<ArrayList<Food>>(){}.getType();
        arrayList = gson.fromJson(fileReader,object);
        return arrayList;
    }
    public void displayData(ArrayList<Food> list){
        for(Food i: list){
            System.out.println(i);
        }
    }
}
