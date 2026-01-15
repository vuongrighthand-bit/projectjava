import java.util.Scanner;

public class bai3ss4 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Khởi tạo mảng
            System.out.print("Nhập kích thước mảng: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }

            // Sắp xếp mảng bằng Selection Sort (giảm dần)
            for (int i = 0; i < n - 1; i++) {
                int maxIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] > arr[maxIndex]) {
                        maxIndex = j;
                    }
                }
                // Hoán đổi
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[i];
                arr[i] = temp;
            }

            // Hiển thị mảng đã sắp xếp
            System.out.println("\nMảng sau khi sắp xếp giảm dần:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            // Nhập số cần tìm
            System.out.print("\nNhập số cần tìm: ");
            int target = sc.nextInt();

            // Tìm kiếm tuyến tính
            boolean foundLinear = false;
            for (int i = 0; i < n; i++) {
                if (arr[i] == target) {
                    foundLinear = true;
                    System.out.println("Tìm kiếm tuyến tính: tìm thấy tại vị trí " + i);
                    break;
                }
            }
            if (!foundLinear) {
                System.out.println("Tìm kiếm tuyến tính: không tìm thấy");
            }

            // Tìm kiếm nhị phân (trên mảng giảm dần)
            int left = 0, right = n - 1;
            boolean foundBinary = false;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (arr[mid] == target) {
                    foundBinary = true;
                    System.out.println("Tìm kiếm nhị phân: tìm thấy tại vị trí " + mid);
                    break;
                }
                // Vì mảng giảm dần nên điều kiện đảo ngược
                if (arr[mid] < target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if (!foundBinary) {
                System.out.println("Tìm kiếm nhị phân: không tìm thấy");
            }

            sc.close();
        }
    }


