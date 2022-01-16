import java.util.Scanner;
public class LuasKelilingSegitiga {
	public static void main(String[] abc) {
		Scanner masukan = new Scanner(System.in);
		
		double alas,tinggi,setengahalas,sisimiring,LuasSegitiga,KelilingSegitiga;
		
		System.out.print("masukan nilai Alas :");
		alas = masukan.nextDouble(); masukan.nextLine();
		System.out.print("masukan nilai Tinggi:");
		tinggi = masukan.nextDouble(); masukan.nextLine();
		
		LuasSegitiga = 0.5*alas*tinggi;
		setengahalas = 0.5*alas;
		sisimiring = Math.sqrt(Math.pow(setengahalas,2)+Math.pow(tinggi,2));
		KelilingSegitiga = alas+(2*sisimiring);
		
		System.out.println("Luas Segitiga :" +  LuasSegitiga);
		System.out.println("Keliling Segitiga :" + KelilingSegitiga);
	}
}