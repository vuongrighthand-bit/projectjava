import java.util.ArrayList;
import java.util.Scanner;

public class bai2ss3 {


    public class StudentScores {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> scores = new ArrayList<>();

            while (true) {
                // Hiển thị menu
                System.out.println("\n===== MENU =====");
                System.out.println("1. Nhập điểm học viên");
                System.out.println("2. Hiển thị thống kê");
                System.out.println("3. Thoát chương trình");
                System.out.print("Chọn chức năng: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        // Nhập điểm học viên
                        do {
                            System.out.print("Nhập điểm học viên (0-10, nhập -1 để kết thúc): ");
                            int score = sc.nextInt();

                            if (score == -1) {
                                break; // thoát vòng lặp nhập
                            }

                            if (score < 0 || score > 10) {
                                System.out.println("Điểm không hợp lệ, vui lòng nhập lại!");
                                continue; // bỏ qua lần nhập sai
                            }

                            scores.add(score);

                            // Xếp loại học lực
                            if (score < 5) {
                                System.out.println("Xếp loại: Yếu");
                            } else if (score < 7) {
                                System.out.println("Xếp loại: Trung Bình");
                            } else if (score < 8) {
                                System.out.println("Xếp loại: Khá");
                            } else if (score < 9) {
                                System.out.println("Xếp loại: Giỏi");
                            } else {
                                System.out.println("Xếp loại: Xuất sắc");
                            }

                        } while (true);

                        // Thống kê sau khi nhập
                        if (!scores.isEmpty()) {
                            int tong = 0;
                            int max = scores.get(0);
                            int min = scores.get(0);

                            // dùng for-each để duyệt
                            for (int s : scores) {
                                tong += s;
                                if (s > max) max = s;
                                if (s < min) min = s;
                            }

                            System.out.println("Tổng số học viên đã nhập: " + scores.size());
                            System.out.println("Tổng điểm: " + tong);
                            System.out.println("Điểm cao nhất: " + max);
                            System.out.println("Điểm thấp nhất: " + min);
                        }
                        break;

                    case 2:
                        // Hiển thị thống kê
                        if (scores.isEmpty()) {
                            System.out.println("Chưa có dữ liệu");
                        } else {
                            int tong = 0;
                            int max = scores.get(0);
                            int min = scores.get(0);

                            for (int i = 0; i < scores.size(); i++) {
                                tong += scores.get(i);
                                if (scores.get(i) > max) max = scores.get(i);
                                if (scores.get(i) < min) min = scores.get(i);
                            }

                            double avg = (double) tong / scores.size();

                            System.out.println("Số học viên đã nhập: " + scores.size());
                            System.out.println("Điểm trung bình: " + avg);
                            System.out.println("Điểm cao nhất: " + max);
                            System.out.println("Điểm thấp nhất: " + min);
                        }
                        break;

                    case 3:
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
