package developer.candra_julius_sinaga.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Nama_Rasul implements Parcelable {
    private String perayaan;
    private String lahir;
    private String kota_asal;
    private String wilayah_karya;
    private String wafat;
    private String beatifikasi;
    private String kanoniasi;
    private int photoRasul;
    private String detail;
    private String namaRasul;
    private String sumber;

    public Nama_Rasul() {
    }


    public String getPerayaan() {
        return perayaan;
    }

    public String getLahir() {
        return lahir;
    }

    public String getKota_asal() {
        return kota_asal;
    }

    public String getWilayah_karya() {
        return wilayah_karya;
    }

    public String getWafat() {
        return wafat;
    }

    public String getBeatifikasi() {
        return beatifikasi;
    }

    public String getKanoniasi() {
        return kanoniasi;
    }

    public int getPhotoRasul() {
        return photoRasul;
    }

    public String getDetail() {
        return detail;
    }

    public String getNamaRasul() {
        return namaRasul;
    }

    public String getSumber() {
        return sumber;
    }

    public static Creator<Nama_Rasul> getCREATOR() {
        return CREATOR;
    }

    public void setPerayaan(String perayaan) {
        this.perayaan = perayaan;
    }

    public void setLahir(String lahir) {
        this.lahir = lahir;
    }

    public void setKota_asal(String kota_asal) {
        this.kota_asal = kota_asal;
    }

    public void setWilayah_karya(String wilayah_karya) {
        this.wilayah_karya = wilayah_karya;
    }

    public void setWafat(String wafat) {
        this.wafat = wafat;
    }

    public void setBeatifikasi(String beatifikasi) {
        this.beatifikasi = beatifikasi;
    }

    public void setKanoniasi(String kanoniasi) {
        this.kanoniasi = kanoniasi;
    }

    public void setPhotoRasul(int photoRasul) {
        this.photoRasul = photoRasul;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setNamaRasul(String namaRasul) {
        this.namaRasul = namaRasul;
    }

    public void setSumber(String sumber) {
        this.sumber = sumber;
    }

    protected Nama_Rasul(Parcel in) {
        perayaan = in.readString();
        lahir = in.readString();
        kota_asal = in.readString();
        wilayah_karya = in.readString();
        wafat = in.readString();
        beatifikasi = in.readString();
        kanoniasi = in.readString();
        photoRasul = in.readInt();
        detail = in.readString();
        namaRasul = in.readString();
        sumber = in.readString();
    }

    public static final Creator<Nama_Rasul> CREATOR = new Creator<Nama_Rasul>() {
        @Override
        public Nama_Rasul createFromParcel(Parcel in) {
            return new Nama_Rasul(in);
        }

        @Override
        public Nama_Rasul[] newArray(int size) {
            return new Nama_Rasul[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(perayaan);
        dest.writeString(lahir);
        dest.writeString(kota_asal);
        dest.writeString(wilayah_karya);
        dest.writeString(wafat);
        dest.writeString(beatifikasi);
        dest.writeString(kanoniasi);
        dest.writeInt(photoRasul);
        dest.writeString(detail);
        dest.writeString(namaRasul);
        dest.writeString(sumber);
    }
}
