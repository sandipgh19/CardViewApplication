package com.example.sandipghosh.cardviewapplication;

import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sandipghosh on 21/03/17.
 */

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.MyViewHolder> {

    List<Card> cards;

    public CardAdapter(String[] text1, String[] text2, Bitmap[] bitmaps) {

        cards = new ArrayList<Card>();
        for(int i=0;i<text1.length;i++) {

            Card card = new Card();

            card.setText1(text1[i]);
            card.setText2(text2[i]);
            card.setBitmap(bitmaps[i]);

            cards.add(card);
        }
    }


    @Override
    public CardAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CardAdapter.MyViewHolder holder, int position) {

        Card card = cards.get(position);
        holder.imageView1.setImageBitmap(card.getBitmap());
        holder.txt1.setText(card.getText1());
        holder.txt2.setText(card.getText2());

    }

    @Override
    public int getItemCount() {
        return cards.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txt1;
        TextView txt2;
        ImageView imageView1;

        public MyViewHolder(View itemView) {
            super(itemView);

            txt1 = (TextView) itemView.findViewById(R.id.text1);
            txt2 = (TextView) itemView.findViewById(R.id.text2);
            imageView1 = (ImageView) itemView.findViewById(R.id.image);
        }
    }
}
