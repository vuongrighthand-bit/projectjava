import java.util.Scanner;

public class bai3ss5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Nhập mật khẩu
            System.out.print("Nhập mật khẩu cần kiểm tra: ");
            String password = sc.nextLine();

            // Kiểm tra tính hợp lệ
            if (isValidPassword(password)) {
                System.out.println("Mật khẩu hợp lệ");
            } else {
                System.out.println("Mật khẩu không hợp lệ");
            }

            sc.close();
        }

        // Hàm kiểm tra mật khẩu hợp lệ
        public static boolean isValidPassword(String password) {
            // Ví dụ tiêu chí kiểm tra:
            // - Độ dài >= 8 ký tự
            // - Có ít nhất 1 chữ cái viết hoa
            // - Có ít nhất 1 chữ số
            // - Có ít nhất 1 ký tự đặc biệt

            if (password.length() < 8) return false;

            boolean hasUpper = false;
            boolean hasDigit = false;
            boolean hasSpecial = false;

            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) hasUpper = true;
                else if (Character.isDigit(c)) hasDigit = true;
                else if (!Character.isLetterOrDigit(c)) hasSpecial = true;
            }

            return hasUpper && hasDigit && hasSpecial;
        }
    }


