package controller;

import model.Cosmetic;
import model.Food;
import model.Houseware;
import repository.HousewareRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class HousewareController {
   static HousewareRepository housewareRepository = new HousewareRepository();
    public ArrayList<Houseware> sortHouseware() throws FileNotFoundException {
        ArrayList<Houseware> arrayList = housewareRepository.getData();
        Collections.sort(arrayList);
        return arrayList;
    }
    public  void priceLarge100000(ArrayList<Houseware> arrayList) throws FileNotFoundException {
        for(Houseware i: arrayList){
            if(i.getPrice() > 100000){
                System.out.println(i);
            }
        }
    }
    public void display(ArrayList<Houseware> arrayList){
        for(Houseware i: arrayList){
            System.out.println(i);
        }
    }
    public void findByName(String name){
        ArrayList<Houseware> fashionArrayList = new ArrayList<>();
        for(Houseware i: fashionArrayList){
            if ((i.getName()).equals(name)){
                System.out.println(i);
            }else{
                System.out.println("khong tim thay san pham");
            }
        }
    }
    public void bestSell(ArrayList<Houseware> arrayList) {
        ArrayList<Houseware> fashionArrayList = new ArrayList<>();
        Houseware houseware = null;
        int soldBest = Integer.MIN_VALUE;
        for (Houseware i : arrayList) {
            if (soldBest < i.getSold()) {
                houseware = new Houseware(i.getId(), i.getCategory(), i.getName(), i.getPrice(), i.getStatus(), i.getSold());
                soldBest = i.getSold();
            }
        }
        System.out.println(soldBest);
        System.out.println(houseware);


    }

}
