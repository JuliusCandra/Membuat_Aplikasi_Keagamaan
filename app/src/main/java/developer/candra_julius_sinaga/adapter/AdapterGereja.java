package developer.candra_julius_sinaga.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

import developer.candra_julius_sinaga.R;
import developer.candra_julius_sinaga.detail_activity.DetailGereja;
import developer.candra_julius_sinaga.model.gereja;

public class AdapterGereja extends RecyclerView.Adapter<AdapterGereja.GerejeViewHolder> implements Filterable {
    private ArrayList<gereja> jgereja;
    private ArrayList<gereja>searchGereja;
    private Context context;

    public AdapterGereja(ArrayList<gereja> jgereja, Context context) {
        this.jgereja = jgereja;
        this.context = context;
        searchGereja = new ArrayList<>(jgereja);
    }

    @NonNull
    @Override
    public AdapterGereja.GerejeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View candra = LayoutInflater.from(context).inflate(R.layout.gereja,parent,false);
        return new GerejeViewHolder(candra);
    }

    @Override
    public void onBindViewHolder(@NonNull final AdapterGereja.GerejeViewHolder holder, final int position) {
            final gereja cgereja = jgereja.get(position);
        Glide.with(holder.itemView.getContext())
                .load(cgereja.getPhoto())
                .apply(new RequestOptions().override(100,100))
                .into(holder.image1);
        holder.namaParoki.setText(cgereja.getNamaParoki());
        holder.namaGereja.setText(cgereja.getNamaGereja());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailGereja.class);
                intent.putExtra("nama_paroki",cgereja.getNamaParoki());
                intent.putExtra("nama_gereja",cgereja.getNamaGereja());
                intent.putExtra("alamat",cgereja.getAlamat());
                intent.putExtra("telepon",cgereja.getTelepon());
                intent.putExtra("stasi",cgereja.getStasi());
                intent.putExtra("nama_pastor",cgereja.getNamaPastor());
                intent.putExtra("jabatan_pastor",cgereja.getJabatanPastor());
                intent.putExtra("tanggal_pastor",cgereja.getTanggalPastor());
                intent.putExtra("photo_gereja",cgereja.getPhoto());
                intent.putExtra("jumlah_umat",cgereja.getJumlahUmat());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return jgereja.size();
    }

    @Override
    public Filter getFilter() {
        return searchDataFilter;
    }

    private Filter searchDataFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            ArrayList<gereja> gerejaFilter = new ArrayList<>();

            if (constraint == null || constraint.length() == 0){
                gerejaFilter.addAll(searchGereja);
            }else{
                String filterData = constraint.toString().toLowerCase().trim();

                for (gereja itemGereja : searchGereja){
                    if (itemGereja.getNamaParoki().toLowerCase().contains(filterData) || itemGereja.getNamaGereja().toLowerCase().contains(filterData)){
                        gerejaFilter.add(itemGereja);
                    }
                }
            }
            FilterResults results = new FilterResults();
            results.values = gerejaFilter;

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            jgereja.clear();
            jgereja.addAll((ArrayList)results.values);
            notifyDataSetChanged();
        }
    };

    public static class GerejeViewHolder extends RecyclerView.ViewHolder{
        ImageView image1;
        MaterialTextView namaParoki;
        TextView namaGereja;
        public GerejeViewHolder(@NonNull View itemView) {
            super(itemView);
            image1 = itemView.findViewById(R.id.photoGereja);
            namaParoki = itemView.findViewById(R.id.namaParoki);
            namaGereja = itemView.findViewById(R.id.namaGereja);
        }
    }


}
