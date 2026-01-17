import java.util.Random;
import java.util.Scanner;

public class bai4ss5 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Nhập độ dài chuỗi
            System.out.print("Nhập độ dài chuỗi n: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Độ dài chuỗi phải lớn hơn 0");
                return;
            }

            // Tập ký tự cho phép: chữ hoa, chữ thường, số
            String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

            // Dùng StringBuilder để nối chuỗi hiệu quả
            StringBuilder sb = new StringBuilder(n);
            Random rand = new Random();

            for (int i = 0; i < n; i++) {
                int index = rand.nextInt(chars.length()); // chọn ngẫu nhiên vị trí trong chars
                sb.append(chars.charAt(index));
            }

            // In kết quả
            System.out.println("Chuỗi ngẫu nhiên: " + sb.toString());

            sc.close();
        }
    }


