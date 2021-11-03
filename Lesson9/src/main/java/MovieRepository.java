import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class MovieRepository {
     public ArrayList<Movie> getData() throws FileNotFoundException {
         ArrayList<Movie> arrayList = new ArrayList<>();
         FileReader fileReader = new FileReader("MovieMana.json");
         Type object = new TypeToken<ArrayList<Movie>>(){}.getType();
         Gson gson = new Gson();
         arrayList = gson.fromJson(fileReader,object);
         return  arrayList;

     }
    public void printList(ArrayList<Movie> list){
        for(Movie i : list){
            System.out.println(i.toString());
        }
    }
}
