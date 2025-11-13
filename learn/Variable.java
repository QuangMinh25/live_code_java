package learn;

public class Variable {

    // Biến toàn cục (instance variable)
    String language = "Java";
    static String school = "IUH"; // biến static (dùng chung cho tất cả đối tượng)

    public static void main(String[] args) {

        // ===== 1. Biến cục bộ (local variable) =====
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Tổng a + b = " + c);

        // ===== 2. Biến kiểu dữ liệu cơ bản (primitive types) =====
        byte by = 100;
        short sh = 20000;
        int in = 100000;
        long lo = 1234567890L;

        float fl = 10.5f;
        double db = 99.99;

        char ch = 'A';
        boolean isJavaFun = true;

        System.out.println("\n===== Kiểu dữ liệu cơ bản =====");
        System.out.println("byte: " + by);
        System.out.println("short: " + sh);
        System.out.println("int: " + in);
        System.out.println("long: " + lo);
        System.out.println("float: " + fl);
        System.out.println("double: " + db);
        System.out.println("char: " + ch);
        System.out.println("boolean: " + isJavaFun);

        // ===== 3. Biến kiểu tham chiếu (reference types) =====
        String name = "Minh";
        int age = 25;
        System.out.println("\n===== Kiểu tham chiếu =====");
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);

        // ===== 4. Hằng số (constant variable) =====
        final double PI = 3.14159;
        System.out.println("\n===== Hằng số =====");
        System.out.println("Giá trị của PI: " + PI);

        // ===== 5. Gọi biến static và tạo đối tượng để gọi biến instance =====
        System.out.println("\n===== Biến toàn cục và static =====");
        System.out.println("Trường học: " + Variable.school);

        Variable v = new Variable(); // tạo object để dùng biến instance
        System.out.println("Ngôn ngữ: " + v.language);

        // ===== 6. Một ví dụ nhỏ kết hợp =====
        System.out.println("\n===== Kết hợp các biến =====");
        String message = "Xin chào, tôi là " + name + ", " + age + " tuổi, đang học " + v.language;
        System.out.println(message);
    }
}
