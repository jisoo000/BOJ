import java.util.Scanner;

public class Main {

    static int gcd(int a, int b){ //최대공약수 구하는 알고리즘
        while (b!= 0){
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int treesN = scanner.nextInt();
        int[] treeLoc = new int[treesN];
        int[] spaceArr = new int[treesN-1];

        for (int i = 0; i < treeLoc.length; i++) {
            treeLoc[i] = scanner.nextInt();
        }

        for (int i = 0; i < spaceArr.length; i++) {
            spaceArr[i] = treeLoc[i+1]-treeLoc[i];
        }

        int gcd = spaceArr[0]; //나무들간 거리
        for (int i = 0; i < spaceArr.length-1; i++) {
            gcd = gcd(gcd,spaceArr[i+1]);
        }

        int totalDist = treeLoc[treeLoc.length-1] - treeLoc[0];
        int totalTrees = totalDist / gcd + 1;

        int needTrees = totalTrees - treesN;

        System.out.println(needTrees);
    }
}
