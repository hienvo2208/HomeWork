package controller;

import model.Cosmetic;
import model.Fashion;
import model.Food;
import repository.FashionRepository;
import repository.FoodRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class FoodController {
    static FoodRepository foodRepository = new FoodRepository();
    public ArrayList<Food> sortFood() throws FileNotFoundException {
        ArrayList<Food> arrayList = foodRepository.getData();
        Collections.sort(arrayList);
        return arrayList;
    }
    public  void priceLarge100000(ArrayList<Food> arrayList) throws FileNotFoundException {
        for(Food i: arrayList){
            if(i.getPrice() > 100000){
                System.out.println(i);
            }
        }
    }
    public void display(ArrayList<Food> arrayList){
        for(Food i: arrayList){
            System.out.println(i);
        }
    }
    public void findByName(String name){
        ArrayList<Food> fashionArrayList = new ArrayList<>();
        for(Food i: fashionArrayList){
            if ((i.getName()).equals(name)){
                System.out.println(i);
            }else{
                System.out.println("khong tim thay san pham");
            }
        }
    }
    public void bestSell(ArrayList<Food> arrayList) {
        ArrayList<Food> foodArrayList = new ArrayList<>();
        Cosmetic food = null;
        int soldBest = Integer.MIN_VALUE;
        for (Food i : arrayList) {
            if (soldBest < i.getSold()) {
                food = new Cosmetic(i.getId(), i.getCategory(), i.getName(), i.getPrice(), i.getStatus(), i.getSold());
                soldBest = i.getSold();
            }
        }
        System.out.println(soldBest);
        System.out.println(food);
       // in ra san pham ban chay nhat.

    }
}
