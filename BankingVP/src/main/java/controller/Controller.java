package controller;

import dao.Repository;
import model.User;
import view.Menu;

import java.util.List;
import java.util.Scanner;

public class Controller {
    String username;
    String password;
    Repository repository = new Repository();
    List<User> users = repository.getData();
    Scanner scanner = new Scanner(System.in);

    public void login() {
        boolean checkLogin = false;
        while (!checkLogin) {
            System.out.println("input username: ");
            username = scanner.nextLine();
            int count = 0;
            for (User i : users) {
                if (username.equals(i.getUsername())) {
                    count++;
                    System.out.println("Input password:");
                    password = scanner.nextLine();
                    if ((i.getPassword()).equals(password)) {
                        loginSuccess();
                        checkLogin = true;
                    } else {
                        loginFail();
                        break;
                    }

                }
            }
            if (count == 0) {
                System.out.println("Kiem tra lai ten dang nhap.");
            }
        }
    }

    public void Home() {
        Menu.mainMenu();
        System.out.println("Nhap lua chon:");
        int chose = scanner.nextInt();
        boolean flag = true;
        while (flag) {
            switch (chose) {
                case 1:
                    login();
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    chose = scanner.nextInt();
            }

        }

    }

    private void loginFail() {
        System.out.println("that bai");
    }

    private void loginSuccess() {

    }

}
