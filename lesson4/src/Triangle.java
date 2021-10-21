public class Triangle {
    public static void checkTriangle(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Tam giac khong hop le. Xin kiem tra lai !");
        } else {
            if ((a == b) && (b == c)) {
                System.out.println("Day la tam giac deu");
            } else {
                if (a * a + b * b == c * c || a * c + c * c == b * b || b * b + c * c == a * c) {
                    System.out.println("Tam giac vuong");
                } else if (a == b || a == c || b == c) {
                    System.out.println("Tam giac Can");
                } else {
                    System.out.println("Tam giac thuong");
                }
            }
        }
    }
}
