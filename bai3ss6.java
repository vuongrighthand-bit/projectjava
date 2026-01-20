import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class bai3ss6 {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Mảng lưu biển số xe
            ArrayList<String> plates = new ArrayList<>();

            while (true) {
                System.out.println("\n===== MENU =====");
                System.out.println("1. Nhập biển số xe");
                System.out.println("2. Hiển thị danh sách biển số xe");
                System.out.println("3. Sắp xếp biển số xe (tăng dần)");
                System.out.println("4. Tìm kiếm chính xác theo biển số xe");
                System.out.println("5. Tìm kiếm theo mã tỉnh");
                System.out.println("6. Xóa toàn bộ biển số");
                System.out.println("7. Thoát");
                System.out.print("Chọn chức năng: ");
                int choice = sc.nextInt();
                sc.nextLine(); // bỏ qua ký tự xuống dòng

                switch (choice) {
                    case 1:
                        System.out.print("Nhập biển số xe (VD: 30F-123.45): ");
                        String plate = sc.nextLine().trim();

                        // Regex kiểm tra định dạng biển số
                        String regex = "^[0-9]{2}[A-Z]-[0-9]{3}\\.[0-9]{2}$";
                        if (Pattern.matches(regex, plate)) {
                            plates.add(plate);
                            System.out.println("Thêm biển số thành công!");
                        } else {
                            System.out.println("Biển số không hợp lệ!");
                        }
                        break;

                    case 2:
                        if (plates.isEmpty()) {
                            System.out.println("Chưa có dữ liệu.");
                        } else {
                            System.out.println("Danh sách biển số xe:");
                            for (String p : plates) {
                                System.out.println(p);
                            }
                        }
                        break;

                    case 3:
                        // Sắp xếp tăng dần (Selection Sort)
                        for (int i = 0; i < plates.size() - 1; i++) {
                            int minIndex = i;
                            for (int j = i + 1; j < plates.size(); j++) {
                                if (plates.get(j).compareTo(plates.get(minIndex)) < 0) {
                                    minIndex = j;
                                }
                            }
                            String temp = plates.get(minIndex);
                            plates.set(minIndex, plates.get(i));
                            plates.set(i, temp);
                        }
                        System.out.println("Danh sách sau khi sắp xếp tăng dần:");
                        for (String p : plates) {
                            System.out.println(p);
                        }
                        break;

                    case 4:
                        System.out.print("Nhập biển số cần tìm: ");
                        String searchPlate = sc.nextLine().trim();
                        boolean found = false;
                        for (String p : plates) {
                            if (p.equals(searchPlate)) {
                                System.out.println("Tìm thấy biển số: " + p);
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Không tìm thấy biển số này.");
                        }
                        break;

                    case 5:
                        System.out.print("Nhập mã tỉnh (VD: 29, 30, 51, 16...): ");
                        String provinceCode = sc.nextLine().trim();
                        boolean foundProvince = false;
                        for (String p : plates) {
                            if (p.startsWith(provinceCode)) {
                                System.out.println("Biển số thuộc tỉnh " + provinceCode + ": " + p);
                                foundProvince = true;
                            }
                        }
                        if (!foundProvince) {
                            System.out.println("Không tìm thấy biển số nào thuộc mã tỉnh này.");
                        }
                        break;

                    case 6:
                        plates = new ArrayList<>();
                        System.out.println("Đã xóa toàn bộ biển số.");
                        break;

                    case 7:
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


