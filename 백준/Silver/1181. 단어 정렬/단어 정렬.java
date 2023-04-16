import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int N = Integer.parseInt(br.readLine());
			ArrayList<ArrayList<String>> lengthMemo = new ArrayList<>();
			for(int i = 0 ; i <= 50 ; i++) {
				lengthMemo.add(new ArrayList<String>());
			}
			
			for(int i = 0 ; i < N ; i++) {
				String line = br.readLine();
				lengthMemo.get(line.length()).add(line);
			}
			for(int i = 1 ; i <= 50 ; i++) {
				lengthMemo.get(i).sort(null);
				String prev = "";
				for(int j = 0 ; j < lengthMemo.get(i).size() ; j++) {
					if(lengthMemo.get(i).get(j).equals(prev)) continue;
					bw.write(prev = lengthMemo.get(i).get(j));
					bw.newLine();
				}
			}
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}