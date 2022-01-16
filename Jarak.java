import java.util.Scanner;
public class Jarak {
	public static void main(String[] abc) {
		Scanner masukan = new Scanner(System.in);
		double kecepatanA,kecepatanB,jarakAB,waktu,jarakA,jarakB;
		
		System.out.print("Kecepatan mobil A :");
		kecepatanA = masukan.nextDouble(); masukan.nextLine();
		System.out.print("Kecepatan mobil B :");
		kecepatanB = masukan.nextDouble(); masukan.nextLine();
		System.out.print("Jarak mobil A dan mobil B :");
		jarakAB = masukan.nextDouble(); masukan.nextLine();
		
		waktu = (double)jarakAB / (kecepatanA + kecepatanB);
		jarakA = kecepatanA * waktu;
		jarakB = kecepatanB * waktu; 
		
		System.out.println("Waktu untuk bertemu 2 mobil yang melaju berlawanan : "+waktu+" jam");
		System.out.println("Jarak bertemu dari awal mobil A : "+jarakA+" km");
		System.out.println("Jarak bertemu dari awal mobil B : "+jarakB+" km");
	}
}