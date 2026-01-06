import java.util.Scanner;

public class bai1ss1 {
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn " + " ");
        double R = sc.nextDouble();
        double s = 3.14 * Math.pow(R, 2);
        System.out.println(" dien tich hinh tron = " + s );
        sc.close();
    }
}
