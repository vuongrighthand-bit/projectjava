import java.util.ArrayList;
import java.util.Scanner;

public class bai3ss3 {



    public class EmployeeSalaryManager {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Double> salaries = new ArrayList<>();

            while (true) {
                // Hiển thị menu
                System.out.println("\n===== MENU =====");
                System.out.println("1. Nhập lương nhân viên");
                System.out.println("2. Hiển thị thống kê");
                System.out.println("3. Tính tổng số tiền thưởng");
                System.out.println("4. Thoát chương trình");
                System.out.print("Chọn chức năng: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        // Nhập lương nhân viên
                        do {
                            System.out.print("Nhập lương nhân viên (0 - 500 triệu, nhập -1 để kết thúc): ");
                            double salary = sc.nextDouble();

                            if (salary == -1) {
                                break; // thoát vòng lặp nhập
                            }

                            if (salary < 0 || salary > 500_000_000) {
                                System.out.println("Lương không hợp lệ, vui lòng nhập lại!");
                                continue; // bỏ qua lần nhập sai
                            }

                            salaries.add(salary);

                            // Phân loại thu nhập
                            if (salary < 5_000_000) {
                                System.out.println("Thu nhập thấp");
                            } else if (salary < 15_000_000) {
                                System.out.println("Thu nhập trung bình");
                            } else if (salary < 50_000_000) {
                                System.out.println("Thu nhập khá");
                            } else {
                                System.out.println("Thu nhập cao");
                            }

                        } while (true);

                        // Thống kê sau khi nhập
                        if (!salaries.isEmpty()) {
                            double tong = 0;
                            double max = salaries.get(0);
                            double min = salaries.get(0);

                            // dùng for-each để duyệt
                            for (double s : salaries) {
                                tong += s;
                                if (s > max) max = s;
                                if (s < min) min = s;
                            }

                            System.out.println("Tổng số nhân viên đã nhập: " + salaries.size());
                            System.out.println("Tổng lương: " + tong);
                            System.out.println("Lương cao nhất: " + max);
                            System.out.println("Lương thấp nhất: " + min);
                        }
                        break;

                    case 2:
                        // Hiển thị thống kê
                        if (salaries.isEmpty()) {
                            System.out.println("Chưa có dữ liệu");
                        } else {
                            double tong = 0;
                            double max = salaries.get(0);
                            double min = salaries.get(0);

                            for (int i = 0; i < salaries.size(); i++) {
                                tong += salaries.get(i);
                                if (salaries.get(i) > max) max = salaries.get(i);
                                if (salaries.get(i) < min) min = salaries.get(i);
                            }

                            double avg = tong / salaries.size();

                            System.out.println("Số nhân viên đã nhập: " + salaries.size());
                            System.out.println("Lương trung bình: " + avg);
                            System.out.println("Lương cao nhất: " + max);
                            System.out.println("Lương thấp nhất: " + min);
                            System.out.println("Tổng tiền lương: " + tong);
                        }
                        break;

                    case 3:
                        // Tính tổng số tiền thưởng
                        if (salaries.isEmpty()) {
                            System.out.println("Chưa có dữ liệu");
                        } else {
                            double tongThuong = 0;

                            for (double s : salaries) {
                                double thuong = 0;
                                if (s < 5_000_000) {
                                    thuong = s * 0.05;
                                } else if (s < 15_000_000) {
                                    thuong = s * 0.10;
                                } else if (s < 50_000_000) {
                                    thuong = s * 0.15;
                                } else if (s <= 100_000_000) {
                                    thuong = s * 0.20;
                                } else {
                                    thuong = s * 0.25;
                                }
                                tongThuong += thuong;
                            }

                            System.out.println("Tổng số tiền thưởng cho nhân viên: " + tongThuong);
                        }
                        break;

                    case 4:
                        System.out.println("Kết thúc chương trình.");
                        sc.close();
                        System.exit(0); // thoát hẳn
                        break;

                    default:
                        System.out.println("Chức năng không hợp lệ, vui lòng chọn lại!");
                }
            }
        }
    }

}
