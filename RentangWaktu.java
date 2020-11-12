import java.util.Scanner;
public class RentangWaktu {
	public static void main(String[] abc) {
		Scanner masukan = new Scanner(System.in);
		int jamA,menitA,detikA,jamB,menitB,detikB,konvJam,konvMenit,KonvDetik,totalA,totalB,selisih,sisa1,sisa2;
		
        System.out.print("Jam mulai : ");
		jamA = masukan.nextInt(); masukan.nextLine();
        System.out.print("Menit mulai : ");
        menitA = masukan.nextInt(); masukan.nextLine();
        System.out.print("Detik mulai : ");
        detikA = masukan.nextInt(); masukan.nextLine();
        System.out.print("\nJam selesai : ");
		jamB = masukan.nextInt(); masukan.nextLine();
        System.out.print("Menit selesai : ");
        menitB = masukan.nextInt(); masukan.nextLine();
        System.out.print("Detik selesai : ");
        detikB = masukan.nextInt(); masukan.nextLine();
		
        totalA = jamA*3600+menitA*60+detikA;
        totalB = jamB*3600+menitB*60+detikB;
        selisih = totalB - totalA;

        sisa1 = selisih%3600;
        konvJam = selisih/3600;
        sisa2 = sisa1%60;
        konvMenit = sisa1/60;
        KonvDetik = sisa2;
		
		System.out.println("\nWaktu mulai : "+jamA+":"+menitA+":"+detikA);
        System.out.println("Waktu selesai : "+jamB+":"+menitB+":"+detikB);
        System.out.println("Rentang waktu dari mulai hingga selesai : "+konvJam+" jam "+konvMenit+" menit "+KonvDetik+" detik");
    }
}