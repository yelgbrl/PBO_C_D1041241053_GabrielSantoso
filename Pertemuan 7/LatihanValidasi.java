public class LatihanValidasi {
  public static void main(String[] args) {
    int nilai = -10;
    int percobaan = 1;
    System.out.println("=== VALIDASI NILAI UJIAN ===");
    System.out.println();
    do {
      System.out.println("Percobaan input: " + nilai);
      if (nilai < 0 || nilai > 100) {
        System.out.println("Error: Nilai harus antara 0-100!");
        System.out.println();
        if (percobaan == 1) {
          nilai = 150;
        } else if (percobaan == 2) {
          nilai = 85;
        }
      } else {
        System.out.println("✓ Nilai valid: " + nilai);
        System.out.println();
      }
      percobaan++;
    } while (percobaan <= 3);
  }
}