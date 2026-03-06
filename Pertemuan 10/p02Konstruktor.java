/** 
* Program demonstrasi Constructor dan Overloading 
* Pertemuan 10: Constructor & This Keyword 
*  
* @author Rudy 
*/ 
/* 
KARAKTERISTIK CONSTRUCTOR: 
1. Member method 
2. Nama sama dengan nama kelas 
3. Tidak mengembalikan nilai (tidak ada return type) 
4. Digunakan untuk mengalokasikan memori 
5. Boleh overload dengan syarat parameter berbeda 
6. Dipanggil pada saat object dibuat 
*/ 
class Konstruk { 
  // Atribut 
  int i; 
  float f; 

  // Constructor 1: Tanpa parameter 
  public Konstruk() { 
    i = 5; 
    f = 5.5f; 
    System.out.println("Hi"); 
  } 
     
  // Constructor 2: 1 parameter int 
  public Konstruk(int k) { 
    i = k; 
    System.out.println("Hello"); 
  } 
} 
 
public class p02Konstruktor { 
  public static void main(String args[]) { 
         
    // Object memanggil constructor pertama (tanpa parameter) 
    Konstruk k1 = new Konstruk(); 
         
    // Object memanggil constructor kedua (1 parameter) 
    Konstruk k2 = new Konstruk(5); 
         
    // Tugas: Membuat constructor dengan 2 parameter 
  } 
}