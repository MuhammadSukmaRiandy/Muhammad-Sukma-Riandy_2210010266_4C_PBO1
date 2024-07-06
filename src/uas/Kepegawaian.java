package uas;

public class Kepegawaian {
    //attribute dan encapsulation
    private String nama;
    private String id;
    private String jk;
    
   //constructor
    public Kepegawaian(String nama, String id, String jk) {
        this.nama = nama;
        this.id = id;
        this.jk = jk;
    }
    
    //constructor kosong
    public Kepegawaian() {
        System.out.println("Parameter kosong");
    }
    
    //mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }
    
    //accessor (getter)
    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public String getJk() {
        return jk;
    }
    
    //method tampil
    public String infoTampil(){
        return "Nama: "+getNama()+
                "\nId: "+getId()+
                "\nJenis Kelamin: "+getJk();
    }
    
    //polymorphism overloading
    public String infoTampil(String Domisili){
      return infoTampil() + "\nDomisili: "+Domisili;  
    }
}
