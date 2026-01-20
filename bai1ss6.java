import java.util.Scanner;

public class bai1ss6 {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Nhập số lượng sinh viên: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Mảng không có phần tử");
                return;
            }

            int[] scores = new int[n];

            // Nhập điểm sinh viên
            for (int i = 0; i < n; i++) {
                System.out.print("Nhập điểm sinh viên thứ " + (i + 1) + ": ");
                scores[i] = sc.nextInt();
            }

            while (true) {
                // Menu lựa chọn
                System.out.println("\n===== MENU =====");
                System.out.println("1. Hiển thị danh sách điểm");
                System.out.println("2. Sắp xếp tăng dần (Selection Sort)");
                System.out.println("3. Sắp xếp giảm dần (Bubble Sort)");
                System.out.println("4. Tìm kiếm tuyến tính");
                System.out.println("5. Tìm kiếm nhị phân (trên mảng đã sắp xếp)");
                System.out.println("6. Thoát");
                System.out.print("Chọn chức năng: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        // Hiển thị mảng
                        System.out.println("Danh sách điểm:");
                        for (int s : scores) {
                            System.out.print(s + " ");
                        }
                        System.out.println();
                        break;

                    case 2:
                        // Selection Sort tăng dần
                        for (int i = 0; i < n - 1; i++) {
                            int minIndex = i;
                            for (int j = i + 1; j < n; j++) {
                                if (scores[j] < scores[minIndex]) {
                                    minIndex = j;
                                }
                            }
                            int temp = scores[minIndex];
                            scores[minIndex] = scores[i];
                            scores[i] = temp;
                        }
                        System.out.println("Mảng sau khi sắp xếp tăng dần:");
                        for (int s : scores) {
                            System.out.print(s + " ");
                        }
                        System.out.println();
                        break;

                    case 3:
                        // Bubble Sort giảm dần
                        for (int i = 0; i < n - 1; i++) {
                            for (int j = 0; j < n - i - 1; j++) {
                                if (scores[j] < scores[j + 1]) {
                                    int temp = scores[j];
                                    scores[j] = scores[j + 1];
                                    scores[j + 1] = temp;
                                }
                            }
                        }
                        System.out.println("Mảng sau khi sắp xếp giảm dần:");
                        for (int s : scores) {
                            System.out.print(s + " ");
                        }
                        System.out.println();
                        break;

                    case 4:
                        // Tìm kiếm tuyến tính
                        System.out.print("Nhập điểm cần tìm: ");
                        int targetLinear = sc.nextInt();
                        boolean foundLinear = false;
                        for (int i = 0; i < n; i++) {
                            if (scores[i] == targetLinear) {
                                System.out.println("Tìm thấy tại vị trí: " + i);
                                foundLinear = true;
                                break;
                            }
                        }
                        if (!foundLinear) {
                            System.out.println("Không tìm thấy điểm này.");
                        }
                        break;

                    case 5:
                        // Tìm kiếm nhị phân (giả sử mảng đã sắp xếp tăng dần)
                        System.out.print("Nhập điểm cần tìm: ");
                        int targetBinary = sc.nextInt();
                        int left = 0, right = n - 1;
                        boolean foundBinary = false;
                        while (left <= right) {
                            int mid = (left + right) / 2;
                            if (scores[mid] == targetBinary) {
                                System.out.println("Tìm thấy tại vị trí: " + mid);
                                foundBinary = true;
                                break;
                            } else if (scores[mid] < targetBinary) {
                                left = mid + 1;
                            } else {
                                right = mid - 1;
                            }
                        }
                        if (!foundBinary) {
                            System.out.println("Không tìm thấy điểm này.");
                        }
                        break;

                    case 6:
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


