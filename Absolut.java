import java.util.Scanner;
public class Absolut {
	public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int bil,positif=0;
        int negatif=1;

		System.out.println("\n------------------------------------");
        System.out.println("MENCARI ABSOLUT SUATU BILANGAN BULAT");
        System.out.println("------------------------------------");

        System.out.print("\nMasukkan angka yang akan dicari : ");
        bil = masukan.nextInt(); masukan.nextLine();

        CetakAbsolut(bil,positif,negatif);
	}
    
    public static void CetakAbsolut(int bil,int positif,int negatif){
        positif = bil;
        negatif = positif * -1;

        if(bil<0)
        {
            System.out.println("Bilangan absolutnya adalah "+negatif);
        }
        if(bil>=0)
        {
            System.out.println("Bilangan absolutnya adalah "+positif);
        }
    }

}