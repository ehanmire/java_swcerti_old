import java.util.Scanner;
import java.io.FileInputStream;

class solution_R1E4{
	static int Ri, Rj;  // dimension of matrix
	static int AnswerN = 0;
	
	public static void main(String args[]) throws Exception{
		
		System.setIn(new FileInputStream("c:\\sample_input.txt"));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		//System.out.println(T);
		
		for(int test_case = 1; test_case <= T; test_case++){
			Ri = sc.nextInt();
			Rj = sc.nextInt();
			
			System.out.println(Ri+" "+Rj);
			
			char room[][] = new char[Ri][Rj];
			
			/*String tmp = sc.next();
			int length_tmp = tmp.length();
			System.out.println(tmp);		
			System.out.println(length_tmp);*/
			
			for(int i=0;i<Ri;i++){
				for(int j=0;j<Rj;j++){
					String tmp = sc.next();
					room[i][j] = tmp.charAt(0);
				}
			}

			
			for(int i=0;i<Ri;i++){
				for(int j=0;j<Rj;j++){
					//int checkup;
					if(room[i][j] == 'G'){
						
						//check up/down, i is fixed

						// first, up
						int k = j - 1;
						
						while(k>=0){
							if(room[i][k] == 'T'){
								AnswerN++;
								room[i][k] = 'W';
								break;
							}else if(room[i][k] == 'W' || room[i][k] == 'G'){
								break;
							}
							k--;
						}
						
						// second, down
						k = j + 1;
						
						while(k<Rj){
							if(room[i][k] == 'T'){
								AnswerN++;
								room[i][k] = 'W';
								break;
							}else if(room[i][k] == 'W' || room[i][k] == 'G'){
								break;
							}
							k++;
						}
						
						//check left/right, j is fixed
						
					} else{
						
					}
				}
			}
			
			
			
			System.out.println("#"+test_case+" "+AnswerN);	
		}
		
	}
}