import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Student std1 = new Student();
//        std1.name ="Than Thi Hanh";
//        std1.age = 22;
        Gson gson = new Gson();
//        String jsonData = gson.toJson(std1);
//        System.out.println(jsonData);
//        // Chuyển Json sang đối tượng.
//        Type objectType = new TypeToken<Student>(){}.getType();
//        Student std2 = gson.fromJson(jsonData,objectType);
        //
        ArrayList<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student("Vo Duc Hien", 22));
        listStudent.add(new Student("Vo Duc Hien", 22));
        listStudent.add(new Student("Vo Duc Hien", 22));
        listStudent.add(new Student("Vo Duc Hien", 22));
        listStudent.add(new Student("Vo Duc Hien", 22));
        String sArrayList = gson.toJson(listStudent);
        System.out.println(sArrayList);
        // Chuyển json text -> collection .
        Type objectType = new TypeToken<Student>(){}.getType();
        ArrayList<Student> stuList = gson.fromJson(sArrayList,objectType);


    }
}
