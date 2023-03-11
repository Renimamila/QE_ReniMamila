import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        String nama, deskripsi;
        int harga, jumlahStok;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("=====Info Produk=====");
        System.out.println("Nama : ");
        nama = keyboard.nextLine();
        System.out.println("Deskripsi : ");
        deskripsi = keyboard.nextLine();
        System.out.println("Harga : ");
        harga = keyboard.nextInt();
        System.out.println("Jumlah Stok : ");
        jumlahStok = keyboard.nextInt();

        System.out.println("============Info Produk============");
        System.out.println("Nama : " + nama);
        System.out.println("Deskripsi : " + deskripsi);
        System.out.println("Harga : " + harga);
        System.out.println("Jumlah Stok : " + jumlahStok);


    }

}
