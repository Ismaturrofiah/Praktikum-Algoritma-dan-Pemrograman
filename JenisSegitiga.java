import java.util.Scanner;
public class JenisSegitiga {
	public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int A,B,C;

		System.out.println("\n-------------------------");
        System.out.println("MENENTUKAN JENIS SEGITIGA");
        System.out.println("-------------------------");

        System.out.println("\nMasukkan panjang ketiga sisi pada segitiga");

        System.out.print("Sisi ke-1 : ");
        A = masukan.nextInt(); masukan.nextLine();
        System.out.print("Sisi ke-2 : ");
        B = masukan.nextInt(); masukan.nextLine();
        System.out.print("Sisi ke-3 : ");
        C = masukan.nextInt(); masukan.nextLine();

        Segitiga(A,B,C);
	}
     
    public static void Segitiga(int A,int B,int C){
        if (A > 0 & B > 0 & C > 0) 
        {
            if((A == 0) || (B == 0) || (C == 0))
            {System.out.println("Bukan Segitiga");}

            if(A == B & B == C & C == A)
            {System.out.println("Jenis segitiga : Segitiga Sama Sisi");}

            if((A == B & C != A & C != B) || (A != B & C == A & C != B) || (B == C & C != A & A != B))
            {System.out.println("Jenis segitiga : Segitiga Sama Kaki");}

            if(A != B & C != A & B != C)
            {System.out.println("Jenis segitiga : Segitiga Sembarang");}
        } else 
        {System.out.println("Bukan Segitiga");}
    }
}