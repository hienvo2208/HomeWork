import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*----------Ex1---------------*/
        Random random = new Random();
        int x = random.nextInt(101); // [0,100]
        Boolean check = NumInteger.parityCheck(x);
        String resultEx1 = (check==true)? "Là số chẵn ":"Là số lẻ";
        System.out.println("Sỗ x là: "+x);
        System.out.println(resultEx1);
        /*----------Ex1---------------*/

        /*----------Ex2---------------*/
        System.out.println("Cạnh huyền của tam giác: "+RightTriangle.hypotenuse());
        /*----------Ex2---------------*/

        /*----------Ex3---------------*/
        bai3();
        /*----------Ex3---------------*/

    }

    public static void bai3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap x:");
        int X = scanner.nextInt();
        System.out.println("Nhap y:");
        int Y = scanner.nextInt();
        System.out.printf("\n%d + %d = %d",X,Y,X+Y);
        System.out.printf("\n%d - %d = %d",X,Y,X-Y);
        System.out.printf("\n%d * %d = %d",X,Y,X*Y);
        System.out.printf("\n%d / %d = %.2f",X,Y,(double)X/Y);
    }
}
