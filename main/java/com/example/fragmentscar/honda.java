package com.example.fragmentscar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.zip.Inflater;

public class honda extends Fragment {
    Button hb1, hb2, hb3, hb4;
    TextView ht;
    ImageView himg;

    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view = inflater.inflate(R.layout.honda, viewGroup, false);
        hb1= (Button)view.findViewById(R.id.hb1);
        hb2= (Button)view.findViewById(R.id.hb2);
        hb3= (Button)view.findViewById(R.id.hb3);
        hb4= (Button)view.findViewById(R.id.hb4);
        ht=(TextView)view.findViewById(R.id.ht);
        himg=(ImageView)view.findViewById(R.id.himg);
        hb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                himg.setImageResource(R.drawable.h_civic);
                ht.setText("Fuel type:Diesel \n Seating Capacity: 5 \n Boot Space: 430lts \n Body Type: Sedan");
            }
        });
        hb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                himg.setImageResource(R.drawable.h_crv);
                ht.setText("Fuel type:Petrol \n Seating Capacity: 5 \n Boot Space: 522lts \n Body Type: SUV");
            }
        });
        hb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                himg.setImageResource(R.drawable.h_city);
                ht.setText("Fuel type:Diesel \n Seating Capacity: 5 \n Boot Space: 506Lts \n Body Type: Sedan");
            }
        });
        hb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                himg.setImageResource(R.drawable.h_wrv);
                ht.setText("Fuel type:Diesel \n Seating Capacity: 5 \n Boot Space: 363Lts \n Body Type: SUV");
            }
        });
        return view;
    }
}