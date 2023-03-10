import java.util.Scanner;
public class freqchar {
	public static void main(String args[]) {
		int count = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str1 = s.nextLine();
		System.out.println("Enter the character:");
		char a = s.next().charAt(0);
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == a) {
				count++;
			}
		}
		System.out.println("The frequncy of the charecter is " + count);

	}

}