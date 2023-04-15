import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader 버퍼리더 = new BufferedReader(new InputStreamReader(System.in));
        int 검은영역 = 0;  
        int 색종이갯수 = Integer.parseInt(버퍼리더.readLine());  
        boolean[][] 도화지 = new boolean[101][101];  //도화지
        for (int i = 0; i < 색종이갯수; i++) {
            StringTokenizer 토크나이저 = new StringTokenizer(버퍼리더.readLine());
            int 토큰1 = Integer.parseInt(토크나이저.nextToken());
            int 토큰2 = Integer.parseInt(토크나이저.nextToken());
            for (int j = 토큰1; j < 토큰1+10; j++) {
                for (int k = 토큰2; k < 토큰2+10; k++) {
                    if (!도화지[j][k]) {
                        도화지[j][k] = true;
                        검은영역++;
                    }
                }
            }
        }
        System.out.print(검은영역);
    }
}