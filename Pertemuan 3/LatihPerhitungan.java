/*
NIM   : D1041241053
Nama  : Gabriel Santoso
Program untuk Latihan 1 Pertemuan 3
 */
public class LatihPerhitungan {
  public static void main(String[] args) {
    int saldo = 1000000;

    System.out.println("=== SIMULASI TRANSAKSI BANK ===");
    System.out.println("Saldo Awal          : " + saldo);
    System.out.println("Setoran             : 500000");

    saldo += 500000;

    System.out.println("Saldo Setelah Setor : " + saldo);
    System.out.println("Penarikan           : 250000");

    saldo -= 250000;

    System.out.println("Saldo Akhir         : " + saldo);
  }
}
