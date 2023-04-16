import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        String input;
        for (int i = 0; i < n; i++) {
            input = br.readLine().trim();
            set.add(input);
        }

        TreeSet<String> sortedSet = new TreeSet<>(new Comparator<String>() {
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

        sortedSet.addAll(set);

        for (String s : sortedSet) {
            System.out.println(s);
        }
    }
}
