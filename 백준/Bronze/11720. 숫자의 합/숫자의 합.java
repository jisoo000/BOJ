import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); //몇 글자 더할건지
		String str = scanner.next(); //문자열로 입력받은 더할 숫자
		int intArray[] = new int[n]; //크기만큼 배열을 만듬
		int sum=0; //합계초기화
		for (int i=0; i<n; i++) {
			intArray[i]=str.charAt(i)-48;
			sum+=intArray[i];
			}
		System.out.println(sum);
	}
}
