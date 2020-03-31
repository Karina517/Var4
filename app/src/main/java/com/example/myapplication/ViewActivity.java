package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class ViewActivity extends AppCompatActivity {

    TextView AvName;
    TextView AVDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        Intent intent = getIntent();
        String partyName = intent.getStringExtra("party_name");
        String partyDetails = intent.getStringExtra("party_details");
        String partyImageURL=intent.getStringExtra("party_imageURL");
        AVName=findViewById(R.id.AVname);
        AVDetails=findViewById(R.id.AVdetails);
        
        AVdetails.setText(partyDetails);
        AVName.setText(partyName);
        ImageView AVimage = findViewById(R.id.AVimage);
        Glide.with(this).load(partyImageURL).into(AVimage);
        
    }
}
