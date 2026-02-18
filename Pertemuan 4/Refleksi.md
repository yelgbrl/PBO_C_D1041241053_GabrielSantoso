# Refleksi Materi Pertemuan 4

## 1. Apa yang Anda pahami tentang Naming Convention.
Setelah mempelajari Naming Convention, saya menjadi lebih sadar bahwa dalam penamaan variabel, class, method, konstanta,
dan lainnya tidak bisa sembarangan dan ada aturannya agar kode lebih rapi dan mudah dibaca. 
- Untuk penamaan variabel, metode, dan boolean menggunakan camelCase dimana dimulai dengan huruf kecil dan dilanjutkan dengan huruf besar, serta tidak perlu menggunakan underscore (_).
- Untuk penamaan class menggunakan UpperCamelCase yang dimana diawali dengan huruf besar dan juga tidak menggunakan underscore, mirip seperti camelCase namun diawali dengan huruf besar.
- Untuk penamaan konstanta semua hurufnya ditulis dengan huruf besar dan dipisahkan dengan underscore jika memiliki spasi. Mirip seperti  aturan penulisan const yang ada di bahasa C++.

## 2. Mengapa penamaan variabel dan class penting dalam pemrograman.
Aturan penamaan Variabel dan Class penting agar kode bisa lebih rapi dan mudah dibaca. Karena dalam pengembangan projek biasanya tidak dilakukan sendirian, melainkan dilakukan beberapa orang. Sehingga penulisan kode yang rapi dan mudah dibaca memudahkan pengembang lain jika kedepannya akan dilakukan maintenance terhadap program tersebut. Kode bukan hanya untuk komputer tapi juga untuk manusia.

## 3. Bagaimana Operator Aritmatika Bekerja dalam Java
Dalam Java, operator aritmatika yang mungkin mirip seperti bahasa C++. Misalnya pembagian antar bilangan int, jika hasil aslinya adalah bilangan desimal, maka hasilnya akan diturunkan ke bawah, contohnya 5 / 2, yang seharusnya hasilnya 2.5 namun dalam tipe data int akan menjadi 2.
Kemudian ada beberapa operator aritmatika dasar dalam Java yaitu penjumlahan (+), pengurangan (-), perkalian (*), pembagian (/), dan modulo atau hasil bagi (%).
Kemudian ada increment dan decrement dan terdapat dua bentuk yaitu prefix dan postfix.
Prioritas aritmatika dalam Java adalah increment/decrement -> perkalian, pembagian, modulo -> penjumlahan, pengurangan. Bisa menggunakan tanda kurung untuk menentukan prioritas perhitungan.

## 4. Contoh penerapan yang Anda pahami dari latihan yang dikerjakan.
Ketika melakukan pembagian antara dua bilangan integer dan hasilnya dimasukkan ke dalam variabel double, hasilnya tetap diturunkan, misalnya:
int angka1 = 25, angka2 = 4
double pembagianDesimal = angka1 / angka2;
maka hasilnya adalah 6.0
Hasil yang benar jika menambahkan jenis tipe data yang ingin disimpan setelah tanda sama dengan, misalnya:
double pembagianDesimal = (double) angka1 / angka2; // Hasilnya adalah 6.25

## 5. Kesulitan yang dialami (jika ada).
Kesulitan yang saya alami ketika menggunakan tipe data string. Karena sudah terbiasa menggunakan bahasa C++ yang dimana penulisan string diawali dengan huruf kecil, namun dibahasa Java harus dimulai dengan huruf besar: String (nama variabel)