
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		
		if (M>=45) {
			H=H;
			M=M-45;
		}else {
			H=H-1;
			M=M+15;
		}
		
		if (H<0) {
			H=H+24;
		}
		if (H==0){
			H=0;
		}

		System.out.println(H+" "+M);
	}

}
