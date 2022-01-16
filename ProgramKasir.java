import java.util.Scanner;
public class ProgramKasir {
 	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
        int a,i,n,barang,ulang=0;
        int kode=0;
        int totalbarang=0;
        int hargaitem=1;
        int totalsemua=0;
        String [] code = {" ","B01","B02","B03","B04","B05"};
        String [] nama = {" ","Sabun Mandi Batang","Sabun Mandi Cair","Detergen","Sabun Cuci Piring","Sabun Pembersih Lantai"};
        String [] harga = {" ", "Rp 2.500,00","Rp 5.000,00","Rp 15.000,00","Rp 10.000,00","Rp 10.000,00"};
        String [] stok = {" ", "30","15","10","13","10"};
        int [] hargabarang = {0,2500,5000,15000,10000,10000};
        int [] item = new int[ulang+6];
        int [] urut = new int[ulang+6];
        int [] totalharga = new int[ulang+6];

        System.out.println("-------------");
        System.out.println("Program Kasir");
        System.out.println("-------------");

        System.out.println("\nDAFTAR KODE BARANG");
        System.out.println("1 B01 Sabun Mandi Batang");
        System.out.println("2 B02 Sabun Mandi Cair");
        System.out.println("3 B03 Detergen");
        System.out.println("4 B04 Sabun Cuci Piring");
        System.out.println("5 B05 Sabun Pembersih Lantai");

        System.out.println("\nApa yang ingin anda lakukan?");
        System.out.println("1. Mendata barang");
        System.out.println("2. Mendata pembelian");
        System.out.println("3. Mencetak kwitansi pembelian");
        System.out.print("Masukkan pilihan anda : ");
        a = masukan.nextInt(); masukan.nextLine(); 

        switch(a)
        {
            case 1 :
                System.out.println("\n-------------------");
                System.out.println("DATA BARANG DI TOKO");
                System.out.println("-------------------");
                System.out.print("Masukkan jumlah barang yang ingin didata : ");
                n = masukan.nextInt(); masukan.nextLine();
                ulang = n - 1;

                for(i=0;i<=ulang;i++)
                {
                    System.out.print("\nMasukkan urutan barang : ");
                    kode = masukan.nextInt(); masukan.nextLine();
                    
                    System.out.println("\nKode barang : "+code[kode]);
                    System.out.println("Nama barang : "+nama[kode]);
                    System.out.println("Harga : "+harga[kode]);
                    System.out.println("Stok : "+stok[kode]);
                };
                break;

            case 2 :
                System.out.println("\n--------------");
                System.out.println("DATA PEMBELIAN");
                System.out.println("--------------");
                System.out.print("Masukkan banyaknya jenis barang yang ingin dibeli (max 5) : ");
                n = masukan.nextInt(); masukan.nextLine();
                ulang = n - 1;

                for(i=0;i<=ulang;i++)
                {
                    System.out.print("\nMasukkan urutan barang : ");
                    kode = masukan.nextInt(); masukan.nextLine();
                    
                    System.out.print(nama[kode]+" dibeli sebanyak : ");
                    barang = masukan.nextInt(); masukan.nextLine();

                    hargaitem = barang*hargabarang[kode];

                    System.out.println("\nKode barang : "+code[kode]);
                    System.out.println("Nama barang : "+nama[kode]);
                    System.out.println("Harga barang per item : "+harga[kode]);
                    System.out.println("Jumlah barang yang dibeli : "+barang);
                    System.out.println("Total harga : Rp "+hargaitem);
                };
                break;

            case 3 :
                System.out.println("\n------------------");
                System.out.println("KWITANSI PEMBELIAN");
                System.out.println("------------------");
                System.out.print("Masukkan banyaknya jenis barang yang ingin dibeli (max 5) : ");
                n = masukan.nextInt(); masukan.nextLine();
                ulang = n - 1;

                for(i=0;i<=ulang;i++)
                {
                    System.out.print("\nMasukkan urutan barang : ");
                    urut[i] = masukan.nextInt(); masukan.nextLine();
                    
                    System.out.print(nama[urut[i]]+" dibeli sebanyak : ");
                    item[i] = masukan.nextInt(); masukan.nextLine();
                };
                for(i=0;i<=ulang;i++)
                {
                    totalbarang += item[i];
                    hargaitem = item[i]*hargabarang[urut[i]];
                    totalharga[i] = item[i]*hargabarang[urut[i]];
                    totalsemua += hargaitem;
                };
                for(i=0;i<=ulang;i++)
                {
                    System.out.println("\n"+code[urut[i]]+" "+nama[urut[i]]+" -> "+item[i]+" x "+hargabarang[urut[i]]+" = "+totalharga[i]);
                };
                System.out.println("\nTotal harga keseluruhan : "+totalsemua);
                break;
            
            default :
                System.out.println("Inputan salah");
                break;
        }       
     }
}
