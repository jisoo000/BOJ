import java.io.*;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		String a0 = st.nextToken();
		String b0 = st.nextToken();
		int a = Integer.parseInt(a0);
		int b = Integer.parseInt(b0);
		
		//숫자를 거꾸로
		int a1 = a%10;
		int a2 = a%100/10;
		int a3 = a/100;
		
		int b1 = b%10;
		int b2 = b%100/10;
		int b3 = b/100;
		
		String aReverse = a1+""+a2+""+a3;
		String bReverse = b1+""+b2+""+b3;
		
		a = Integer.parseInt(aReverse);
		b = Integer.parseInt(bReverse);
		
		if (a>b) { 
			bw.write(a+"");
			bw.flush();
		}else { 
			bw.write(b+"");
			bw.flush();
		}
	}
}
