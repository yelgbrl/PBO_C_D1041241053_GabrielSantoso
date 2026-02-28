public class LatihanDiskon {
  public static void main(String[] args) {
    double totalBelanja = 750000;
    System.out.println("=== KALKULATOR DISKON ===");
    System.out.println("Total Belanja: Rp" + totalBelanja);
    if (totalBelanja < 100000) {
      System.out.println("Diskon (Tidak ada diskon): Rp " + totalBelanja);
      System.out.println("Harga Akhir: Rp " + totalBelanja);
      System.out.println("Anda Hemat: Rp " + 0);
    } else if (totalBelanja >= 100000 && totalBelanja < 500000) {
      System.out.println("Diskon (5%): Rp " + totalBelanja * 0.05);
      System.out.println("Harga Akhir: Rp " + (totalBelanja - (totalBelanja * 0.05)));
      System.out.println("Anda Hemat: Rp " + totalBelanja * 0.05);
    } else if (totalBelanja >= 500000 && totalBelanja < 1000000) {
      System.out.println("Diskon (5%): Rp " + totalBelanja * 0.1);
      System.out.println("Harga Akhir: Rp " + (totalBelanja - (totalBelanja * 0.1)));
      System.out.println("Anda Hemat: Rp " + totalBelanja * 0.1);
    } else {
      System.out.println("Diskon (5%): Rp " + totalBelanja * 0.15);
      System.out.println("Harga Akhir: Rp " + (totalBelanja - (totalBelanja * 0.15)));
      System.out.println("Anda Hemat: Rp " + totalBelanja * 0.15);
    }

  }
}
