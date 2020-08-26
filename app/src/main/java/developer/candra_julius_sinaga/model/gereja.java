package developer.candra_julius_sinaga.model;

import android.os.Parcel;
import android.os.Parcelable;

public class gereja implements Parcelable {
    private String namaParoki;
    private String namaGereja;
    private String alamat;
    private String telepon;
    private String stasi;
    private int photo;
    private String namaPastor;
    private String jabatanPastor;
    private String tanggalPastor;
    private String jumlahUmat;

    public gereja() {

    }


    public String getNamaPastor() {
        return namaPastor;
    }

    public String getJumlahUmat() {
        return jumlahUmat;
    }

    public String getJabatanPastor() {
        return jabatanPastor;
    }

    public String getTanggalPastor() {
        return tanggalPastor;
    }

    public String getNamaParoki() {
        return namaParoki;
    }

    public String getNamaGereja() {
        return namaGereja;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public String getStasi() {
        return stasi;
    }

    public int getPhoto() {
        return photo;
    }

    public static Creator<gereja> getCREATOR() {
        return CREATOR;
    }

    public void setJumlahUmat(String jumlahUmat) {
        this.jumlahUmat = jumlahUmat;
    }

    public void setNamaParoki(String namaParoki) {
        this.namaParoki = namaParoki;
    }

    public void setNamaGereja(String namaGereja) {
        this.namaGereja = namaGereja;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public void setStasi(String stasi) {
        this.stasi = stasi;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setNamaPastor(String namaPastor) {
        this.namaPastor = namaPastor;
    }

    public void setJabatanPastor(String jabatanPastor) {
        this.jabatanPastor = jabatanPastor;
    }

    public void setTanggalPastor(String tanggalPastor) {
        this.tanggalPastor = tanggalPastor;
    }

    public gereja(Parcel in) {
        namaParoki = in.readString();
        namaGereja = in.readString();
        alamat = in.readString();
        telepon = in.readString();
        stasi = in.readString();
        photo = in.readInt();
        namaPastor = in.readString();
        tanggalPastor = in.readString();
        jabatanPastor = in.readString();
        jumlahUmat = in.readString();
    }

    public static final Creator<gereja> CREATOR = new Creator<gereja>() {
        @Override
        public gereja createFromParcel(Parcel in) {
            return new gereja(in);
        }

        @Override
        public gereja[] newArray(int size) {
            return new gereja[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(namaParoki);
        dest.writeString(namaGereja);
        dest.writeString(alamat);
        dest.writeString(telepon);
        dest.writeString(stasi);
        dest.writeInt(photo);
        dest.writeString(namaPastor);
        dest.writeString(tanggalPastor);
        dest.writeString(jabatanPastor);
        dest.writeString(jumlahUmat);
    }
}
