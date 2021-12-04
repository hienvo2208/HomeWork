package controller;

import dao.Repository;
import model.User;
import views.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    //Một số phương thức phải sử dụng while để duy trì luồng.
    private static String username;
    private static String password;
    static ArrayList<User> users = Repository.getData();
    public static Scanner sc = new Scanner(System.in);

    public static void mainMenu() {
        Menu.mainMenu();
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                login();
                break;
        }
    }

    private static void createNewAccount() {
        String newUsername;
        String newPassword;
        String newEmail;
        try {

            System.out.println("Nhap ten dang nhap moi. ");
            newUsername = sc.nextLine();
            System.out.println("Nhap password moi");
            newPassword = Validate.validatePassword(sc.nextLine());
            System.out.println("Nhap email moi vao:");
            newEmail = Validate.validateEmail(sc.nextLine());
            for (User i : users) {
                if (newUsername.equals(i.getUsername())) {
                    throw new RuntimeException("Ten dang nhap ton tai.");
                } else {
                    users.add(new User(users.size() + 1, newUsername, newEmail, newPassword));
                }
            }

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
    private static void login() {
        boolean isCheck = false;
        while (!isCheck) {
            System.out.println("Ten dang nhap: ");
            username = sc.nextLine();
            int count = 0;
            for (User i : users) {
                if ((i.getUsername()).equals(username)) {
                    count++;
                    System.out.println("password: ");
                    password = sc.nextLine();
                    if ((i.getPassword()).equals(password)) {
                        loginSuccess();
                        isCheck = true;
                    } else {
                        loginFail();
                        break;
                    }
                }
            }
            if (count == 0) {
                System.out.println("Check lai ten dang nhap");
            }
        }
    }

    private static void loginFail() {
        Menu.loginFail();
        int choose = sc.nextInt();
        sc.nextLine();
        switch (choose) {
            case 1:
                System.out.println("Đăng nhập lại: ");
                login();
                break;
            case 2:
                forgotPassword();
                break;
        }
    }

    private static void forgotPassword() {
        String inputEmail;
        String inputUsername;
        boolean isCheck = true;
        try{
            System.out.println("Nhap email: ");
            inputEmail = Validate.validateEmail(sc.nextLine());
            System.out.println("Nhap username");
            inputUsername = sc.nextLine();
            for(User i: users){
                if(inputEmail.equals(i.getEmail()) && inputUsername.equals(i.getUsername())){
                    System.out.println("Nhap password moi");
                    i.setPassword(Validate.validatePassword(sc.nextLine()));
                    isCheck = true;
                }else{
                    throw new RuntimeException("Email va user khong toi tai. ");
                }
            }

        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

    }

    public static void loginSuccess() {
        System.out.println("Chào mừng " + username + ", bạn có thể thực hiện các công việc sau: ");
        Menu.loginSuccess();
        int choose = sc.nextInt();
        sc.nextLine();
        switch (choose) {
            case 1:
                changeUsername();
                break;
            case 2:
                changeEmail();
                break;
            case 3:
                changePassword();
                break;
            case 4:
                home();
                break;

            default:
                break;
        }
    }

    private static void home() {
        int choose = sc.nextInt();
        sc.nextLine();
        switch (choose) {
            case 1:
                // Đăng nhập
                login();
                break;
            case 2:
                // Đăng ký
                createNewAccount();
                break;
            default:
                break;
        }
    }

    private static void changePassword() {
        int count = 0;
        try {
            System.out.println("Nhap password cu: ");
            String oldPassword = sc.nextLine();

            if (oldPassword.equals(password)) { // so sanh mat khau cu.
                count++;
                System.out.println("Nhap mat khau moi: ");
                String newPassword = Validate.validatePassword(sc.nextLine()); // kiem tra password hop le khong
                password = newPassword;
            }
        } catch (RuntimeException e) {
            e.getMessage();
        }
        if (count == 0) {
            System.out.println("Nhap sai mat khau.");
        }

    }

    private static void changeEmail() {
        boolean isCheck = false;
        String newEmail;
        try {
            System.out.println("Nhap email moi : ");
            newEmail = Validate.validateEmail(sc.nextLine());
            for (User i : users) {
                if (username.equals(i.getUsername())) {
                    if (!newEmail.equals(i.getEmail())) {
                        i.setEmail(newEmail);
                        System.out.println("doi email thanh cong");
                        isCheck = true;
                    } else {
                        throw new RuntimeException("Doi email khong thanh cong");
                    }
                }
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage() + "Email khong hop le");
        }
    }

    private static void changeUsername() {
        boolean isCheck = false;
        while (!isCheck) {
            try {
                System.out.println("Nhap username moi: ");
                String newUsername = sc.nextLine();
                for (User i : users) {
                    if ((username.equals(i.getUsername()))) {
                        if (!newUsername.equals(i.getUsername())) {
                            i.setUsername(newUsername);
                            System.out.println("Thay đổi email thành công.");
                            isCheck = true;
                        } else {
                            throw new RuntimeException("Email da ton tai");
                        }
                    }
                }

            } catch (RuntimeException e) {
                System.out.println(e.getMessage() + ", Username da ton tai.");
            }
        }
        loginSuccess();
    }



}