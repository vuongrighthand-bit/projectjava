import java.util.Scanner;

public class bai1ss5 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Nhập chuỗi email
            System.out.print("Nhập địa chỉ email: ");
            String email = sc.nextLine();

            // Loại bỏ khoảng trắng thừa ở đầu/cuối
            email = email.trim();

            // Biểu thức chính quy kiểm tra email hợp lệ
            // Username: chữ cái, số, ., _
            // Domain: chữ cái, số, có thể có dấu chấm
            // TLD: 2-6 ký tự chữ cái
            String regex = "^[A-Za-z0-9._]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*\\.[A-Za-z]{2,6}$";

            if (email.matches(regex)) {
                System.out.println("Email hợp lệ");
            } else {
                System.out.println("Email không hợp lệ");
            }

            sc.close();
        }
    }



