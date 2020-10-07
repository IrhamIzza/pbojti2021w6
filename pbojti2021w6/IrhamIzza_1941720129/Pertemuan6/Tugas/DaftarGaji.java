package Pertemuan6.Tugas;
public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int jumlahPegawaiSekarang = 0;
    
    public DaftarGaji(int jumlah_pegawai){
        listPegawai = new Pegawai[jumlah_pegawai];
    }
    
    public void addPegawai(Pegawai p){
        listPegawai[jumlahPegawaiSekarang] = p;
        jumlahPegawaiSekarang++;
    }
    
    public void printSemuaGaji(){
        for (int i=0;i<jumlahPegawaiSekarang;i++){
            System.out.println(" Nama \t: " + listPegawai[i].getNama());
            System.out.println(" NIP \t: "+listPegawai[i].getNip());
            System.out.println(" Alamat : "+listPegawai[i].getAlamat());
            System.out.println(" Gaji \t: "+listPegawai[i].getGaji() );
            System.out.println("");
        }
    }
}
