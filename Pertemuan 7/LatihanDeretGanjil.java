public class LatihanDeretGanjil {
  public static void main(String[] args) {
    int angka = 1;
    System.out.println("=== BILANGAN GANJIL 1-15 ===");
    while (angka <= 15) {
      System.out.print(angka + " ");
      // Menggunakan += 2 dibandingkan angka % 2 != 0 karena time complexitynya lebih cepat di kasus yang besar
      angka += 2;
    }
  }
}