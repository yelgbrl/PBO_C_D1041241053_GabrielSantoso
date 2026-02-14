/*
NIM   : D1041241053
Nama  : Gabriel Santoso
Latihan memberikan penamaan variabel yang benar
 */
public class LatihanProduk {
  public static final double TAX = 0.11;
  public static void main(String[] args) {
    String productName = "Laptop Asus";
    int unitPrice = 7000000;
    int stockAmount = 15;
    boolean isAvailable = true;

    long totalStockValue = unitPrice * stockAmount;
    long totalTax = (long) (totalStockValue * TAX);

    System.out.println("=== INFORMASI PRODUK ===");
    System.out.println("Nama Produk: " + productName); 
    System.out.println("Harga Satuan: Rp " + unitPrice);
    System.out.println("Jumlah Stok: " + stockAmount);
    System.out.println("Status Tersedia: " + isAvailable);
    System.out.println("---");
    System.out.println("Total Nilai Stok: Rp " + totalStockValue);
    System.out.println("Pajak (11%): Rp " + totalTax);
  }
}
