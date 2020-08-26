package developer.candra_julius_sinaga.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

import java.net.URI;

import developer.candra_julius_sinaga.R;

public class Developer extends AppCompatActivity {
    private ImageView back;
    private final String TAG = "beranda";
    private CardView developerGmail;
    private CardView developerFacebook,developerInstagram,developerLokasi;
    private CardView developerWhatsapp;
    private CardView developerTelephone;
    private ImageView gambar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);
        back = findViewById(R.id.back);
        if  (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Developer");
        }
        developerFacebook = findViewById(R.id.developerCardFacebook);
        developerGmail = findViewById(R.id.developerCardEmail);
        developerInstagram = findViewById(R.id.developerCardInstagram);
        developerLokasi = findViewById(R.id.developerCardLokasi);
        developerWhatsapp = findViewById(R.id.developerCardWhatssapp);
        developerTelephone = findViewById(R.id.developerCardTelepone);
        gambar2 = findViewById(R.id.gambar1);


        gambar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"Anda kembali ke beranda");
                startActivity(new Intent(Developer.this,MainActivity.class));
                finish();

            }
        });

        developerTelephone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String telepone = "082311558341";
                Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:" + telepone ));
                startActivity(intent);
            }
        });

        developerWhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean WhatssAppInstalled = appInstalledOrNot("com.whatsapp");
                String hello = "Hello developer saya ingin request aplikasi dong.";
                if (WhatssAppInstalled) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://wa.me/6282166759562/?text=" + hello ));
                    startActivity(intent);
                }else{
                    Toast.makeText(Developer.this, "Anda belum menginstall Whatsapp, Silahkan Instal Terlebih dahulu", Toast.LENGTH_SHORT).show();
                }
            }
        });

        developerGmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = "candrajulius1@gmail.com";
                String subject = "Komentar";
                String body = "Buat komentar anda disini";
                sendEmail(email,subject,body);
            }
        });

        developerFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.facebook.com/candra.julius.52";
                openFacebook(url);
            }
        });

        developerInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://instagram.com/_u/candrajuliussinaga";
                openInstagram(url);
            }
        });

        developerLokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lokasi = new Intent(Intent.ACTION_VIEW);
                lokasi.setData(Uri.parse("geo:3.601989, 98.682782"));
                Intent intent = Intent.createChooser(lokasi,"Buka Map");
                startActivity(intent);
            }
        });
    }

    // Function yang digunakan untuk memanggil whtasapp
    private boolean appInstalledOrNot(String url){
        PackageManager packageManager = getPackageManager();
        boolean app_Installed;
        try {
            packageManager.getPackageInfo(url,PackageManager.GET_ACTIVITIES);
            app_Installed = true;
        } catch (PackageManager.NameNotFoundException e) {
            app_Installed = false;
        }
        return app_Installed;
    }

    @SuppressLint("IntentReset")
    private void sendEmail(String email, String subject, String body,String uid){
        Intent Gmail = new Intent(Intent.ACTION_SEND);
        Gmail.setData(Uri.parse("email"));
        Gmail.setType("text/plain");
        Gmail.putExtra(Intent.EXTRA_EMAIL,email);
        Gmail.putExtra(Intent.EXTRA_SUBJECT,subject);
        Gmail.putExtra(Intent.EXTRA_TEXT,body);
        try {
            startActivity(Intent.createChooser(Gmail,"Pilih Email"));
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void openFacebook(String url){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
        startActivity(intent);
    }

    private void openInstagram(String url){
        Intent instagram = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
        instagram.setPackage("com.instagram.android");
        try {
            startActivity(instagram);
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }


}
