//Object Class
public class Guru{
    int id;
    private String nama;
    private String mapel;
    private String alamat;

    //construktor Guru 
    public void guru () {
        id = 0;
        setNama("");
        setMapel("");
        setAlamat("");

    }

    public String getAlamat() {
        return alamat;
        
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
        
    }

    public String getMapel() {
        return mapel;
        
    }

    public void setMapel(String mapel) {
        this.mapel = mapel;
        
    }

    public String getNama() {
        return nama;
        
    }

    public void setNama(String nama) {
        this.nama = nama;
        
    }

    // constructor parameter
    public Guru (int id, String Nama, String Alamat, String Mapel) {
        this.id = id;
        this.mapel = Mapel;
        this.alamat = Alamat;
        this.nama = Nama;
    }
    public int getid(){
        return id;
    }
    public String getnama(){
    return getNama();
    }   
    public String getmapel(){
        return getMapel();
    }
    public String getalamat(){
        return getAlamat();
    }



public void setid(int id){
    this.id =id;
}
public void setnama(String nama){
    this.setNama(nama);
}
public void setalamat(String alamat){
    this.setAlamat(alamat);
}


    // Method
    public void print() {
        System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
        System.out.println("ID: " + id);
        System.out.println("NAMA: " + getNama());
        System.out.println("MAPEL: " + getMapel());
        System.out.println("ALAMAT: " + getAlamat());
        System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
    }



}
    

