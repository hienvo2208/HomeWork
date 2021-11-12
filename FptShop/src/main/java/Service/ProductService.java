package Service;

import dao.ProductRepository;
import model.Product;

import java.io.FileNotFoundException;
import java.util.ArrayList;

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
                if ((i.getName()).equals(product)) {
                   list.add(i);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }


}
