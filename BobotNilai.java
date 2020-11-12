import java.util.Scanner;
public class BobotNilai {
	public static void main(String[] abc) {
		Scanner masukan = new Scanner(System.in);
		double nilaimath,nilaialgo,ratarata;
		int sksmath,sksalgo;

		System.out.print("Nilai Matematika :");
		nilaimath = masukan.nextInt(); masukan.nextLine();
		System.out.print("Nilai Algoritma :");
		nilaialgo = masukan.nextInt(); masukan.nextLine();

		sksmath = 2;
		sksalgo = 3;
		ratarata = (nilaimath*sksmath+nilaialgo*sksalgo)/(sksmath+sksalgo);

		System.out.println("rata-rata nilai yang didapat : "+ratarata);
	}
}