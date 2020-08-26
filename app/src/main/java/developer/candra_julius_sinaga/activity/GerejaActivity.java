package developer.candra_julius_sinaga.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import developer.candra_julius_sinaga.R;
import developer.candra_julius_sinaga.adapter.AdapterGereja;
import developer.candra_julius_sinaga.data.Data1;
import developer.candra_julius_sinaga.model.gereja;

public class GerejaActivity extends AppCompatActivity {
    private RecyclerView layout;
    private ArrayList<gereja> cgereja = new ArrayList<>();
    private AdapterGereja adapterGereja;
    private static final String TAG = "kemunculan data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gereja);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Keagamaan");
            getSupportActionBar().setSubtitle("Gereja");
        }
        layout = findViewById(R.id.layoutGereja);
        layout.setHasFixedSize(true);
        cgereja.addAll(Data1.getDataGereja());
        layout.setLayoutManager(new LinearLayoutManager(this));
        adapterGereja = new AdapterGereja(cgereja, this);
        layout.setAdapter(adapterGereja);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater layout = getMenuInflater();
        layout.inflate(R.menu.menu, menu);


        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        MenuItem searchMana = menu.findItem(R.id.search);
        if (searchManager != null) {
            SearchView searchView = (SearchView) (menu.findItem(R.id.search)).getActionView();
            searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
            searchView.setQueryHint("Cari disini");
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public boolean onQueryTextSubmit(String query) {
                        Log.d(TAG, "onQueryTextSubmit");
                        adapterGereja.getFilter().filter(query);
                        Toast.makeText(GerejaActivity.this, query, Toast.LENGTH_SHORT).show();
                    return true;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    Log.d(TAG, "onQueryTextChange");
                    adapterGereja.getFilter().filter(newText);
                    return true;
                }
            });
        }
        searchMana.getIcon().setVisible(false, false);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if  (item.getItemId() == R.id.about){
            boolean insatalled = Wa("com.whatsapp");
            if (insatalled){
                String hallo = "Hallo admin saya suka dengan aplikasi anda";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/6282166759562/?text= " + hallo )));

            }else{
                Toast.makeText(this,"kamu belum menginstall WhatssApp,Silahkan Instal terlebih dahulu",Toast.LENGTH_SHORT).show();
            }

        }
        return super.onOptionsItemSelected(item);
    }

    private boolean Wa(String url){
        PackageManager packageManager = getPackageManager();
        boolean Installed;
        try {
            packageManager.getPackageInfo(url,PackageManager.GET_ACTIVITIES);
            Installed = true;
        } catch (PackageManager.NameNotFoundException e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            Installed = false;
        }
        return Installed;
    }
}
