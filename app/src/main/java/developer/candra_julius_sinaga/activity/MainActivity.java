package developer.candra_julius_sinaga.activity;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TabHost;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;

import developer.candra_julius_sinaga.R;

public class MainActivity extends AppCompatActivity{

    private MaterialTextView namaText;
    private MaterialCardView CJgereja;
    private MaterialCardView CJrasul;
    private MaterialCardView CJdoa;
    private static final String TAG = "Pilihan Kamu";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        namaText = findViewById(R.id.nama);
        CJgereja = findViewById(R.id.gereja1);
        CJrasul = findViewById(R.id.rasul1);
        CJdoa = findViewById(R.id.doa1);

//        CJgereja.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d(TAG,"Klik untuk gereja");
//                Toast.makeText(MainActivity.this, "Anda memilih gereja", Toast.LENGTH_SHORT).show();
//                startActivity(new Intent(MainActivity.this,GerejaActivity.class));
//                finish();
////
//            }
//        });

        CJdoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"Klik untuk doa");
                Toast.makeText(MainActivity.this, "Anda memilih doa", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,DoaActivity.class));
            }
        });

        CJgereja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"Klik untuk gereja");
                Toast.makeText(MainActivity.this,"Anda memilih gereja",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,GerejaActivity.class));
            }
        });

        namaText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"Klik untuk nama");
                Toast.makeText(MainActivity.this, "Anda memilih developer", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,Developer.class));
                finish();
            }
        });

        CJrasul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"Klik untuk rasul");
                Toast.makeText(MainActivity.this,"Anda memilih rasul",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,RasulActivity.class));
            }
        });

    }

}
