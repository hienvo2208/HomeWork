package dao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Product;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class ProductRepository {
    public ArrayList<Product> getData() throws FileNotFoundException {
        ArrayList<Product> arrayList = new ArrayList<>();
        FileReader fileReader = new FileReader("fptShop.json");
        Gson gson = new Gson();
        Type object = new TypeToken<ArrayList<Product>>(){}.getType();
        arrayList = gson.fromJson(fileReader,object);
        return arrayList;
    }
}
