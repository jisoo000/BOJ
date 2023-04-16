import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // 길이가 짧은 순서 우선
                if (s1.length() != s2.length()) {
                    return s1.length() - s2.length();
                }
                // 길이가 같은 경우 사전 순으로 정렬
                else {
                    return s1.compareTo(s2);
                }
            }
        });

        // 중복 제거한 후 출력
        String prev = "";
        for (String s : arr) {
            if (!s.equals(prev)) {
                System.out.println(s);
            }
            prev = s;
        }
    }
}
