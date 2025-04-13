package com.example.simplecaluclator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        e1=this.<EditText>findViewById(R.id.edit1);
        e2=this.<EditText>findViewById(R.id.edit2);
        t1=this.<TextView>findViewById(R.id.text1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void Pluse(View view) {
        int a,b,c;
        a=Integer.parseInt(e1.getText().toString());
        b=Integer.parseInt(e2.getText().toString());
        c=a+b;
        t1.setText(""+c);
    }

    public void Minus(View view) {
        int a,b,c;
        a=Integer.parseInt(e1.getText().toString());
        b=Integer.parseInt(e2.getText().toString());
        c=a-b;
        t1.setText(""+c);
    }

    public void Multiplication(View view) {
        int a,b,c;
        a=Integer.parseInt(e1.getText().toString());
        b=Integer.parseInt(e2.getText().toString());
        c=a*b;
        t1.setText(""+c);
    }

    public void Division(View view) {
        int a,b,c;
        a=Integer.parseInt(e1.getText().toString());
        b=Integer.parseInt(e2.getText().toString());
        c=a/b;
        t1.setText(""+c);
    }
}