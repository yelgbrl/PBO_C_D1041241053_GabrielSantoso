class Mobil {
  String merk;
  String warna;
  int tahun;

  public Mobil() {
    merk = "Belum diisi";
    warna = "Belum diisi";
    tahun = 0;
  }

  public Mobil(String merk) {
    this();           // Memanggil constructor tanpa parameter terlebih dahulu untuk menjadikan semua atribut menjadi nilai default
    this.merk = merk; // Kemudian atribut merk ditentukan nilainya, sedangkan atribut yang lain tetap nilai default
                      // Tujuan saya untuk mempersingkat penulisan kode
  }

  public Mobil(String merk, String warna, int tahun) {
    this.merk = merk;
    this.warna = warna;
    this.tahun = tahun;
  }

  public void tampilkanSpesifikasi() {
    System.out.println("=== SPESIFIKASI MOBIL ===");
    System.out.println("Merk  : " + merk);
    System.out.println("Warna : " + warna);
    System.out.println("Tahun : " + tahun);
    System.out.println();
  }
}

public class LatihanMobilConstructor {
  public static void main(String[] args) {
    Mobil mobil1 = new Mobil();
    Mobil mobil2 = new Mobil("Toyota");
    Mobil mobil3 = new Mobil("Honda Civic", "Merah", 2023);

    mobil1.tampilkanSpesifikasi();
    mobil2.tampilkanSpesifikasi();
    mobil3.tampilkanSpesifikasi();
  }
}
