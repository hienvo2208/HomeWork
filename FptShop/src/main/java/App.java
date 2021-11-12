import Service.ProductService;
import dao.ProductRepository;
import model.Product;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("---------------MENU---------------");
        System.out.println("1. In thông tin theo danh mục ĐIỆN_THOẠI ");
        System.out.println("2. In Thông tin theo danh mục LAPTOP ");
        System.out.println("3. In thông tin theo danh mục APPLE ");
        System.out.println("4. In thông tin theo danh mục PHỤ_KIỆN ");
        System.out.println("5. In thông tin theo danh mục theo HÃNG ĐIỆN THOẠI ");
        System.out.println("6: In sản phẩm theo mức giá");
        System.out.println("7. Tìm sản phẩm theo tên. ");
        System.out.println("-----------------------------------");

        boolean flag = true;
        while (flag){
            System.out.println("Nhập lựa chọn: ");
            int section = scanner.nextInt();
            switch (section){
                case 1:
                    EX1();
                    break;
                case 2:
                    EX2();
                    break;
                case 3:
                    EX3();
                    break;
                case 4:
                    EX4();
                    break;
                case 5:
                    EX5();
                    break;

                case 6:
                    Ex6();
                    break;
                case 7:
                    Ex7();
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Nhập lại: ");
                    section = scanner.nextInt();
            }
        }




    }

    private static void Ex7() {
        ProductService productService = new ProductService();
        scanner.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String s = scanner.nextLine();
        ArrayList<Product> list = productService.findProduct(s);
        if(list.size()==0){
            System.out.println("Không tìm thấy sản phẩm. ");
        }else{
            for(Product i: list){
                System.out.println(i);
            }
        }

    }

    private static void Ex6() throws FileNotFoundException {
        ProductRepository productRepository = new ProductRepository();
        ArrayList<Product> list = productRepository.getData();
        System.out.println("danh mục sản phẩm dưới 2 triệu: ");
        for(Product i: list){
            if((i.getCost()) < 2000000){
                System.out.println(i);
            }
        }
        System.out.println("Danh mục sản phẩm Từ 2 - 4 triệu");
        for(Product i: list){
            if((i.getCost()) > 2000000 && (i.getCost()) < 4000000 ){
                System.out.println(i);
            }
        }
        System.out.println("Từ 4 - 7 triệu");
        for(Product i: list){
            if((i.getCost()) < 7000000 && (i.getCost()) > 4000000 ){
                System.out.println(i);
            }
        }
        System.out.println("Từ 7 - 13 triệu");
        for(Product i: list){
            if((i.getCost()) > 7000000 && (i.getCost()) < 13000000 ){
                System.out.println(i);
            }
        }
        System.out.println("Trên 13 triệu");
        for(Product i: list){
            if((i.getCost()) > 13000000){
                System.out.println(i);
            }
        }



    }

    private static void EX5() {
        ProductService productService = new ProductService();
        scanner.nextLine();
        System.out.println("Nhập tên hãng: ");
        String s = scanner.nextLine();
        ArrayList<Product> list = productService.printInfBasBrand(s);
        for(Product i: list){
            System.out.println(i);
        }

    }

    // In danh muc theo dien thoai .
    public static  void EX1(){
        ProductService productService = new ProductService();
        ArrayList<Product> list = productService.printInfBasPhone();
        for(Product i: list){
            System.out.println(i);
        }
    }
    public static  void EX2(){
        ProductService productService = new ProductService();
        ArrayList<Product> list = productService.printInfBasLaptop();
        for(Product i: list){
            System.out.println(i);
        }
    }
    public static  void EX3(){
        ProductService productService = new ProductService();
        ArrayList<Product> list = productService.printInfBasApple();
        for(Product i: list){
            System.out.println(i);
        }
    }
    public static  void EX4(){
        ProductService productService = new ProductService();
        ArrayList<Product> list = productService.printInfBasPhukien();
        for(Product i: list){
            System.out.println(i);
        }
    }

}
