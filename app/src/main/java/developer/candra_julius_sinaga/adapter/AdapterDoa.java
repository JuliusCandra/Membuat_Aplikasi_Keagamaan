package developer.candra_julius_sinaga.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

import developer.candra_julius_sinaga.R;
import developer.candra_julius_sinaga.model.nama_nama_doa;

public class AdapterDoa extends BaseAdapter {
        private Context context;
        private ArrayList<nama_nama_doa> nama_nama_doas;

    public AdapterDoa(Context context,ArrayList<nama_nama_doa> nama_nama_doas) {
        this.context = context;
        this.nama_nama_doas = nama_nama_doas;
    }

    @Override
    public int getCount() {
        return nama_nama_doas.size();
    }

    @Override
    public Object getItem(int position) {
        return nama_nama_doas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View layout = convertView;
        if (layout == null){
            layout = LayoutInflater.from(context).inflate(R.layout.listitem,parent,false);
        }
        ViewHolder vew = new ViewHolder(layout);
        nama_nama_doa nama_doa = (nama_nama_doa)getItem(position);
        vew.bind(nama_doa);
        return layout;
    }

    private class ViewHolder{
        private MaterialTextView text1;
        ViewHolder(View layout){
            text1 = layout.findViewById(R.id.textlayout);
        }
        void bind(nama_nama_doa doa){
            text1.setText(doa.getNamaDoa());
        }

    }
}
