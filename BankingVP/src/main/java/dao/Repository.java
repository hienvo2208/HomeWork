package dao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.User;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

public class Repository {
    public List<User> users;
    public List<User> getData(){
        try {
            FileReader fileReader = new FileReader("User.json");
            Type objectType = new TypeToken<List<User>>() {
            }.getType();
            Gson gson =  new Gson();
            users = gson.fromJson(fileReader,objectType);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return users;
    }
}
