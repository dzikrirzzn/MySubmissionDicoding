package com.example.mysubmissiondicoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public TextView tvdetails;
    public ImageView imgUnicorn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_content);

        tvdetails = findViewById(R.id.info);
        imgUnicorn = findViewById(R.id.img_item_photo);

        Unicorn extra = getIntent().getParcelableExtra("objek");
        imgUnicorn.setImageResource(extra.getPhoto());
        tvdetails.setText(extra.getDetail());
    }
}
