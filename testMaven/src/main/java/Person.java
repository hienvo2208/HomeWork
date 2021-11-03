import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Person {
    @SerializedName("name")
    String fullname;
    @SerializedName("gender")
    String gender;
    @SerializedName("age")
    int age;

    public Person() {
    }

    public Person(String fullname, String gender, int age) {
        this.fullname = fullname;
        this.gender = gender;
        this.age = age;
    }

    public String toString() {
        return fullname + "-" + gender + "-" + age;
    }

}
