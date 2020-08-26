package developer.candra_julius_sinaga.adapter;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import developer.candra_julius_sinaga.R;
import developer.candra_julius_sinaga.model.boarding;

public class AdapteronBoarding extends RecyclerView.Adapter<AdapteronBoarding.OnBoardingViewHolder>{

    private ArrayList<boarding>boardings;

    public AdapteronBoarding(ArrayList<boarding> boardings) {
        this.boardings = boardings;
    }

    @NonNull
    @Override
    public OnBoardingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.container_item_onboarding,parent,false);
        return new OnBoardingViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull OnBoardingViewHolder holder, int position) {
        holder.setOnBoardingData(boardings.get(position));
    }

    @Override
    public int getItemCount() {
        return boardings.size();
    }

    class OnBoardingViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;
    private ImageView image1;
    private TextView content;

        public OnBoardingViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.title1);
            image1 = itemView.findViewById(R.id.image1);
            content = itemView.findViewById(R.id.textDescription);
        }
        void setOnBoardingData(boarding boardingData){
            textView.setText(boardingData.getJudul());
            content.setText(boardingData.getContent());
            image1.setImageResource(boardingData.getImage());
        }
    }



}
