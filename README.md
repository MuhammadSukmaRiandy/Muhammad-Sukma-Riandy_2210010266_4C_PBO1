# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data Kepegawaian menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama, id, jenis kelamin dan jam kerja pegawai yang bekerja dan memberikan output berupa informasi detail dari ID tersebut seperti tahun masuk, bulan masuk, tanggal masuk, jabatan, status dan total gajih pegawai.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Kepegawaian`, `KepegawaianDetail`, dan `KepegawaianTampil` adalah contoh dari class.

```bash
public class Kepegawaian {
    ...
}

public class KepegawaianDetail extends Kepegawaian {
    ...
}

public class KepegawaianTampil {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `pegawai[i] = new KepegawaianDetail (nama, id, jk, jamKerja);` adalah contoh pembuatan object.

```bash
pegawai[i] = new KepegawaianDetail (nama, id, jk, jamKerja);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` , `id` , `jk`,  `jamKerja` dan `upahKerja` adalah contoh atribut.

```bash
String nama;
String id;
String jk;
int jamKerja;
double upahKerja;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Kepegawaian` dan `KepegawaianDetail`.

```bash
public Kepegawaian(String nama, String id, String jk) {
        this.nama = nama;
        this.id = id;
        this.jk = jk;
}

public KepegawaianDetail(String nama, String id, String jk, int jamKerja ) {
        super(nama, id, jk);
        this.jamKerja = jamKerja;
        this.upahKerja = hitungUpahKerja();
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` , `setId` `setJk` adalah contoh method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;
}

public void setId(String id) {
        this.id = id;
}

public void setJk(String jk) {
        this.jk = jk;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getId`,  `getJk`, `getTahunMasuk`, `getBulanMasuk`, `getTanggalMasuk`, `getJabatan`, dan `getStatus` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getId() {
    return id;
}

public String getJk() {
    return jk;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `id`, `jk`, `jamKerja` dan `upahKerja` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String id;
private String jk;
private int jamKerja;
private double upahKerja;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `KepegawaianDetail` mewarisi `Kepegawaian` dengan sintaks `extends`.

```bash
public class KepegawaianDetail extends Kepegawaian {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `infoTampil(String Domisili)` di `Kepegawaian` merupakan overloading method `infoTampil` dan `infoTampil` di `KepegawaianDetail` merupakan override dari method `infoTampil` di `Kepegawaian`.

```bash
public String infoTampil(String Domisili){
      return infoTampil() + "\nDomisili: "+Domisili;  
}

@Override
public String infoTampil() {
    return super.infoTampil()+
    "\nJam Kerja: "+jamKerja +
    "\nTahun Masuk: "+getTahunMasuk() +
    "\nBulan Masuk: "+getBulanMasuk() +
    "\nTanggal Masuk: "+getTanggalMasuk() +
    "\nJabatan : "+getJabatan()+
    "\nStatus : "+getStatus()+
    "\nTotal Gaji: Rp. " + hitungGaji();
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getJabatan`, `getStatus` dan seleksi `switch` dalam method `getBulanMasuk` dan `hitungUpahKerja`.

```bash
public String getBulanMasuk () {
        String bulanMasuk = getId().substring(2, 4);
        switch (bulanMasuk) {
            case "01":
                return "Januari";
            case "02":
                return "Februari";
            case "03":
                return "Maret";
            case "04":
                return "April";
            case "05":
                return "Mei";
            case "06":
                return "Juni";
            case "07":
                return "Juli";
            case "08":
                return "Agustus";
            case "09":
                return "September";
            case "10":
                return "Oktober";
            case "11":
                return "November";
            case "12":
                return "Desember";
            default:
                return "Bulan Tidak Diketahui";
        }
    }

public String getJabatan () {
        String kodeJabatan = getId().substring (6, 8);
        //seleksi if
        if(kodeJabatan.equals("01")){
            return "Direktur";
        } else if (kodeJabatan.equals("02")){
            return "Pegawai";
        } else if (kodeJabatan.equals("03")) {
            return "Magang";
        } else {
            return "Posisi tidak diketahui";
        }
    }

private double hitungUpahKerja() {
        // Menentukan upah kerja berdasarkan jabatan
        String jabatan = getJabatan();
        switch (jabatan) {    // Seleksi switch 
            case "Direktur":
                return 50000; // Upah untuk Direktur per jam
            case "Pegawai":
                return 30000; // Upah untuk Pegawai per jam
            case "Magang":
                return 10000; // Upah untuk Magang per jam
            default:
                return 0;
        }
    }

public String getStatus () {
        String kodeStatus = getId().substring (8, 10);
        // seleksi if 
        if(kodeStatus.equals("10")){
            return "Sudah Menikah";
        } else if (kodeStatus.equals("20")){
            return "Belum Menikah";
        } else {
            return "Status tidak jelas";
        }
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i=0; i<pegawai.length; i++) {
  ...
for (KepegawaianDetail data : pegawai) {
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Pegawai "+(i+1)+": ");
String nama = scanner.nextLine();
System.out.print("Masukkan Id Pegawai "+(i+1)+": ");
String id = scanner.nextLine();
System.out.print("Masukkan Jenis Kelamin "+(i+1)+": ");
String jk = scanner.nextLine();
System.out.print("Jumlah Jam Kerja "+(i+1)+": ");
int jamKerja = scanner.nextInt();
scanner.nextLine();

System.out.println("Data Pegawai Kantoran");
System.out.println(data.infoTampil());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `KepegawaianDetail[] pegawai = new KepegawaianDetail[2];` adalah contoh penggunaan array.

```bash
KepegawaianDetail[] pegawai = new KepegawaianDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
catch (StringIndexOutOfBoundsException e){
   System.out.println("Kesalahan Format Id Pegawai: mohon dicek kembali!!!! "+e.getMessage());
} catch (Exception e){
    System.out.println("Kesalahan Umum: mohon dicek kembali!!!!"+e.getMessage());
}
```

Penggunaan Rumus untuk menghitung total gajih sesuai jabatan yang dimiliki
```bash
public long hitungGaji() {
  return (long) (30 * jamKerja * upahKerja); // Menghitung gaji total per bulan
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Sukma Riandy  
NPM : 2210010266
