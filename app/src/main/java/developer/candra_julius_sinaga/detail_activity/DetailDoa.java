package developer.candra_julius_sinaga.detail_activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.TextViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.textview.MaterialTextView;

import java.util.Objects;

import developer.candra_julius_sinaga.R;
import developer.candra_julius_sinaga.model.nama_nama_doa;

public class DetailDoa extends AppCompatActivity {
    private MaterialTextView textdoa,textDetailDoa;
    private Toolbar toolbar;
    private MaterialTextView materialTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_doa);
        textdoa = findViewById(R.id.judulDoa);
        textDetailDoa = findViewById(R.id.detailDoa);
        toolbar = findViewById(R.id.toolbar1);

        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        nama_nama_doa doa = intent.getParcelableExtra("data");

        if (doa != null) {
            String doaJudul = doa.getNamaDoa();
            String doaDetail = doa.getDetailDoa();
            textdoa.setText(doaJudul);
            textDetailDoa.setText(doaDetail);
        }

    }
}
