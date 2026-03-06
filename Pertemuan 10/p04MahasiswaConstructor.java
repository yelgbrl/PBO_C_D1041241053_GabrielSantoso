/** 
* Program demonstrasi Constructor dan This pada Class Mahasiswa 
* Pertemuan 10: Constructor & This Keyword 
*  
* @author Rudy 
*/ 
class Mahasiswa { 
  // Atribut 
  String nama; 
  String NIM; 
  int nilai; 

  // Constructor 1: Tanpa parameter 
  public Mahasiswa() { 
    nama = "Belum diisi"; 
    NIM = "00000000"; 
    nilai = 0; 
    System.out.println("Object mahasiswa dibuat (default)"); 
  } 
     
  // Constructor 2: 3 parameter dengan THIS 
  public Mahasiswa(String nama, String NIM, int nilai) { 
    this.nama = nama; 
    this.NIM = NIM; 
    this.nilai = nilai; 
    System.out.println("Object mahasiswa dibuat: " + this.nama); 
  } 
     
  // Method untuk menampilkan data 
  public void tampilkanData() { 
    System.out.println("=== DATA MAHASISWA ==="); 
    System.out.println("Nama : " + nama); 
    System.out.println("NIM  : " + NIM); 
    System.out.println("Nilai: " + nilai); 
    System.out.println(); 
  } 
} 
 
public class p04MahasiswaConstructor { 
     
  public static void main(String[] args) { 
    // Object 1: Menggunakan constructor default 
    Mahasiswa mhs1 = new Mahasiswa(); 
    mhs1.tampilkanData(); 
         
    // Object 2: Menggunakan constructor dengan parameter 
    Mahasiswa mhs2 = new Mahasiswa("Andi Wijaya", "F1234567", 85); 
    mhs2.tampilkanData(); 
         
    // Object 3: Menggunakan constructor dengan parameter 
    Mahasiswa mhs3 = new Mahasiswa("Budi Santoso", "F1234568", 90); 
    mhs3.tampilkanData(); 
  } 
}