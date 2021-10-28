import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        String s ="Vo Duc Hien";
//        if(ispalindrome(s)){
//            System.out.println("ispalindrone");
//        }else{
//            System.out.println("it is not ispalindrone");
//        }
//        display10thPrime();

        ex1();
    }

    public static boolean ispalindrome(String s) {
        int st = 0;
        int end = s.length() - 1;
        while (end > st) {
            if ((s.charAt(st++)) != (s.charAt(end--))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void display10thPrime() {
        int count = 0;
        int i = 0;
        while (count < 10) {
            if (isPrime(i)) {
                System.out.println(i + " ");
                count++;
            }
            i++;
        }
    }

    public static void displayNhoHon10() {
        for (int i = 0; i < 10; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void ex1() {
        int colum = 4;
        int row = 4;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("=============================");
        for (int i = 1; i <= row; i++) {
            for (int j = i; j < row; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println("=============================");
        for (int i = 0; i < colum; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public static void ex4(String s) {
        String[] arr = s.split(" ");
        System.out.println("so tu : " + arr.length);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i)) == 'o') {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void ex5() {
        Random random = new Random();
        int x = random.nextInt();
        if (isPrime(x)) {
            System.out.println("La so nguyen to");
        } else {
            System.out.println("khong la so nguyen to");
        }
    }

    public static void ex6() {
        String regex = "^\\w+[a-z0-9]*@\\w+mail.com$";
        System.out.println("Nhap email cua ban: ");
        String email = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            System.out.println("Hop le");
        } else {
            System.out.println("khong hop le");
        }
    }


    public static void ex7() {
        int n, m;
        System.out.println("n: ");
        n = scanner.nextInt();
        System.out.println("m");
        m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("arr[" + i + "][" + j + "]:");
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Tren duong cheo chinh la: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

    }


}
