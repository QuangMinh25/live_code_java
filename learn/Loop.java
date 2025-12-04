package learn;

public class Loop {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        while (a < 10) {
            System.out.println(a);
            if (a == 8) {
                break;
            } else if (a == 9) {
                continue;
            }
            a++;
        }

        do {
            System.out.println(a);
            a++;
        }while (a < 10);

    }
}
