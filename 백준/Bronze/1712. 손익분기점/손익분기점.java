import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputs = scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(inputs);
        String[] tokenArray = new String[tokenizer.countTokens()];
        int i = 0;
        while (tokenizer.hasMoreTokens()==true) {
            tokenArray[i] = tokenizer.nextToken();
            i++;
        }

        int a = Integer.parseInt(tokenArray[0]);
        int b = Integer.parseInt(tokenArray[1]);
        int c = Integer.parseInt(tokenArray[2]);
        int 손익분기점 = -1;

        if (b-c==0 || (-a/(b-c)) + 1 <=0) {
            손익분기점 = -1;
        }else{
            손익분기점 = (-a/(b-c)) + 1;
        }

        System.out.println(손익분기점);


    }
}