class Persegi {
  int sisi;
  int luas;
  int keliling;

  public Persegi(int sisi) {
    if (sisi <= 0) {
      this.sisi = 1;
      System.out.println("ERROR: Sisi tidak boleh <= 0. Diset ke default (1).");
    } else {
      this.sisi = sisi;
    }
    this.luas = this.sisi * this.sisi;
    this.keliling = 4 * this.sisi;
  }

  public void tampilkanHasil() {
    System.out.println("=== PERSEGI ===");
    System.out.println("Sisi  : " + sisi + " cm");
    System.out.println("Luas  : " + luas + " cm²");
    System.out.println("Keliling: " + keliling + " cm");
    System.out.println();
  }
}
public class LatihanPersegiConstructor {
  public static void main(String[] args) {
    Persegi persegi1 = new Persegi(5);
    persegi1.tampilkanHasil();
    
    Persegi persegi2 = new Persegi(-3);
    persegi2.tampilkanHasil();
  }
}
