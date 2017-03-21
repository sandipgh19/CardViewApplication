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

    public CardAdapter(Bitmap[] imageView, String[] textView1, String[] textView2) {
        super();
        cards = new ArrayList<Card>();

        for(int i=0;i<textView1.length;i++) {
            Card card = new Card();
            card.setImage(imageView[i]);
            card.setTxt1(textView1[i]);
            card.setTxt2(textView2[i]);

            cards.add(card);
        }

    }
    @Override
    public CardAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
         View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card,parent,false);
        return new MyViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(CardAdapter.MyViewHolder holder, int position) {

        Card item = cards.get(position);
        holder.bitmap.setImageBitmap(item.getImage());
        holder.txt1.setText(item.getTxt1());
        holder.txt2.setText(item.getTxt2());

    }

    @Override
    public int getItemCount() {
        return cards.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txt1;
        TextView txt2;
        ImageView bitmap;


        public MyViewHolder(View itemView) {
            super(itemView);

            txt1 = (TextView) itemView.findViewById(R.id.text1);
            txt2 = (TextView) itemView.findViewById(R.id.text2);
            bitmap = (ImageView) itemView.findViewById(R.id.image);
        }
    }
}
