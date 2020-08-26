package developer.candra_julius_sinaga.detail_activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.textview.MaterialTextView;
import developer.candra_julius_sinaga.R;

public class DetailGereja extends AppCompatActivity {
    private Toolbar toolbar;
    private ImageView gambar;
    private MaterialTextView textNamaParoki,textNamaGereja,textNamaPastor,textJabatanPastor;
    private MaterialTextView textNamaStasi,textJumlahUmat,textTelephone,textTanggalMasuk,textAlamat;
    String alamat,jumlahUmat,namaGereja,namaPastor,namaParoki,tanggalMasuk,stasi,jabatanPastor,nmrTelepon;
    int photo;
    private CollapsingToolbarLayout layout;
    int collapse = 15;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_gereja);
        toolbar = findViewById(R.id.Toolbar);
        textNamaPastor = findViewById(R.id.namaPastor);
        textNamaGereja = findViewById(R.id.Namagereja1);
        textAlamat = findViewById(R.id.alamat);
        textJabatanPastor = findViewById(R.id.jabatanPastor);
        textTelephone = findViewById(R.id.telepon);
        textNamaStasi = findViewById(R.id.namaStasi);
        textNamaParoki = findViewById(R.id.paroki1);
        textJumlahUmat = findViewById(R.id.jumlahUmat);
        textTanggalMasuk = findViewById(R.id.tanggalMasukPastor);
        gambar = findViewById(R.id.gambar2);

        layout = findViewById(R.id.collapsingBarLayout);
        layout.setCollapsedTitleTextAppearance(collapse);
        layout.setScrimAnimationDuration(10L);

        namaGereja = getIntent().getStringExtra("nama_gereja");
        namaParoki = getIntent().getStringExtra("nama_paroki");
        jumlahUmat = getIntent().getStringExtra("jumlah_umat");
        nmrTelepon = getIntent().getStringExtra("telepon");
        tanggalMasuk = getIntent().getStringExtra("tanggal_pastor");
        stasi = getIntent().getStringExtra("stasi");
        jabatanPastor = getIntent().getStringExtra("jabatan_pastor");
        alamat = getIntent().getStringExtra("alamat");
        namaPastor = getIntent().getStringExtra("nama_pastor");
        photo = getIntent().getIntExtra("photo_gereja",0);

        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(namaParoki);
            getSupportActionBar().setSubtitle(namaGereja);
        }

        textNamaGereja.setText(namaGereja);
        textNamaParoki.setText(namaParoki);
        textNamaStasi.setText(stasi);
        textAlamat.setText(alamat);
        textJumlahUmat.setText(jumlahUmat);
        textTanggalMasuk.setText(tanggalMasuk);
        gambar.setImageResource(photo);
        textTanggalMasuk.setText(tanggalMasuk);
        textTelephone.setText(nmrTelepon);
        textNamaPastor.setText(namaPastor);
        textJabatanPastor.setText(jabatanPastor);





    }
}
