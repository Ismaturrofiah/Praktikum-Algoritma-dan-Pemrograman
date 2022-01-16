import java.util.Scanner;
public class TotalBayar {
	public static void main(String[] abc) {
		Scanner masukan = new Scanner(System.in);
		int barangA,barangB;
		double diskonA,diskonB,hargadiskonA,hargadiskonB,totalhargaA,totalhargaB,totalbayar;
		
		System.out.print("Jumlah pembelian barang A :");
		barangA = masukan.nextInt(); masukan.nextLine();
		System.out.print("Jumlah pembelian barang B :");
		barangB = masukan.nextInt(); masukan.nextLine();
		
		diskonA = (double)10/100 * 1000;
		hargadiskonA = 1000 - diskonA;
		totalhargaA = barangA * hargadiskonA;
		diskonB = (double)5/100 * 2000;
		hargadiskonB = 2000 - diskonB;
		totalhargaB = barangB * hargadiskonB;
		totalbayar = totalhargaA + totalhargaB;
		
		System.out.println("total harga untuk pembelian barang A : "+totalhargaA);
		System.out.println("total harga untuk pembelian barang B : "+totalhargaB);
		System.out.println("total harga untuk semua barang : "+totalbayar);
	}
}