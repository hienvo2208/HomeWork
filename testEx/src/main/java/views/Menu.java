package views;

public class Menu {
    public static void mainMenu(){
        System.out.println("1  Đăng nhập");
        System.out.println("2  Đăng ký");
    }
    public static void loginSuccess(){
        System.out.println("  Thay đổi username");
        System.out.println("  Thay đổi email");
        System.out.println("  Đăng xuất");
        System.out.println("  Thoát chương trình");
        System.out.println("  Lựa chọn của bạn là: ");
        System.out.println("  Thay đổi mật khẩu");

    }
    
    public static void loginFail(){
        System.out.println("Tài khoản hoặc mật khẩu nhập không đúng:  ");
        System.out.println("1 Đăng nhập");
        System.out.println("2 Quên mật khẩu");
        System.out.println("Lựa chọn của bạn là: ");
    }


}
