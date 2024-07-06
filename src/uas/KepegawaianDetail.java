package uas;
// inheritance
public class KepegawaianDetail extends Kepegawaian {
    private int jamKerja;
    private double upahKerja;

    public KepegawaianDetail(String nama, String id, String jk, int jamKerja ) {
        super(nama, id, jk);
        this.jamKerja = jamKerja;
        this.upahKerja = hitungUpahKerja();
    }
    
    
    public int getTahunMasuk () {
        return Integer.parseInt(getId().substring(0, 2))+ 2000 ;
    }
    
    public String getBulanMasuk () {
        String bulanMasuk = getId().substring(2, 4);
        //seleksi switch
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
    
    public int getTanggalMasuk () {
        return Integer.parseInt(getId().substring(4, 6));
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
    
    public long hitungGaji() {
        return (long) (30 * jamKerja * upahKerja); // Menghitung gaji total per bulan
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
    
    // polymorhism overriding
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
}
