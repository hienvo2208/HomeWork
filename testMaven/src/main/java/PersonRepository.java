import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class PersonRepository {
   public ArrayList<Person> getData() throws FileNotFoundException {
      ArrayList<Person> arrayList = new ArrayList<>();
      FileReader fileReader = new FileReader("person.json");
      Type object = new TypeToken<ArrayList<Person>>(){}.getType();
      Gson gson = new Gson();
      arrayList = gson.fromJson(fileReader,object);
      return arrayList;

   }
   public void printList(ArrayList<Person> list){
       for(Person i : list){
           System.out.println(i.toString());
       }
   }
}
