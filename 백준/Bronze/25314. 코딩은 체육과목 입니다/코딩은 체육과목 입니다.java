import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int a = input/4;
        for (int i = 0; i < a; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}