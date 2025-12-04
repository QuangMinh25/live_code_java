package learn;

public class TypeCasting {
    public static void main(String[] args) {

        // ===== 1. Widening Casting (tự động) =====
        int intNum = 10;
        double doubleNum = intNum; // int tự ép thành double

        System.out.println("Widening Casting:");
        System.out.println("intNum = " + intNum);
        System.out.println("doubleNum = " + doubleNum);

        // ===== 2. Narrowing Casting (tường minh) =====
        double doubleValue = 9.78;
        int intValue = (int) doubleValue; // ép buộc double về int

        System.out.println("\nNarrowing Casting:");
        System.out.println("doubleValue = " + doubleValue);
        System.out.println("intValue = " + intValue);

        // ===== 3. Ép kiểu giữa char và int =====
        char c = 'A';
        int ascii = c; // tự động cast char sang int

        System.out.println("\nChar to int:");
        System.out.println("char = " + c);
        System.out.println("ASCII = " + ascii);

        int number = 66;
        char character = (char) number; // ép tường minh int sang char

        System.out.println("int to char:");
        System.out.println("number = " + number);
        System.out.println("character = " + character);

        // ===== 4. Ép kiểu giữa String và số =====
        String str = "123";
        int num = Integer.parseInt(str); // chuyển String thành int

        System.out.println("\nString to int:");
        System.out.println("str = " + str);
        System.out.println("num = " + num);

        int x = 456;
        String text = String.valueOf(x); // chuyển int sang String

        System.out.println("int to String:");
        System.out.println("x = " + x);
        System.out.println("text = " + text);
    }
}
