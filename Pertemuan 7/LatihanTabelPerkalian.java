public class LatihanTabelPerkalian {
  public static void main(String[] args) {
    int angka = 7;
    System.out.println("=== TABEL PERKALIAN " + angka + " ===");
    for (int i = 1; i <= 12; i++) {
      System.out.println(angka + " × " + i + " = " + (angka * i));
    }
  }
}