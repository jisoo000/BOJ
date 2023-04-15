import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		
		StringTokenizer st = new StringTokenizer(input," ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		
		int min = 1000;
		
		int way[] = new int[4];
		way[0] = (h-y);
		way[1] = (w-x);
		way[2] = x;
		way[3] = y;
		
		
		for (int i = 0; i < way.length; i++) {
			if(way[i]<min) 
				min = way[i];
		}
		bw.write(min+"");
		bw.flush();
	}
}
