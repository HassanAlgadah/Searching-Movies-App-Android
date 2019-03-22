package com.example.popularmoviesstage1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
public class Details extends AppCompatActivity {
    private TextView name;
    private ImageView img;
    private TextView ratings;
    private TextView overview;
    private TextView rels;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent in = getIntent();
        name = findViewById(R.id.Name);
        img = findViewById(R.id.image_iv);
        ratings = findViewById(R.id.rat);
        overview = findViewById(R.id.Over);
        rels = findViewById(R.id.rd);


        name.setText(in.getStringExtra("name"));
        overview.setText(in.getStringExtra("overviow"));
        rels.setText(in.getStringExtra("release date"));
        ratings.setText(in.getStringExtra("vote average"));
        String im = "http://image.tmdb.org/t/p/w300/"+in.getStringExtra("Image");
        System.out.println(im);
        Picasso.with(this)
                .load(im)
                .into(img);

    }
}
