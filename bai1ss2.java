import java.util.Scanner;

public class bai1ss2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Nhập số nguyên dương N
            System.out.print("Nhập số nguyên dương N: ");
            int N = sc.nextInt();

            // Kiểm tra tính hợp lệ
            if (N <= 0) {
                System.out.println("Số nhập vào không hợp lệ");
            } else {
                int tong = 0;

                // Sử dụng vòng lặp for để cộng dồn từ 1 đến N
                for (int i = 1; i <= N; i++) {
                    tong += i; // cộng dồn
                }

                // In kết quả
                System.out.println("Tổng các số từ 1 đến " + N + " là: " + tong);
            }

            sc.close();
        }
    }


