import model.Kitchen;
import model.Waiter;

public class App {
    public static void main(String[] args) {
        Waiter waiter = new Waiter(1,"Em Boi ban ngay tho",18,1500,1000);
        System.out.println("Luong cua em boi ban: "+waiter.calculatorSalary());
        Kitchen kitchen = new Kitchen(2,"Anh dau bep may man",69,10000,5000);
        System.out.println("Luong cua lao dau bep: "+kitchen.calculatorSalary());

    }

}
