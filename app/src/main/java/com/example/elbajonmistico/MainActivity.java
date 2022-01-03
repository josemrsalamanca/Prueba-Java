package com.example.elbajonmistico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.elbajonmistico.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private float sum = 0;
    private float valor1;
    private float valor2;
    private float valor3;
    private float valor4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }


    public void isCheck1(){
        if (binding.check1.isChecked()){
            valor1 = 3500;
        }
    }

    public void isCheck2(){
        if (binding.check2.isChecked()){
            valor2 = 3800;
        }
    }

    public void isCheck3(){
        if (binding.check1.isChecked()){
            valor3 = 3500;
        }
    }

    public void isCheck4(){
        if (binding.check1.isChecked()){
            valor4 = 4000;
        }
    }

    public void setSum(){
        sum = valor1 + valor2 + valor3 + valor4;
    }

    public void valor(){
        if(sum > 5000){
            sum = (sum * 95)/100 ;
            binding.edt5.setText("El Subtotal es: "+ sum);
        }
    }
}