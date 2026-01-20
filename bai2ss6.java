import java.util.Scanner;
import java.util.regex.Pattern;

public class bai2ss6 {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            StringBuilder users = new StringBuilder(); // lưu danh sách người dùng

            while (true) {
                System.out.println("\n===== MENU =====");
                System.out.println("1. Thêm người dùng");
                System.out.println("2. Hiển thị danh sách người dùng");
                System.out.println("3. Xóa toàn bộ người dùng");
                System.out.println("4. Thoát");
                System.out.print("Chọn chức năng: ");
                int choice = sc.nextInt();
                sc.nextLine(); // bỏ qua ký tự xuống dòng

                switch (choice) {
                    case 1:
                        // Nhập thông tin người dùng
                        System.out.print("Nhập username: ");
                        String username = sc.nextLine().trim();

                        System.out.print("Nhập email: ");
                        String email = sc.nextLine().trim();

                        System.out.print("Nhập mật khẩu: ");
                        String password = sc.nextLine().trim();

                        // Regex kiểm tra dữ liệu
                        String regexUsername = "^[A-Za-z0-9._]{3,20}$"; // username 3-20 ký tự
                        String regexEmail = "^[A-Za-z0-9._]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*\\.[A-Za-z]{2,6}$";
                        String regexPassword = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}$";

                        if (!Pattern.matches(regexUsername, username)) {
                            System.out.println("Username không hợp lệ (chỉ gồm chữ, số, ., _, từ 3-20 ký tự).");
                            break;
                        }
                        if (!Pattern.matches(regexEmail, email)) {
                            System.out.println("Email không hợp lệ.");
                            break;
                        }
                        if (!Pattern.matches(regexPassword, password)) {
                            System.out.println("Mật khẩu không hợp lệ (>=8 ký tự, có chữ hoa, số, ký tự đặc biệt).");
                            break;
                        }

                        // Lưu người dùng
                        users.append("Username: ").append(username)
                                .append(", Email: ").append(email)
                                .append(", Password: ").append(password)
                                .append("\n");

                        System.out.println("Thêm người dùng thành công!");
                        break;

                    case 2:
                        // Hiển thị danh sách
                        if (users.length() == 0) {
                            System.out.println("Chưa có người dùng nào.");
                        } else {
                            System.out.println("Danh sách người dùng:");
                            System.out.println(users.toString());
                        }
                        break;

                    case 3:
                        // Xóa toàn bộ người dùng
                        users = new StringBuilder(); // reset
                        System.out.println("Đã xóa toàn bộ người dùng.");
                        break;

                    case 4:
                        System.out.println("Kết thúc chương trình.");
                        sc.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Chức năng không hợp lệ, vui lòng chọn lại!");
                }
            }
        }
    }


