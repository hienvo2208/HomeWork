import  java.util.Scanner;
public class Main {
    public static Scanner scanner  = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("------------MENU--------------");
        System.out.println("EX1- Nhập :1");
        System.out.println("EX2- Nhập :2");
        System.out.println("EX1- Nhập :3");
        System.out.println("Nhap lua chon: ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                    Ex1();
            break;
            case 2:
                Ex2();
                break;
            case 3:
                Ex3();
                break;
            default:
                System.out.println("Nhập lại: ");
                choice = scanner.nextInt();

        }


    }
    public static void Ex1(){
        System.out.println("Nhập ba cạnh của tam giác: ");
        System.out.println("a:");
        int a = scanner.nextInt();
        System.out.println("b:");
        int b = scanner.nextInt();
        System.out.println("c:");
        int c = scanner.nextInt();
        Triangle.checkTriangle(a,b,c);
    }
    public static void Ex2(){
        System.out.println("Toán: ");
        double scMath = scanner.nextDouble();
        System.out.println("Văn:");
        double scLiterature = scanner.nextDouble();
        System.out.println("Lý: ");
        double scPhysics = scanner.nextDouble();
        System.out.println("Hóa");
        double scChemistry = scanner.nextDouble();
        Scores.classification(scMath,scLiterature,scPhysics,scChemistry);
    }
    public static void Ex3(){
        System.out.println("a:");
        float a = scanner.nextFloat();
        System.out.println("b:");
        float b = scanner.nextFloat();
        System.out.println("c:");
        float c = scanner.nextFloat();
        Quadratic.solve(a,b,c);
    }
}
