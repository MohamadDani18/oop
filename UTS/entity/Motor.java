package entity;

public class Motor {

    private String id;
    private String nama;
    private String merk;
    private String tahun;
    private String kerusakan;
    private String biaya;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTahun() { return tahun; }

    public void setTahun(String tahun) { this.tahun = tahun; }

    public String getKerusakan() { return kerusakan; }

    public void setKerusakan(String kerusakan) { this.kerusakan = kerusakan; }

    public String getBiaya() { return biaya; }

    public void setBiaya(String biaya) { this.biaya = biaya; }

    public Motor(String id, String nama, String merk, String tahun, String kerusakan, String biaya) {
        this.id = id;
        this.nama = nama;
        this.merk = merk;
        this.tahun = tahun;
        this.kerusakan = kerusakan;
        this.biaya = biaya;
    }


    public boolean equals(Object object) {
        Motor temp = (Motor) object;
        return id.equals(temp.getId());
    }

}