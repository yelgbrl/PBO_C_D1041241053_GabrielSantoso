public class LatihanBilangan {
  public static void main(String[] args) {
    int number = -7;
    System.out.println("=== PEMERIKSAAN BILANGAN ===");
    System.out.println("Bilangan: " + number);
    if (number > 0) {
      System.out.println("Jenis: Bilangan positif");
    } else if (number == 0) {
      System.out.println("Jenis: Bilangan nol");
    } else {
      System.out.println("Jenis: Bilangan negatif");
    }
    String parity = (number % 2 == 0) ? "Genap" : "Ganjil";
    System.out.println("Tipe: " + parity);
  }
}
