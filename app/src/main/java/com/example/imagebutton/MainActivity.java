package com.example.imagebutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;
    boolean flag;
    int images[]= {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4};
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.imgv);
        button=findViewById(R.id.btn);
        flag=true;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(images[i]);
                i++;
                if (i==4)
                    i=0;
            }
        });
    }
}