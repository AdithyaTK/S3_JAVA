import java.util.Scanner;
public class MatrixMul {
	public static void main(String args[]) {
		int r1, r2, c1, c2, i, j, k;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the row size of the first matrix");
		r1 = s.nextInt();
		System.out.println("enter the col size of the first matrix");
		c1 = s.nextInt();
		int arr1[][] = new int[r1][c1];
		System.out.println("enter the row size of the second matrix");
		r2 = s.nextInt();
		System.out.println("enter the col size of the second matrix");
		c2 = s.nextInt();
		int arr2[][] = new int[r2][c2];
		if (c1 != r2) {
			System.out.println("the multiplication cannot take place");
		} else {
			System.out.println("\nenter the values of the first matrix");
			for (i = 0; i < r1; i++) {
				for (j = 0; j < c1; j++) {
					arr1[i][j] = s.nextInt();
				}
			}
			System.out.println("\nenter the values of the second matrix");
			for (i = 0; i < r2; i++) {
				for (j = 0; j < c2; j++) {
					arr2[i][j] = s.nextInt();
				}
			}
			int m3[][] = new int[r1][c2];
			for (i = 0; i < r1; i++) {
				for (j = 0; j < c2; j++) {
					for (k = 0; k < r2; k++) {
						m3[i][j] = m3[i][j] + arr1[i][k] * arr2[k][j];
					}
				}
				System.out.println("the multi is");
				for (i = 0; i < r1; i++) {
					System.out.println("\n");
					for (j = 0; j < c2; j++) {

						System.out.print("\t" + m3[i][j]);
					}
				}
			}

		}
	}

}
