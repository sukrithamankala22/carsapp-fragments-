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
public class bmw extends Fragment{
    Button bb1, bb2,bb3,bb4;
    TextView bt;
    ImageView bimg;
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view = inflater.inflate(R.layout.bmw, viewGroup, false);
        bb1 = (Button) view.findViewById(R.id.bb1);
        bb2 = (Button) view.findViewById(R.id.bb2);
        bb3 = (Button) view.findViewById(R.id.bb3);
        bb4 = (Button) view.findViewById(R.id.bb4);
        bt = (TextView) view.findViewById(R.id.bt);
        bimg = (ImageView) view.findViewById(R.id.bimg);
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bimg.setImageResource(R.drawable.b_x1);
                bt.setText("Fuel type:Diesel \n Seating Capacity: 5 \n Boot Space: - \n Body Type: SUV");
            }
        });
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bimg.setImageResource(R.drawable.b_x3);
                bt.setText("Fuel type:Diesel \n Seating Capacity: 5 \n Boot Space: 485Lts \n Body Type: SUV");
            }
        });
        bb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bimg.setImageResource(R.drawable.b_x5);
                bt.setText("Fuel type:Petrol \n Seating Capacity: 5 \n Boot Space: - \n Body Type: SUV");
            }
        });
        bb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bimg.setImageResource(R.drawable.b_cx6);
                bt.setText("Fuel type:Petrol \n Seating Capacity: 5 \n Boot Space: - \n Body Type: Luxury");
            }
        });
        return view;
    }
}