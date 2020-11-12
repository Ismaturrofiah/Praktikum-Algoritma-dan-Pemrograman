import java.util.Scanner;
public class TukarData {
	public static void main(String[] abc) {
		Scanner masukan = new Scanner(System.in);
		int a,b,temporary;

		System.out.print("a : ");
		a = masukan.nextInt(); masukan.nextLine();
		System.out.print("b : ");
		b = masukan.nextInt(); masukan.nextLine();

		temporary = a;
		a = b;
		b = temporary;

		System.out.println("\na yang baru : "+a);
		System.out.println("b yang baru : "+b);
	}
}