import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPrice = scanner.nextInt();
        int countSort = scanner.nextInt();
        int checkPrice = 0;
        for (int i = 0; i < countSort; i++) {
            //System.out.println("반복시작");
            int price = Integer.parseInt(scanner.next());
            int count = Integer.parseInt(scanner.next());
            //System.out.println("가격은" + price + "이고 갯수는" + count);
            checkPrice += price * count;
            //System.out.println("checkPrice = " + checkPrice);
        }
        if (checkPrice == totalPrice){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}