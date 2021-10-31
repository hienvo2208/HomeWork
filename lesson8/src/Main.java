import java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        StudentTech[] arrayStu = inputStudent();
        display(arrayStu);


    }
    public static StudentTech[] inputStudent(){
        System.out.println("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        StudentTech[] arr = new StudentTech[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Nhap id: ");
            long id = scanner.nextLong();
            scanner.nextLine();
            System.out.println("Nhap ten: ");
            String name = scanner.nextLine();
            System.out.println("Nhap diem ly thuyet: ");
            double theorePoint = scanner.nextDouble();
            System.out.println("Nhap diem thuc hanh: ");
            double practicePotin = scanner.nextDouble();;
            arr[i] = new StudentTech(id,name,theorePoint,practicePotin);
        }
        return arr;
    }

    public static void display(StudentTech[] arr){
        for(StudentTech i : arr){
            System.out.println("==================================");
            System.out.println("Id: "+i.getId());
            System.out.println("Ten: "+i.getName());
            System.out.println("Diem ly thuyet: "+i.getTheorePoint());
            System.out.println("Diem thuc hanh: "+i.getPracticePotin());
            System.out.println("Diem trung binh: "+i.scoreAve());
            System.out.println("===================================");
        }
    }
}
