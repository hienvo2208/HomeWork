import controller.*;
import model.*;
import repository.CosmeticRepository;
import repository.FashionRepository;
import repository.FoodRepository;
import repository.HousewareRepository;

import java.io.FileNotFoundException;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    static CosmeticController cosmeticController = new CosmeticController();
    static FashionController fashionController = new FashionController();
    static FoodController foodController = new FoodController();
    static HousewareController housewareController = new HousewareController();
    static CosmeticRepository cosmeticRepository = new CosmeticRepository();
    static FashionRepository fashionRepository = new FashionRepository();
    static FoodRepository foodRepository = new FoodRepository();
    static HousewareRepository housewareRepository = new HousewareRepository();
    public static Scanner scanner = new Scanner(System.in);
    static ArrayList<Cosmetic> cosmeticArrayList = new ArrayList<>();
    static ArrayList<Fashion> fashionArrayList = new ArrayList<>();
    static ArrayList<Food> foodArrayList = new ArrayList<>();
    static ArrayList<Houseware> housewareArrayList = new ArrayList<>();


    public static void main(String[] args) throws FileNotFoundException {
        boolean flag = true;
        while (flag) {
            System.out.println("===============Menu====================");
            System.out.println("Chon 1:In thông tin tất cả sản phẩm ra màn hình ");
            System.out.println("Chọn 2:In thông tin các sản phẩm có giá lớn hơn 100.000");
            System.out.println("Chọn 3:Sắp xếp sản phẩm theo số lượng bán được");
            System.out.println("Chọn 0: Thoát chương trình");
            System.out.println("===============Menu====================");
            System.out.println("Nhap lua chon: ");
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    dispalyInfomationProduct();
                    break;
                case 2:
                    dispalyInfomationProductEx2();
                    break;
                case 3:
                    sortSold();
                    break;
                case 6:
                    findWarehouseByName();
                    break;
                case 7:
                    findFoodByName();
                    break;
                case 8:
                    bestSellOfCosmetic();
                    break;
                case 9:
                    bestSellOfFashion();
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Nhap lai lua chon: ");
                    selection = scanner.nextInt();
            }
        }
    }

    private static void bestSellOfFashion() throws FileNotFoundException {
        fashionController.bestSell(fashionRepository.getData());
    }

    private static void bestSellOfCosmetic() throws FileNotFoundException {
        cosmeticController.bestSell(cosmeticRepository.getData());
    }

    private static void findFoodByName() {
        System.out.println("nhap ten: ");
        String find = scanner.nextLine();
        foodController.findByName(find);
    }

    private static void findWarehouseByName() {
        System.out.println("nhap ten: ");
        String find = scanner.nextLine();
        housewareController.findByName(find);
    }

    private static void sortSold() throws FileNotFoundException {
        // Phuong thuc nay dang le nam trong controller .
        cosmeticArrayList = cosmeticController.sortCosmetic();
        fashionArrayList = fashionController.sortFashion();
        foodArrayList = foodController.sortFood();
        housewareArrayList = housewareController.sortHouseware();

    }
//
    private static void dispalyInfomationProductEx2() throws FileNotFoundException {
        cosmeticController.priceLarge100000(cosmeticRepository.getData());
        fashionController.priceLarge100000(fashionRepository.getData());
        foodController.priceLarge100000(foodRepository.getData());
        housewareController.priceLarge100000(housewareRepository.getData());
        // ham in san pham theo so luong luoi viet.
    }

 //  - In thông tin tất cả sản phẩm ra màn hình.
    private static void dispalyInfomationProduct() throws FileNotFoundException {
        cosmeticRepository.displayData(cosmeticRepository.getData());
        fashionRepository.displayData(fashionRepository.getData());
        housewareRepository.displayData(housewareRepository.getData());
        foodRepository.displayData(foodRepository.getData());
    }

}
