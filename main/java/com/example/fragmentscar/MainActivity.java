package com.example.fragmentscar;
import androidx.appcompat.app.AppCompatActivity; import androidx.fragment.app.FragmentManager; import androidx.fragment.app.FragmentTransaction; import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity { FragmentManager fragmentManager; FragmentTransaction fragmentTransaction; @Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    fragmentManager=getSupportFragmentManager();
    fragmentTransaction=fragmentManager.beginTransaction();
    fragmentTransaction.add(R.id.frame,new SuzikiFragment());
    fragmentTransaction.commit();
}
    public void suzukic(View view)
    {
        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame,new SuzikiFragment());
        fragmentTransaction.commit();
    }
    public void bmwc(View view)
    {
        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame,new bmw());
        fragmentTransaction.commit();
    }
    public void hondac(View view)
    {
        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame,new honda());
        fragmentTransaction.commit();
    }
    public void kiac(View view)
    {
        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame,new kia());
        fragmentTransaction.commit();

    }
}
