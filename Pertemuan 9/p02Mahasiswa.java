/** 
* Program demonstrasi Class Mahasiswa 
* Pertemuan 9: Class dan Object 
*  
* @author Rudy 
*/ 
class Mahasiswa { 
  // Atribut - Object knows something 
  String nama; 
  String NIM; 
  int nilai; 
     
  // Method - Object does something 
  public void tampilkanData() { 
    System.out.println("=== DATA MAHASISWA ==="); 
    System.out.println("Nama : " + nama); 
    System.out.println("NIM  : " + NIM); 
    System.out.println("Nilai: " + nilai); 
    System.out.println(); 
  } 
     
  public void cekKelulusan() { 
    if (nilai >= 60) { 
      System.out.println(nama + " LULUS"); 
    } else { 
      System.out.println(nama + " TIDAK LULUS"); 
    } 
  } 
} 
 
public class p02Mahasiswa { 
  public static void main(String[] args) { 
    // Membuat object mahasiswa pertama 
    Mahasiswa mhs1 = new Mahasiswa(); 
    mhs1.nama = "Andi Wijaya"; 
    mhs1.NIM = "F1234567"; 
    mhs1.nilai = 85; 
         
    // Membuat object mahasiswa kedua 
    Mahasiswa mhs2 = new Mahasiswa(); 
    mhs2.nama = "Budi Santoso"; 
    mhs2.NIM = "F1234568"; 
    mhs2.nilai = 55; 
         
    // Menampilkan data mahasiswa 1 
    mhs1.tampilkanData(); 
    mhs1.cekKelulusan(); 
         
    System.out.println(); 
    // Menampilkan data mahasiswa 2 
    mhs2.tampilkanData(); 
    mhs2.cekKelulusan(); 
  } 
}