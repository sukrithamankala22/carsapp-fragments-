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

public class SuzikiFragment extends Fragment {
    Button sb1, sb2,sb3,sb4;
    TextView st;
    ImageView simg;

    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view = inflater.inflate(R.layout.suziki_fragment, viewGroup, false);
        sb1 = (Button) view.findViewById(R.id.sb1);
        sb2 = (Button) view.findViewById(R.id.sb2);
        sb3 = (Button) view.findViewById(R.id.sb3);
        sb4 = (Button) view.findViewById(R.id.sb4);
        st = (TextView) view.findViewById(R.id.st);
        simg = (ImageView) view.findViewById(R.id.simg);
        sb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                simg.setImageResource(R.drawable.s_swift);
                st.setText("Fuel type:Petrol \n Seating Capacity: 5 \n Boot Space: 268Lts \n Body Type: Hatch Back");
            }
        });
        sb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                simg.setImageResource(R.drawable.s_ciaz);
                st.setText("Fuel type:Petrol \n Seating Capacity: 5 \n Boot Space: 510 Lts \n Body Type: Sedan");
            }
        });
        sb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                simg.setImageResource(R.drawable.s_brezza);
                st.setText("Fuel type:Petrol \n Seating Capacity: 5 \n Boot Space: 328 Lts \n Body Type: SUV");
            }
        });
        sb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simg.setImageResource(R.drawable.s_dezire);
                st.setText("Fuel type:Petrol \n Seating Capacity: 5 \n Boot Space: 378 Lts \n Body Type: Sedan");
            }
        });
        return view;
    }
}
