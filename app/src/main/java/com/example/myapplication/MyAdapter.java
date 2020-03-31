package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import com.bumptech.glide.Glide;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    ArrayList<Party> data;
    Context mycontext;

    MyAdapter(ArrayList<Party> data, Context context) {
        this.data = data;
        this.mycontext = context;

    }


    //Создается ViewHolder для каждого предмета в списке (только 1 раз)
    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_party, parent, false);
        return new MyViewHolder(view);

    }

    //Соединяем данные с ViewHolder
    //Кладем данные во View
    @Override

    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.bind(data.get(position));
        Glide.with(mycontext).asBitmap().load(data.get(position).image).into(holder.partyIV);
        holder.layout.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Intent intent = new Intent(mycontext, ViewActivity.class);
                intent.putExtra("party_name", data.get(position).name);
                intent.putExtra("party_details", data.get(position).details);
                intent.putExtra("party_imageURL", data.get(position).image);
                mycontext.startActivity(intent);
            }
        });
    }

    //Сколько предметов в списке

    @Override
    public int getItemCount() {
        return data.size();

    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView partyNameTV;
        TextView partyAdresTV;
        TextView partyDateTV;
        TextView partyTimeTV;
        TextView partyDistTV;
        ConstraintLayout layout;
        ImageView partyIV;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            partyNameTV = itemView.findViewById(R.id.name);
            partyAdresTV = itemView.findViewById(R.id.adres);
            partyDateTV = itemView.findViewById(R.id.data);
            partyTimeTV = itemView.findViewById(R.id.time);
            partyDistTV = itemView.findViewById(R.id.dist);
            layout = itemView.findViewById(R.id.layout);
            partyIV = itemView.findViewById(R.id.imageV);
        }


        public void bind(Party party) {
            partyNameTV.setText(party.name);
            partyAdresTV.setText(party.adres);
            partyDateTV.setText(party.data);
            partyTimeTV.setText(party.time);
            partyDistTV.setText(party.dist);
        }
    }
}

