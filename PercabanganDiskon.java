import java.util.Scanner;
public class PercabanganDiskon {
 	public static void main(String[] abc) {
		Scanner masukan = new Scanner(System.in);
		double hargaawal,hargadiskon,diskon,potonganharga;

		System.out.print("Total harga belanja : ");
		hargaawal = masukan.nextInt(); masukan.nextLine();

        if(hargaawal < 0)
        {System.out.print("Nilai tidak valid");}
        
        if(hargaawal >= 100000)
        {diskon = 10;} else

        if(hargaawal >= 50000 && hargaawal<100000)
        {diskon = 5;} else
        {diskon = 0;}

        potonganharga = diskon/100*hargaawal;
        hargadiskon = hargaawal - potonganharga;

        System.out.println("Diskon yang didapat : "+diskon+"%");
        System.out.println("Potongan harga : "+potonganharga);
        System.out.println("Harga setelah diskon : "+hargadiskon);
	}
}