import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] arrString = new String[n];
        ArrayList<char[]> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrString[i] = scanner.nextLine();
            char[] arr = arrString[i].toCharArray();
            list.add(arr); //어레이 리스트에 문자배열들이 담김
        }
        int len = arrString[0].length();

        //System.out.println("담겨진 리스트 : " + Arrays.toString(list.get(0)));
        //System.out.println("arrString[0].length() " + arrString[0].length());

        char keyword[] = new char[len];

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < len; j++) {
                if ((list.get(i))[j] != (list.get(i + 1))[j]) {
                    keyword[j] = '?';
                }
            }
        }
        //System.out.println("물음표만 처리:" + Arrays.toString(keyword));

        for(int i = 0; i < len; i++){
            if(keyword[i] != '?'){
                keyword[i] = list.get(0)[i];
            }
        }
        //System.out.println(Arrays.toString(keyword));
        System.out.print(keyword);
    }
}