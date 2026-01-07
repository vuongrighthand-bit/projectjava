import java.util.Scanner;

public class bai4ss1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai " + " ");
        int dai = Integer.parseInt(sc.nextLine());
        System.out.println("nhap chieu rong " + " ");
        int rong = Integer.parseInt(sc.nextLine());
        int chuVi= (dai + rong) * 2;
        int dienTich = dai * rong;
        System.out.println("chu vi = " + chuVi);
        System.out.println("dien tich = " + dienTich);
    }
}
