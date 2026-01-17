public class bai2ss5 {

        public static void main(String[] args) {
            int loopCount = 1_000_000;

            // Test với String
            long start = System.currentTimeMillis();
            String str = "Hello";
            for (int i = 0; i < loopCount; i++) {
                str = str + " World"; // tạo ra đối tượng mới mỗi lần nối
            }
            long end = System.currentTimeMillis();
            System.out.println("Thời gian với String: " + (end - start) + " ms");

            // Test với StringBuilder
            start = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder("Hello");
            for (int i = 0; i < loopCount; i++) {
                sb.append(" World"); // nối trực tiếp, không tạo đối tượng mới
            }
            end = System.currentTimeMillis();
            System.out.println("Thời gian với StringBuilder: " + (end - start) + " ms");

            // Test với StringBuffer
            start = System.currentTimeMillis();
            StringBuffer sbf = new StringBuffer("Hello");
            for (int i = 0; i < loopCount; i++) {
                sbf.append(" World"); // giống StringBuilder nhưng thread-safe
            }
            end = System.currentTimeMillis();
            System.out.println("Thời gian với StringBuffer: " + (end - start) + " ms");
        }
    }


