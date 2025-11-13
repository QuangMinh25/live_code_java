package learn;

public class Operator {
    public static void main(String[] args) {

        System.out.println("===== 1. TOÁN TỬ SỐ HỌC (Arithmetic) =====");
        int a = 10, b = 3;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b)); // 13
        System.out.println("a - b = " + (a - b)); // 7
        System.out.println("a * b = " + (a * b)); // 30
        System.out.println("a / b = " + (a / b)); // 3 (int division)
        System.out.println("a % b = " + (a % b)); // 1
        System.out.println("++a = " + (++a));     // 11 (tăng trước)
        System.out.println("b++ = " + (b++));     // 3 (dùng rồi tăng)
        System.out.println("b sau khi tăng = " + b); // 4
        System.out.println("--a = " + (--a));     // 10
        System.out.println("a-- = " + (a--));     // 10 (dùng rồi giảm)
        System.out.println("a sau khi giảm = " + a); // 9

        System.out.println("\n===== 2. TOÁN TỬ GÁN (Assignment) =====");
        int x = 5;
        System.out.println("x ban đầu = " + x);
        x += 3; // x = x + 3
        System.out.println("x += 3 → " + x);
        x -= 2; // x = x - 2
        System.out.println("x -= 2 → " + x);
        x *= 4; // x = x * 4
        System.out.println("x *= 4 → " + x);
        x /= 3; // x = x / 3
        System.out.println("x /= 3 → " + x);
        x %= 2; // x = x % 2
        System.out.println("x %= 2 → " + x);

        System.out.println("\n===== 3. TOÁN TỬ SO SÁNH (Relational) =====");
        int c = 8, d = 5;
        System.out.println("c = " + c + ", d = " + d);
        System.out.println("c == d → " + (c == d));
        System.out.println("c != d → " + (c != d));
        System.out.println("c > d → " + (c > d));
        System.out.println("c < d → " + (c < d));
        System.out.println("c >= d → " + (c >= d));
        System.out.println("c <= d → " + (c <= d));

        System.out.println("\n===== 4. TOÁN TỬ LOGIC (Logical) =====");
        boolean p = true, q = false;
        System.out.println("p = " + p + ", q = " + q);
        System.out.println("p && q → " + (p && q)); // false
        System.out.println("p || q → " + (p || q)); // true
        System.out.println("!p → " + (!p));         // false
        System.out.println("!q → " + (!q));         // true

        System.out.println("\n===== 5. TOÁN TỬ BIT (Bitwise) =====");
        int m = 5, n = 3; // 5 = 0101, 3 = 0011
        System.out.println("m = " + m + ", n = " + n);
        System.out.println("m & n = " + (m & n));   // 1
        System.out.println("m | n = " + (m | n));   // 7
        System.out.println("m ^ n = " + (m ^ n));   // 6
        System.out.println("~m = " + (~m));         // -6
        System.out.println("m << 1 = " + (m << 1)); // 10
        System.out.println("m >> 1 = " + (m >> 1)); // 2
        System.out.println("m >>> 1 = " + (m >>> 1)); // 2

        System.out.println("\n===== 6. TOÁN TỬ ĐIỀU KIỆN 3 NGÔI (Ternary) =====");
        int age = 20;
        String result = (age >= 18) ? "Đủ tuổi" : "Chưa đủ tuổi";
        System.out.println("age = " + age + " → " + result);

        System.out.println("\n===== 7. TOÁN TỬ INSTANCEOF =====");
        String str = "Java";
        Integer num = 123;
        System.out.println("str instanceof String → " + (str instanceof String));
        System.out.println("num instanceof Number → " + (num instanceof Number));

        System.out.println("\n===== 8. TOÁN TỬ NỐI CHUỖI (String Concatenation) =====");
        String firstName = "Bui";
        String lastName = "Minh";
        String fullName = firstName + " " + lastName;
        System.out.println("fullName = " + fullName);
        System.out.println("Chào " + fullName + ", bạn đã học Java!");
    }
}
