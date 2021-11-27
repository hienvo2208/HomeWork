package Service;

import dao.ProductRepository;
import model.Product;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

public class ProductService {
    static ProductRepository productRepository = new ProductRepository();
    static ArrayList<Product> arrayList = new ArrayList<>();

    // in thông tin dựa trên danh mục điện thoại  :
    public ArrayList<Product> printInfBasPhone() {
        ArrayList<Product> list = new ArrayList<>();
        try {
            arrayList = productRepository.getData();
            for (Product i : arrayList) {
                if ((i.getCategory()).equals("ĐIỆN_THOẠI")) {
                    list.add(i);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    // In thông tin dựa trên danh mục laptop
    public ArrayList<Product> printInfBasLaptop() {
        ArrayList<Product> list = new ArrayList<>();
        try {
            arrayList = productRepository.getData();
            for (Product i : arrayList) {
                if ((i.getCategory()).equals("LAPTOP")) {
                    list.add(i);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    // In thông tin dựa trên danh mục Apple
    public ArrayList<Product> printInfBasApple() {
        ArrayList<Product> list = new ArrayList<>();
        try {
            arrayList = productRepository.getData();
            for (Product i : arrayList) {
                if ((i.getCategory()).equals("APPLE")) {
                    list.add(i);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    // In thông tin dựa trên danh mục phụ kiện.
    public ArrayList<Product> printInfBasPhukien() {
        ArrayList<Product> list = new ArrayList<>();
        try {
            arrayList = productRepository.getData();
            for (Product i : arrayList) {
                if ((i.getCategory()).equals("PHỤ_KIỆN")) {
                    list.add(i);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    // In thông tin các sản phẩm dựa theo hãng.

    public ArrayList<Product> printInfBasBrand(String brand) {
        ArrayList<Product> list = new ArrayList<>();
        try {
            arrayList = productRepository.getData();
            for (Product i : arrayList) {
                if ((i.getBrand()).equals(brand)) {
                    list.add(i);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    // Tìm kiếm sản phẩm
    public ArrayList<Product> findProduct(String product) {
        ArrayList<Product> list = new ArrayList<>();
        try {
            arrayList = productRepository.getData();
            for (Product i : arrayList) {
                if ((i.getName()).contains(product)) {
                    list.add(i);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    // Thống kê sản phẩm sử dụng hashMap
    public HashMap<String, Integer> statistical() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        int countPhone = 0;
        int countLaptop = 0;
        int countApple = 0;
        int countPhuKien = 0;
        try {
            ArrayList<Product> arrayLists = productRepository.getData();
            for (Product i : arrayLists) {
                if ((i.getCategory()).equals("ĐIỆN_THOẠI")) countPhone++;
                if ((i.getCategory()).equals("LAPTOP")) countLaptop++;
                if ((i.getCategory().equals("APPLE"))) countApple++;
                if ((i.getCategory().equals("PHỤ_KIỆN"))) countPhuKien++;
            }
            hashMap.put("Điện Thoại", countPhone);
            hashMap.put("Laptop", countLaptop);
            hashMap.put("Apple", countApple);
            hashMap.put("Phụ kiện", countPhuKien);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return hashMap;
    }

    // Liệt kê mỗi danh mục có bao nhiêu sản phẩm.
    public void productPortfolio() {
        HashMap<String, Integer> hashMap = statistical();
        System.out.println("Số lượng điện thoại: " + hashMap.get("Điện thoại."));
        System.out.println("số lượng Laptop: "+hashMap.get("Laptop"));
        System.out.println("số lượng sản phẩm apple: "+hashMap.get("APPLE"));
        System.out.println("Số lượng sản phẩm phụ kienj: "+hashMap.get("Phụ kiện"));


    }


}
