import java.util.Scanner;

public class bai3ss1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu 1" + " ");
        float tu1 = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap mau 1" + " ");
        float mau1 = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap tu 2" + " ");
        float tu2 = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap mau 2" + " ");
        float mau2 = Float.parseFloat(sc.nextLine());
        float tong = ((tu1*mau2) + (tu2*mau1)) / (mau1*mau2);
        System.out.println("tong " + tong);
        sc.close();

    }
}
