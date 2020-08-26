package developer.candra_julius_sinaga.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import java.util.ArrayList;

import developer.candra_julius_sinaga.R;
import developer.candra_julius_sinaga.detail_activity.DetailRasul;
import developer.candra_julius_sinaga.model.Nama_Rasul;

public class AdapterRasul extends RecyclerView.Adapter<AdapterRasul.OnRasulViewHolder>  {
    private ArrayList<Nama_Rasul> nama_rasuls;
    private Context context;


    public AdapterRasul(Context context, ArrayList<Nama_Rasul> nama_rasuls) {
        this.context = context;
        this.nama_rasuls = nama_rasuls;
    }

    @NonNull
    @Override
    public AdapterRasul.OnRasulViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_rasul,parent,false);
        return new OnRasulViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final AdapterRasul.OnRasulViewHolder holder, final int position) {
        final Nama_Rasul nama_rasul = nama_rasuls.get(position);
        Glide.with(holder.itemView.getContext()).load(nama_rasul.getPhotoRasul()).apply(new RequestOptions().override(100,100))
                .into(holder.photo);
        holder.textNamaRasul.setText(nama_rasul.getNamaRasul());
        holder.textPerayaan.setText(nama_rasul.getPerayaan());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailRasul = new Intent(context, DetailRasul.class);
                detailRasul.putExtra("dataRasul",nama_rasuls.get(position));
                context.startActivity(detailRasul);
            }
        });

    }

    @Override
    public int getItemCount() {
        return nama_rasuls.size();
    }

    public  class OnRasulViewHolder extends RecyclerView.ViewHolder {
        ImageView photo;
        TextView textNamaRasul,textPerayaan;
        public OnRasulViewHolder(@NonNull View itemView) {
            super(itemView);
            photo = itemView.findViewById(R.id.gambarRasul);
            textNamaRasul = itemView.findViewById(R.id.namaRasul);
            textPerayaan = itemView.findViewById(R.id.perayaan);
        }
    }
}
