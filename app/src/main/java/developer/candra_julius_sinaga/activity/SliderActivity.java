package developer.candra_julius_sinaga.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

import developer.candra_julius_sinaga.R;
import developer.candra_julius_sinaga.adapter.AdapteronBoarding;
import developer.candra_julius_sinaga.model.boarding;

public class SliderActivity extends AppCompatActivity {
    // Menginisasi linear layout
    private LinearLayout indicatorLayout1;
    // Mneginisiasi adapter
    private AdapteronBoarding adapteronBoarding;
    // Menginisiasi button
    private MaterialButton button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);
        // Mencari linear layout manager di resource layout
        indicatorLayout1 = findViewById(R.id.layoutonBoardingIndicator);
        button2 = findViewById(R.id.button1);
        setDataOnBoardign(); // Membuat data baru
        // Mencari viewpager2 di resource layout
        final ViewPager2 viewPager2 = findViewById(R.id.pager2);
        // memasukkan adapter yang telah dibuat ke view pager
        viewPager2.setAdapter(adapteronBoarding);
        // Membuat indicator pada view pager
        setUpIndicator();
        // Mengganti indicator ketika waktu digeser
        setCurrentOnBoardingIndicator(0);
        // Membuat indicator aktif
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                setCurrentOnBoardingIndicator(position);
            }
        });

        // Membuat aksi pada button
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (viewPager2.getCurrentItem() + 1 < adapteronBoarding.getItemCount()){
                    viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
                }else{
                    startActivity(new Intent(SliderActivity.this,MainActivity.class));
                    finish();
                }
            }
        });
    }

    // Membuat data baru
    private void setDataOnBoardign(){
        ArrayList<boarding>boardings = new ArrayList<>();

        boarding boarding1 = new boarding();
        boarding1.setJudul("Gereja");
        boarding1.setContent("Fitur yang mengetahui lebih tentang gereja");
        boarding1.setImage(R.drawable.gereja);

        boarding boarding2 = new boarding();
        boarding2.setJudul("Doa");
        boarding2.setContent("Fitur yang mengetahui lebih tentang doa");
        boarding2.setImage(R.drawable.doa);

        boarding boarding3 = new boarding();
        boarding3.setJudul("12 Murid Tuhan Yesus");
        boarding3.setContent("Fitur yang mengetahui lebih tentang 12 murid tuhan yesus yang selalu bersamanya");
        boarding3.setImage(R.drawable.rasul1);

        boardings.add(boarding1);
        boardings.add(boarding2);
        boardings.add(boarding3);

        adapteronBoarding = new AdapteronBoarding(boardings);

    }

    // Function yang digunakan untuk membuat indicator
    private void setUpIndicator(){
        ImageView [] indicator = new ImageView[adapteronBoarding.getItemCount()];
        LinearLayout.LayoutParams layoutParams1 = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT
        );
        layoutParams1.setMargins(0,0,0,0);
        for (int i = 0; i < indicator.length; i++){
            indicator[i] = new ImageView(getApplicationContext());
            indicator[i].setImageDrawable(ContextCompat.getDrawable(
                    getApplication(),
                    R.drawable.on_boarding_indicator_inactive
            ));
            indicator[i].setLayoutParams(layoutParams1);
            indicatorLayout1.addView(indicator[i]);
        }
    }

    // Function yang dibuat untuk mengatur indicator saat ini
    private void setCurrentOnBoardingIndicator(int index){
        String start = "Start";
        String next = "Next";
        int childCount = indicatorLayout1.getChildCount();
        for (int i = 0; i < childCount; i++){
            ImageView imageView = (ImageView)indicatorLayout1.getChildAt(i);
            if (i == index){
                imageView.setImageDrawable(
                        ContextCompat.getDrawable(getApplicationContext(),R.drawable.on_boarding_indicator_active)
                );
            }else{
                imageView.setImageDrawable(
                        ContextCompat.getDrawable(getApplicationContext(),R.drawable.on_boarding_indicator_inactive)
                );
            }
        }
        if (index == adapteronBoarding.getItemCount()-1)
        {
            button2.setText(start);
        }else{
            button2.setText(next);
        }
    }

}
