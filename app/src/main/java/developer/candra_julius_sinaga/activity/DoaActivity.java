package developer.candra_julius_sinaga.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import developer.candra_julius_sinaga.R;
import developer.candra_julius_sinaga.adapter.AdapterDoa;
import developer.candra_julius_sinaga.data.Data1;
import developer.candra_julius_sinaga.data.Data_Doa;
import developer.candra_julius_sinaga.detail_activity.DetailDoa;
import developer.candra_julius_sinaga.model.nama_nama_doa;

public class DoaActivity extends AppCompatActivity {
    private ArrayList<nama_nama_doa>doa = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Keagamaan");
            getSupportActionBar().setSubtitle("Doa");
        }
        setContentView(R.layout.activity_doa);
        ListView list = findViewById(R.id.list1);
        doa.addAll(Data_Doa.getDoa());
        AdapterDoa adapterDoa = new AdapterDoa(this,doa);
        list.setAdapter(adapterDoa);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent listItem = new Intent(DoaActivity.this, DetailDoa.class);
                listItem.putExtra("data",doa.get(position));
                startActivity(listItem);
            }
        });
    }

}
