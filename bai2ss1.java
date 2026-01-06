import java.util.Scanner;

public class bai2ss1 {
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so thu 1" + " ");
        int firstNumber = sc.nextInt();
        System.out.println("nhap so thu 2" + " ");
        int secondNumber = sc.nextInt();

        int tong = firstNumber + secondNumber;
        int hieu = firstNumber - secondNumber;
        int thuong = firstNumber / secondNumber;
        int tich = firstNumber * secondNumber;

        System.out.println(" tổng =" + tong);
        System.out.println(" hieu  = " + hieu);
        System.out.println(" thuong = " + thuong);
        System.out.println("tich = " + tich);
        sc.close();
    }


}
