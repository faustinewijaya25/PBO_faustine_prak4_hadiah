import java.util.Scanner;
 
 public class hadiah4 {
 	public static void main (String [] args) {
 		Scanner masukan = new Scanner(System.in);
 		String nama, alamat;
 		char tipe, pilihan;
 		int kembalian, bayar;
 		boolean loop = true;
 		
 		System.out.println("Tipe Pesawat dan Harga Tiket Pesawat");
 		System.out.println("A. Rp.5.000.000");
 		System.out.println("B. Rp.2.000.000");
 		System.out.println("C. Rp.1.000.000");
 		System.out.println("Pilihan:");
 		System.out.print("Masukkan nama anda = ");
 		nama= masukan.nextLine();
 		System.out.print("Masukkan alamat anda = ");
 		alamat=masukan.nextLine();
 		System.out.print("Pilihan = ");
 		pilihan=masukan.next().charAt(0);
 		System.out.print("Bayar = ");
 		bayar= masukan.nextInt();
 		
 		
 		while (loop) {
 			switch(pilihan) {
 				case 'a': kembalian = bayar - 5000000;
 					System.out.println("nama= " +nama);
 					System.out.println("alamat= " +alamat);
 					System.out.println("kembalian= "+kembalian);
 					loop = false;
 					break;
 				case 'b': kembalian = bayar - 2000000;
 					System.out.println("nama,= "+nama);
 					System.out.println("alamat= "+alamat);
 					System.out.println("kembalian= "+kembalian);
 					loop = false;
 					break;
 				case 'c': kembalian = bayar - 1000000;
 					System.out.println("nama= "+nama);
 					System.out.println("alamat= "+alamat);
 					System.out.println("kembalian= "+kembalian);
 					loop = false;
 					break;
 				default:
 					System.out.println("Silahkan pilih tipe A-C");
 			}
 		}
 		
 		System.out.println("Pesanan anda akan jadi sebentar lagi..");
 	}
  }  