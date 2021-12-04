import controller.Controller;
import service.Service;
import view.Menu;

import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) {
        Service.login();
        Menu.mainMenu();
        Service.mainMenu();

    }
}
