public class Main {
    public static void main(String[] args) {
        Ex1();
        System.out.println("=========================");
        Ex2();
        System.out.println("=========================");
        Ex3();
    }

    /*-------------------Ex1------------------*/
    public static void Ex1() {
        String str1 = "Hello every one";
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if ((str1.charAt(i)) == 'e') {
                count++;
            }
        }
        System.out.println("So lan xuat hien cua ky tu e: " + count);
        for (int i = 0; i < count; i++) {
            System.out.println("Vi tri:" + i);
        }

    }

    /*-------------------Ex1------------------*/


    /*-------------------Ex2------------------*/
    public static void Ex2() {
        String s = "Võ Đức Hiển";
        double position = (double) (HandString.find("Võ Đức Hiển", "Hiển"));
        System.out.println(position);
    }


    /*-------------------Ex2------------------*/


    /*-------------------Ex3------------------*/
    public static void Ex3() {
        String s = "Không có gì quý hơn độc lập tự do";
        System.out.println(HandString.longestWord(s));

    }
    /*-------------------Ex3------------------*/


}
