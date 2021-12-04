package dao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.User;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Repository {
    public static ArrayList<User> users;
    public static ArrayList<User> getData() {
        try {
            FileReader fileReader = new FileReader("acount.json");
            Type objectType = new TypeToken<List<User>>() {
            }.getType();
            users = new Gson().fromJson(fileReader, objectType);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return users;
    }

}
