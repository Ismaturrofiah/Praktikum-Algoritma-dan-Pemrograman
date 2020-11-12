import java.util.Scanner; 
public class Tugas5_V3420042 {
	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
		
		double alas,tinggi,LuasSegitiga,S1,S2,KelilingSegitiga,setengahalas;
		
		System.out.print("masukan nilai Alas :");
		alas = masukan.nextDouble(); masukan.nextLine();
		System.out.print("masukan nilai Tinggi:");
		tinggi = masukan.nextDouble(); masukan.nextLine();
		
		LuasSegitiga = 0.5*alas*tinggi;
		setengahalas = 0.5*alas;
		S1 = Math.sqrt(Math.pow(setengahalas,2)+Math.pow(tinggi,2));
		S2 = Math.sqrt(Math.pow(setengahalas,2)+Math.pow(tinggi,2));
		KelilingSegitiga = alas+S1+S2;
		
		System.out.println("Luas Segitiga :" +  LuasSegitiga);
		System.out.println("Sisi Miring 1 :" + S1);
		System.out.println("Sisi Miring 2 :" + S2);
		System.out.println("Keliling Segitiga :" + KelilingSegitiga);
	}
}