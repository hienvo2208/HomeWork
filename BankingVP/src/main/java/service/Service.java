package service;
import org.junit.experimental.max.MaxHistory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Service {
    static String MOBILE = "1";
    static String PASSWORD ="1";
    static Scanner sc = new Scanner(System.in);
    static long balance = 5000000;
    static List<HistoryTransaction> listHistory = new ArrayList<>();
    public static void login(){
        boolean isCheck = false;
        while(!isCheck){
            System.out.print("Nhập số điện thoại: ");
            String mobile = sc.nextLine();
            System.out.print("Nhập mật khẩu: ");
            String password = sc.nextLine();
            if(mobile.equals(MOBILE) && password.equals(PASSWORD)){
                System.out.println("Đăng nhập thành công !!!");
                isCheck = true;
            }
            else{
                System.out.println("Sai số điện thoại hoặc mật khẩu");
                System.out.println("Vui lòng đăng nhập lại");
            }
        }
    }
    public static void mainMenu(){
        boolean isContinue = false;
        Menu.menu();
        while(!isContinue){
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    System.out.println("Số dư của bạn là: " + Util.formatNumber(balance));
                    break;
                case 2:
                    transfer();
                    break;
//                case 3:
//                    printHistoryTransaction();
//                    break;
                case 0:
                    isContinue = true;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này!!!");
            }
        }
    }

    private static void transfer() {
        boolean isCheck = false;
        String account = "";
        while(!isCheck){
            try {
                account = inputAccount();
                isCheck = true;
            } catch (ValidateAccountException e) {
                e.printStackTrace();
            }
        }
        long moneyTransfer = inputMoney();
        sc.nextLine();
        System.out.println("Nhap noi dung chuyen khoan");
        String content = sc.nextLine();


    }

    private static long inputMoney() {
        System.out.println("Nhap so tien can chuyen di: ");
        long moneyTransfer = 0;
        boolean isCheck = false;
        while(!isCheck){
            moneyTransfer = sc.nextLong();
            long money = balance - moneyTransfer;

            if(!(balance >= 50000 && moneyTransfer >= 10000)){

            }else{
                 balance = money;
                 isCheck = true;
            }
        }
       return moneyTransfer;


    }

    private static String inputAccount() throws ValidateAccountException {
        System.out.println("Nhap so dien thaoi nguoi nhan:");
        String phoneNumber = sc.nextLine();
        String regex = "^[0-9]+$";
        if (!Pattern.matches(regex,phoneNumber)) throw new ValidateAccountException("Loi tai khoan");
        else {
            return phoneNumber;
        }
    }


}
