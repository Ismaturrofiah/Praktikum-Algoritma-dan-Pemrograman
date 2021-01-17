import java.util.Scanner;
public class Kelulusan {
 	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
        int nilai;
        String statusnilai,statuslulus,kriteria;

        System.out.print("Masukkan nilai : ");
		nilai = masukan.nextInt(); masukan.nextLine();

        if(nilai >= 60)
            {statuslulus = "LULUS";} else
            {statuslulus = "GAGAL";}
        
        if(nilai >= 80)
            {kriteria = "sangat baik";} else
        if(nilai >= 70)
            {kriteria = "baik";} else 
        if(nilai >= 60)  
            {kriteria = "cukup";} else
            {kriteria = "kurang";}
        
        if(nilai >= 0 && 100 >= nilai)
            {
            System.out.println("Nilai yang dimasukkan VALID");
            System.out.println("Mahasiswa dinyatakan "+statuslulus);
            System.out.println("Kriteria nilai : "+kriteria);
            } else
            {System.out.print("Nilai yang dimasukkan TIDAK VALID");}
    }
}