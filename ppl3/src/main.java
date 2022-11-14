public class main {
    public static void main(String[] args) {

        data Data = new data();

        Data.setKodePegawai("846799");
        Data.setNama("SandySena Subianto");
        Data.setAlamat("Jalan Roger Sumatra 12, Bogor");
        Data.setJabatan("Chairman");
        Data.setGaji("Rp. 100 Juta");

        System.out.println(Data.getKodePegawai());
        System.out.println(Data.getNama());
        System.out.println(Data.getAlamat());
        System.out.println(Data.getJabatan());
        System.out.println(Data.getGaji());

    }

}
//Kode pegawai, nama, alamat, jabatan, gaji