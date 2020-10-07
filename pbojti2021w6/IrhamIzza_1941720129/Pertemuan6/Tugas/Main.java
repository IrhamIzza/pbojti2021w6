package Pertemuan6.Tugas;
public class Main {
     public static void main(String[] args) {
        
        
        Dosen d1 = new Dosen();
        d1.setNama("Irham");
        d1.setNip("123456789");
        d1.setAlamat("Kemuning no 40");
        d1.setSKS(15);
        
        Pegawai p1 = new Pegawai();
        p1.setNama("Syany");
        p1.setNip("987654321");
        p1.setAlamat("Merapi no 10");
        
        DaftarGaji daftar_gaji = new DaftarGaji(2);
        daftar_gaji.addPegawai(d1);
        daftar_gaji.addPegawai(p1);
        daftar_gaji.printSemuaGaji();
    }    
}
