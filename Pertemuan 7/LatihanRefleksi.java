public class LatihanRefleksi {
  public static void main(String[] args) {
    int i = 1;
    System.out.println("=== MENGGUNAKAN WHILE ===");
    while (i <= 5) {
      System.out.print(i + " ");
      i++;
    }
    System.out.println();
    System.out.println();
    int j = 1;
    System.out.println("=== MENGGUNAKAN DO-WHILE ===");
    do {
      System.out.print(j + " ");
      j++;
    } while (j <= 5);
    System.out.println();
    System.out.println();
    System.out.println("=== MENGGUNAKAN FOR ===");
    for (int k = 1; k <= 5; k++) {
      System.out.print(k + " ");
    }
  }
}
/* 
Refleksi: Menurut saya, for loop paling mudah dipahami karena variabel iterasi, 
kondisi, dan update berada dalam satu baris sehingga lebih ringkas dan jelas.
*/ 