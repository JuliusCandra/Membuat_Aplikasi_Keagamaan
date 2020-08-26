package developer.candra_julius_sinaga.detail_activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import developer.candra_julius_sinaga.R;
import developer.candra_julius_sinaga.model.Nama_Rasul;
import ru.embersoft.expandabletextview.ExpandableTextView;

public class DetailRasul extends AppCompatActivity {
    private Toolbar toolbar;
    private TextView textNamaRasul,textPerayaan,textLahir,textWafat,textWilayahKarya,kotaasl;
    private TextView content;
    private TextView textSumber;
    private ImageView gambar1,gambar2;
    private TextView toolbar1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_rasul);
        kotaasl = findViewById(R.id.Kota_asal);
        textNamaRasul = findViewById(R.id.nama_rasul);
        textPerayaan = findViewById(R.id.perayaan_rasul);
        textLahir = findViewById(R.id.lahir);
        textWafat = findViewById(R.id.wafat);
        toolbar = findViewById(R.id.toolbar2);
        textWilayahKarya = findViewById(R.id.wilayah_karya);
        content = findViewById(R.id.textContent);
        textSumber = findViewById(R.id.textSUmber);
        gambar1 = findViewById(R.id.gambarContent);
        gambar2 = findViewById(R.id.satugambar);
        toolbar1 = findViewById(R.id.textToolbar1);
        kotaasl = findViewById(R.id.Kota_asal);

        Intent mDetailIntent = getIntent();
        Nama_Rasul nama_rasul = mDetailIntent.getParcelableExtra("dataRasul");
        if (nama_rasul != null) {
            final int gambarRasul = nama_rasul.getPhotoRasul();
            String namaRasul = nama_rasul.getNamaRasul();
            String perayaan = nama_rasul.getPerayaan();
            String lahir = nama_rasul.getLahir();
            String wwafat = nama_rasul.getWafat();
            String asal = nama_rasul.getKota_asal();
            String wilayakarya = nama_rasul.getWilayah_karya();
            String texxtContent = nama_rasul.getDetail();
            final String sumber = nama_rasul.getSumber();


            setSupportActionBar(toolbar);
            if  (getSupportActionBar() != null){
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                getSupportActionBar().setDisplayUseLogoEnabled(false);
                getSupportActionBar().setDisplayShowTitleEnabled(false);
            }

            textNamaRasul.setText(namaRasul);
            textPerayaan.setText(perayaan);
            textLahir.setText(lahir);
            textWafat.setText(wwafat);
            textWilayahKarya.setText(wilayakarya);
            content.setText(texxtContent);
            textSumber.setText(sumber);
            kotaasl.setText(asal);
            textSumber.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent web  = new Intent(Intent.ACTION_VIEW,Uri.parse(sumber));
                    startActivity(web);
                }
            });
            gambar1.setImageResource(gambarRasul);
            gambar2.setImageResource(gambarRasul);
            toolbar1.setText(namaRasul);


        }

    }
}
