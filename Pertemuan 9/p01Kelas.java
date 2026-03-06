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
        Calc obj = new Calc(); 
         
        // Mengisi atribut 
        obj.num1 = 3; 
        obj.num2 = 5; 
         
        // Tampilkan result sebelum perhitungan 
        System.out.println("Sebelum perform(): " + obj.result); 
         
        // Panggil method untuk melakukan perhitungan 
        obj.perform(); 
         
        // Tampilkan result setelah perhitungan 
        System.out.println("Setelah perform(): " + obj.result); 
    } 
}