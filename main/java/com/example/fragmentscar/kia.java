package com.example.fragmentscar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class kia extends Fragment {
    Button kb1, kb2,kb3,kb4;
    TextView kt;
    ImageView kimg;
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view = inflater.inflate(R.layout.kia, viewGroup, false);
        kb1=(Button)view.findViewById(R.id.kb1);
        kb2=(Button)view.findViewById(R.id.kb2);
        kb3=(Button)view.findViewById(R.id.kb3);
        kb4=(Button)view.findViewById(R.id.kb4);
        kt=(TextView)view.findViewById(R.id.kt);
        kimg=(ImageView)view.findViewById(R.id.kimg);
        kb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kimg.setImageResource(R.drawable.k_seltos);
                kt.setText("Fuel type:Diesel \n Seating Capacity: 5 \n Boot Space: 433Lts \n Body Type: SUV");
            }
        });
        kb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kimg.setImageResource(R.drawable.k_sonet);
                kt.setText("Fuel type:Petrol \n Seating Capacity: 5 \n Boot Space: 392Lts \n Body Type: SUV");
            }
        });
        kb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kimg.setImageResource(R.drawable.k_carnival);
                kt.setText("Fuel type:Diesel \n Seating Capacity: 7 \n Boot Space: 54Lts \n Body Type: MUV");
            }
        });
        kb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kimg.setImageResource(R.drawable.k_stinger);
                kt.setText("Fuel type:Diesel \n Seating Capacity: 6 \n Boot Space: 500Lts \n Body Type: SUV");
            }
        });
        return view;
    }
}
