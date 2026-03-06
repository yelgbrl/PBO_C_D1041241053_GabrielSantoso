/** 
 * Program demonstrasi Class dan Object sederhana 
 * Pertemuan 9: Class dan Object 
 *  
 * @author Rudy 
 */ 
class Calc { 
  // Atribut - Object knows something 
  int num1; 
  int num2; 
  int result; 
     
  // Method - Object does something 
  public void perform() { 
    result = num1 + num2; 
  } 
} 
 
public class p01Kelas { 
  public static void main(String args[]) { 
    // Cara 1: Deklarasi dan instansiasi terpisah 
    Calc obj;                // Deklarasi 
    obj = new Calc();        // Instansiasi 
         
    // Cara 2: Deklarasi dan instansiasi dalam 1 baris 
    Calc obj1 = new Calc(); 
         
    // Mengisi atribut object 
    obj.num1 = 3; 
    obj.num2 = 5; 
         
    // Menampilkan nilai result sebelum method dipanggil 
    System.out.println(obj.result); 
  } 
}