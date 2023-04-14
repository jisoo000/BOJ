import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

//영식요금제는 30초마다 10원씩 청구
//민식요금제는 60초마다 15원씩 청구

public class Main {

	static int Yeongsik(int time){
		int x = time/30;	
		int Ypay = (10*x)+10; 
		return  Ypay; //영식요금제 금액
	} 
	
	static int Minsik(int time){
		int x = time/60;
		int Mpay = (15*x)+15;
		return Mpay; //민식요금제 금액
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int calls = Integer.parseInt(br.readLine());//통화의 개수 
		String inputTime = br.readLine(); //통화개수별로 통화시간 받아옴
		StringTokenizer st = new StringTokenizer(inputTime, " ");
		String timesStr[] = new String[calls];
		
		for (int i = 0; i < timesStr.length; i++) {
			timesStr[i] = st.nextToken(); 
		}
		int[] times = Arrays.stream(timesStr).mapToInt(Integer::parseInt).toArray();
		
	///////
        
		int Ysum = 0; 
		int Msum = 0;
		for (int i = 0; i < times.length; i++) {
			Ysum += Yeongsik(times[i]); //영식요금제 요금 합계
			Msum += Minsik(times[i]); //민식요금제 요금 합계
		}
        
	///////
        
        
		if(Ysum>Msum) { //민식요금제를 이용하는게 더 저렴하면
			bw.write("M " + Msum);
            bw.flush();//민식요금제 금액 출력
		}else if(Ysum < Msum){ //영식요금제가 더 저렴하면 
			bw.write("Y " + Ysum);
            bw.flush();//영식요금제 금액 출력
		}else{ //두 요금제 금액이 같으면
			bw.write("Y M " + Ysum);
            bw.flush(); //Y M 모두와 금액 출력
		} 
		
	}
}