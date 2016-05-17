import java.io.FileInputStream;
import java.util.Scanner;


class solution_R1E5{
	
	static int Answer1 = 0;
	static int Answer2 = 0;
	static int N = 0; // dimension of matrix 
	
	public static void main(String args[]) throws Exception{
		
		System.setIn(new FileInputStream("c:\\sample_input.txt"));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
	
		for(int test_case = 1;test_case<=T;test_case++){
			
			N = sc.nextInt();
			
			int matrix[][] = new int[N][N];
			
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					matrix[i][j] = sc.nextInt();
				}
			}
			
			
			// code start
			
			
			// code end
			
			
			System.out.println("#"+T+" "+Answer1+" "+Answer2);
		}
	}
}


