package developer.candra_julius_sinaga.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import java.nio.channels.InterruptedByTimeoutException;
import java.util.ArrayList;

import developer.candra_julius_sinaga.R;
import developer.candra_julius_sinaga.adapter.AdapterRasul;
import developer.candra_julius_sinaga.data.Data_Rasul;
import developer.candra_julius_sinaga.detail_activity.DetailRasul;
import developer.candra_julius_sinaga.model.Nama_Rasul;

public class RasulActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Nama_Rasul> nama_rasuls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Keagamaan");
            getSupportActionBar().setSubtitle("Rasul");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        setContentView(R.layout.activity_rasul);
        recyclerView = findViewById(R.id.listRasul);
        nama_rasuls.addAll(Data_Rasul.getDataRasul());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdapterRasul adapterRasul = new AdapterRasul(this,nama_rasuls);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapterRasul);


    }
}
