package developer.candra_julius_sinaga.model;

import android.os.Parcel;
import android.os.Parcelable;

public class nama_nama_doa implements Parcelable {
    private String namaDoa;
    private String detailDoa;

    public nama_nama_doa() {

    }

    protected nama_nama_doa(Parcel in) {
        namaDoa = in.readString();
        detailDoa = in.readString();
    }

    public static final Creator<nama_nama_doa> CREATOR = new Creator<nama_nama_doa>() {
        @Override
        public nama_nama_doa createFromParcel(Parcel in) {
            return new nama_nama_doa(in);
        }

        @Override
        public nama_nama_doa[] newArray(int size) {
            return new nama_nama_doa[size];
        }
    };

    public String getNamaDoa() {
        return namaDoa;
    }

    public String getDetailDoa() {
        return detailDoa;
    }

    public void setNamaDoa(String namaDoa) {
        this.namaDoa = namaDoa;
    }

    public void setDetailDoa(String detailDoa) {
        this.detailDoa = detailDoa;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(namaDoa);
        dest.writeString(detailDoa);
    }
}
