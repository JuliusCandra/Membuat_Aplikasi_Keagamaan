package developer.candra_julius_sinaga.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.google.android.material.textview.MaterialTextView;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

import developer.candra_julius_sinaga.R;

public class SplashActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private MaterialTextView textView;
     long berhenti = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        progressBar = findViewById(R.id.progressbar);
        textView = findViewById(R.id.loading);

        waktu();

    }

    private void waktu(){
        Timer time = new Timer();
        TimerTask waktuMenunjukkan = new TimerTask() {
            @Override
            public void run() {
                finish();
                Intent pindah = new Intent(SplashActivity.this,SliderActivity.class);
                startActivity(pindah);
            }
        };
        time.schedule(waktuMenunjukkan,berhenti);
    }
}
