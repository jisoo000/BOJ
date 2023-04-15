import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int 약수갯수 = Integer.parseInt(scanner.nextLine());

        String 약수들 = scanner.nextLine();
        int 약수집합[] = new int[약수갯수];
        StringTokenizer 토크나이저 = new StringTokenizer(약수들);

        for (int i = 0; i < 약수갯수; i++) {
            약수집합[i] = Integer.parseInt(토크나이저.nextToken());
        }

        int 최댓값 = 0;
        int 최솟값 = 2000000;

        for (int i= 0; i< 약수갯수; i++){
            if (약수집합[i]>최댓값)
                최댓값 = 약수집합[i];
            if (약수집합[i]<최솟값)
                최솟값 = 약수집합[i];
        }

        System.out.println(최댓값*최솟값);


    }
}