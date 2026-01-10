import java.util.Scanner;

public class bai2ss2 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Nhập số nguyên N
            System.out.print("Nhập số nguyên N: ");
            int N = sc.nextInt();

            // Nếu số âm thì chuyển thành số dương
            if (N < 0) {
                N = Math.abs(N);
            }

            int tong = 0;
            int temp = N;

            // Sử dụng vòng lặp để tách từng chữ số
            while (temp > 0) {
                int digit = temp % 10;   // lấy chữ số cuối
                tong += digit;           // cộng vào tổng
                temp /= 10;              // bỏ chữ số cuối
            }

            // In kết quả
            System.out.println("Tổng các chữ số của " + N + " là: " + tong);

            sc.close();
        }
    }


