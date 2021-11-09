package controller;

import model.Cosmetic;
import model.Fashion;
import repository.FashionRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class FashionController {
    static FashionRepository fashionRepository = new FashionRepository();
    public ArrayList<Fashion> sortFashion() throws FileNotFoundException {
        ArrayList<Fashion> arrayList = fashionRepository.getData();
        Collections.sort(arrayList);
        return arrayList;
    }

    public void priceLarge100000(ArrayList<Fashion> arrayList) throws FileNotFoundException {
        for (Fashion i : arrayList) {
            if (i.getPrice() > 100000) {
                System.out.println(i);
            }
        }
    }
    public void display(ArrayList<Fashion> arrayList){
        for(Fashion i: arrayList){
            System.out.println(i);
        }
    }
    public void findByName(String name){
        ArrayList<Fashion> fashionArrayList = new ArrayList<>();
        for(Fashion i: fashionArrayList){
            if ((i.getName()).equals(name)){
                System.out.println(i);
            }else{
                System.out.println("khong tim thay san pham");
            }
        }
    }
    public void bestSell(ArrayList<Fashion> arrayList) {

        Fashion fashion = null;
        int soldBest = Integer.MIN_VALUE;
        for (Fashion i : arrayList) {
            if (soldBest < i.getSold()) {
                fashion = new Fashion(i.getId(), i.getCategory(), i.getName(), i.getPrice(), i.getStatus(), i.getSold());
                soldBest = i.getSold();
            }
        }
        System.out.println(soldBest);
        System.out.println(fashion);
        // in ra thong tin san pham ban chay nhat


    }
}
