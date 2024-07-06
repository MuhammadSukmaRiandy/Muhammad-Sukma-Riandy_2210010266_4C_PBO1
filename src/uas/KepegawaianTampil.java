package uas;

// io sederhana
import java.util.Scanner;

public class KepegawaianTampil {
    public static void main(String[] args) {
//        Kepegawaian pegawai = new Kepegawaian("Sukma", "1011020102", "L");
//        System.out.println(pegawai.infoTampil());
//        System.out.println(pegawai.infoTampil("Martapura"));
        
          //error handling
          try {
                //io sederhana
                Scanner scanner = new Scanner(System.in);

                //array
                KepegawaianDetail[] pegawai = new KepegawaianDetail[2];
                
                //perulangan
                for (int i=0; i<pegawai.length; i++) {
                  System.out.print("Masukkan Nama Pegawai "+(i+1)+": ");
                  String nama = scanner.nextLine();
                  System.out.print("Masukkan Id Pegawai "+(i+1)+": ");
                  String id = scanner.nextLine();
                  System.out.print("Masukkan Jenis Kelamin "+(i+1)+": ");
                  String jk = scanner.nextLine();
                  System.out.print("Jumlah Jam Kerja "+(i+1)+": ");
                  int jamKerja = scanner.nextInt();
                  scanner.nextLine();
                  

                  //objek
                  pegawai[i] = new KepegawaianDetail (nama, id, jk, jamKerja);
              }
                //perulangan
                for(KepegawaianDetail data : pegawai) {
                    System.out.println("======================");
                    System.out.println("Data Pegawai Kantoran");
                    System.out.println(data.infoTampil());
              }
                
           } catch (StringIndexOutOfBoundsException e){
              System.out.println("Kesalahan Format Id Pegawai: mohon dicek kembali!!!! "+e.getMessage());
          } catch (Exception e){
              System.out.println("Kesalahan Umum: mohon dicek kembali!!!!"+e.getMessage());
          }
    }
}
