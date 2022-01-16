import java.util.Scanner;
public class TotalGaji {
 	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
        int gaji,gajipokok;
        double totalgaji;

        System.out.println("Gaji pokok :  ");
        System.out.println("Gol 1-----1000000");
        System.out.println("Gol 2-----2000000");
        System.out.println("Gol 3-----3000000");
        System.out.print("Pilih salah satu golongan gaji : ");
        gaji = masukan.nextInt(); masukan.nextLine();
        switch(gaji)
        {
            case 1: 
                    System.out.println("Gaji anda termasuk Golongan 1"); 
                    gajipokok = 1000000;
                    totalgaji = 1000000; 
                    break;
            case 2:
                    System.out.println("Gaji anda termasuk Golongan 2"); 
                    gajipokok = 2000000;
                    totalgaji = 2000000; 
                    break;
            case 3: 
                    System.out.println("Gaji anda termasuk Golongan 3"); 
                    gajipokok = 3000000;
                    totalgaji = (double)3000000-(0.02*3000000); 
                    break;
            default: 
                    System.out.println("Inputan salah");
                    gajipokok = 0;
                    totalgaji = 0;
                    break;
        }
        System.out.println("Gaji pokok anda : "+gajipokok); 
        System.out.println("Total gaji yang didapat : "+totalgaji);
    }
}