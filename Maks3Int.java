import java.util.Scanner;
public class Maks3Int {
	public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int i,maksimum=0;
        int bilangan [] = new int [4];

		System.out.println("\n-----------------------------");
        System.out.println("MENCARI NILAI MAKSIMAL 3 DATA");
        System.out.println("-----------------------------");

        System.out.println("\nMasukkan 3 angka");

        for(i=1;i<bilangan.length;i++)
        {
            System.out.print("Angka ke-"+i+" : ");
            bilangan[i] = masukan.nextInt(); masukan.nextLine();
        }

        Maksimal(maksimum,i,bilangan);
	}
    
    public static void Maksimal(int maksimum,int i,int bilangan []){
        maksimum = bilangan[0];

        for(i=1;i<bilangan.length;i++){
            if(bilangan[i]>maksimum){
                maksimum = bilangan[i];
            }
        }
        System.out.println("Nilai maksimal dari ketiga angka : "+maksimum);
    }
}