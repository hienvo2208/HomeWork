public class Scores {
    public static void classification(double scMath, double scLiterature, double scPhysics, double scChemistry) {
        double average = (scChemistry + scLiterature + scMath + scPhysics) / 4;
        if (average < 4.5) {
            System.out.println("Hạng yếu");
        } else if (average >= 4.5 && average < 6.5) {
            System.out.println("Hang Trung Binh");
        } else if (average >= 6.5 && average < 8) {
            System.out.println("Hang Kha");
        } else {
            System.out.println("Hang gioi");
        }
    }


}
