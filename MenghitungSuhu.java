import java.util.Scanner;
public class MenghitungSuhu {
 	public static void main(String[] abc) {
		Scanner masukan = new Scanner(System.in);
		double Celcius,Kelvin,Reamur,Fahrenheit,suhu;
        char pilih;
        String satuan;

		System.out.print("Suhu saat ini (dalam satuan celcius): ");
		Celcius = masukan.nextInt(); masukan.nextLine();
        
        Kelvin = Celcius + 273;
        Reamur = 4/5*Celcius;
        Fahrenheit = 9/5*(Celcius+32);

        System.out.println("Akan diubah dalam satuan : ");
        System.out.println("1. Kelvin");
        System.out.println("2. Reamur");
        System.out.println("3. Fahrenheit");
        System.out.print("Pilih salah satu : ");
        pilih = masukan.next().charAt(0); masukan.nextLine();
        switch(pilih)
        {
            case '1': 
                    System.out.println("Ubah ke Kelvin"); 
                    suhu = Kelvin; 
                    satuan = "Kelvin"; 
                    break;
            case '2':
                    System.out.println("Ubah ke Reamur"); 
                    suhu = Reamur; 
                    satuan = "Reamur";
                    break;
            case '3': 
                    System.out.println("Ubah ke Fahrenheit"); 
                    suhu = Fahrenheit; 
                    satuan = "Fahrenheit"; 
                    break;
            default: 
                    System.out.println("Tidak bisa diubah"); 
                    suhu = Celcius; 
                    satuan = "Celcius";
                    break;
        }
        System.out.println("Suhu berubah menjadi "+suhu+" "+satuan);

	}
}