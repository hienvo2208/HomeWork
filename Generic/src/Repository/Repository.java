package Repository;

import model.Kitchen;
import model.Waiter;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    public ArrayList<Kitchen> allKitchen;
    public ArrayList<Waiter> allWaiter;
    public ArrayList<Kitchen> getAllKitchen(){
        allKitchen = new ArrayList<>();
        allKitchen.add(new Kitchen(1, "Nguyen Van A", 23, 500, 100));
        allKitchen.add(new Kitchen(2, "Nguyen Van B", 24, 600, 200));
        return allKitchen;
    }
    public ArrayList<Waiter> getAllWaiter(){
        allWaiter = new ArrayList<>();
        allWaiter.add(new Waiter(3,"Nguyen Van C",25,1000,100));
        allWaiter.add(new Waiter(4,"Nguyen Van C",26,1200,100));
        return allWaiter;
    }
}
