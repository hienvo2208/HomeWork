import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // ---------------------Bài 1-----------------------------
        System.out.println("Nhập kích thước mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        input(arr, n);
        System.out.println("========================");
        display(arr);
        System.out.println("========================");
        System.out.println("Phần tử nhỏ nhất: " + findMin(arr));
        // ---------------------Bài 1-----------------------------


        // ---------------------Bài 2-----------------------------

        Transport[] arrEx2 = inputEx2();
        displayEx2(arrEx2);

        // ---------------------Bài 2-----------------------------


    }

    // ---------------------Bài 1-----------------------------
    public static void input(int[] arr, int n) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]: ");
            arr[i] = scanner.nextInt();
        }
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // ---------------------Bài 1-----------------------------


    // ---------------------Bài 2, xuat nhap-----------------------------
    public static Transport[] inputEx2() {
        System.out.println("Nhap kich thuoc mang: ");
        int m = scanner.nextInt();
        Transport[] arr = new Transport[m];
        for (int i = 0; i < m; i++) {
            System.out.println("Nhap id phuong tien: ");
            long id = scanner.nextLong();
            scanner.nextLine();
            System.out.println("Nhập tên phương tiện:");
            String nameTran = scanner.nextLine();
            System.out.println("Nhập tốc độ toi da: ");
            double speed = scanner.nextDouble();
            arr[i] = new Transport(id, nameTran, speed);
        }
        return arr;
    }
    // ---------------------Bài 2, in du lieu-----------------------------


    // ---------------------Bài 2-----------------------------
    public static void displayEx2(Transport[] arr) {
        for (Transport i : arr) {
            System.out.println("Id: " + i.getId());
            System.out.println("Ten Phuong tien: " + i.getNameTrans());
            System.out.println("Toc do toi da: " + i.getSpeedMax());
        }
        System.out.println("=====================================");
    }
    // ---------------------Bài 2-----------------------------

}
