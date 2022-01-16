package com.example.fundforchange.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fundforchange.R;

public class myevent_adapter extends RecyclerView.Adapter<myevent_adapter.MyViewHolder> {

    Context context;
    String[] title, desc;
    int[] images;

    public myevent_adapter(Context context, String[] title, String[] desc, int[] images) {
        this.context = context;
        this.title = title;
        this.desc = desc;
        this.images = images;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.myevent_design, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.titleview.setText(title[position]);
        holder.descview.setText(desc[position]);
        holder.imageView.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
       // System.out.println("title length is"+title.length);
        return title.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titleview, descview;
        ImageView imageView;
       public MyViewHolder(@NonNull View itemView) {
           super(itemView);
           titleview = itemView.findViewById(R.id.eventtxt);
           descview = itemView.findViewById(R.id.eventdesc);
           imageView = itemView.findViewById(R.id.eventimg);
       }
   }
}
