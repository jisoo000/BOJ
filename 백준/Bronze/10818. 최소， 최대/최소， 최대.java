import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int intArray[] = new int[n];
		int max=-1000000;
        int min=1000000;
		
		for(int i=0; i<n; i++) {
			intArray[i] = scanner.nextInt();
			if(intArray[i] > max)
				max = intArray[i];
            if(intArray[i] < min)
                min = intArray[i];
		}
		System.out.println(min+" "+max);
		scanner.close();
	}

}
