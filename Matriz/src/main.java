import java.util.Scanner;

public class main {
	
	public static void Main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int M = scanner.nextInt();
		int N = scanner.nextInt();
		
		int[][] mat = new int[M][N];
		
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				mat[i][j] = scanner.nextInt();
			}
		}
		
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}