package controller;

import model.Cosmetic;
import repository.CosmeticRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class CosmeticController {
    static CosmeticRepository cosmeticRepository = new CosmeticRepository();

    public ArrayList<Cosmetic> sortCosmetic() throws FileNotFoundException {
        ArrayList<Cosmetic> arrayList = cosmeticRepository.getData();
        Collections.sort(arrayList);
        return arrayList;
    }

    public void priceLarge100000(ArrayList<Cosmetic> arrayList) throws FileNotFoundException {
        for (Cosmetic i : arrayList) {
            if (i.getPrice() > 100000) {
                System.out.println(i);
            }
        }
    }

    public void display(ArrayList<Cosmetic> arrayList) {
        for (Cosmetic i : arrayList) {
            System.out.println(i);
        }
    }

    public void findByName(String name) {
        ArrayList<Cosmetic> cosmeticArrayList = new ArrayList<>();
        for (Cosmetic i : cosmeticArrayList) {
            if ((i.getName()).equals(name)) {
                System.out.println(i);
            } else {
                System.out.println("khong tim thay san pham");
            }
        }
    }

    public void bestSell(ArrayList<Cosmetic> arrayList) {
        Cosmetic cosmetic = null;
        int soldBest = Integer.MIN_VALUE;
        for (Cosmetic i : arrayList) {
            if (soldBest < i.getSold()) {
                cosmetic = new Cosmetic(i.getId(), i.getCategory(), i.getName(), i.getPrice(), i.getStatus(), i.getSold());
                soldBest = i.getSold();
            }
        }
        System.out.println(soldBest);
        System.out.println(cosmetic);
        // in ra thong tin ban chay nhat


    }
}
