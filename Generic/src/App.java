import Repository.Repository;
import model.Employee;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<? extends Employee> list;
        Repository re = new Repository();

        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                list = re.getAllKitchen();
                printList(list);
                break;

            case 2:
                list = re.getAllWaiter();
                printList(list);
                break;

        }
    }
    public static void printList(ArrayList<? extends  Employee> list){
        for(Object o: list){
            System.out.println(o);
        }
    }
}
