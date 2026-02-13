public class LatihDataMahasiswa {
  public static void main(String[] args) {
    String nim = "D1041241053";
    String nama = "Gabriel Santoso";
    char kelas = 'C';
    boolean status = true;
    double ipk = 3.73;
    // Menggunakan short karna byte tidak mencukupi yang range nya hanya sampai 127 sedangkan IPK bisa lebih dari itu.
    // Sedangkan tipe data integer terlalu kepanjangan.
    short sks = 64; 
    
    System.out.println("=== DATA MAHASISWA ===");
    System.out.println("NIM           : " + nim);
    System.out.println("Nama          : " + nama);
    System.out.println("Kelas         : " + kelas);
    System.out.println("Status Aktif  : " + status);
    System.out.println("IPK Semester  : " + ipk);
    System.out.println("Total SKS     : " + sks);
  }
}
