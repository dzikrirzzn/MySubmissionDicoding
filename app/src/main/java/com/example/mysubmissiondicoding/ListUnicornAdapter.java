package com.example.mysubmissiondicoding;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListUnicornAdapter extends RecyclerView.Adapter<ListUnicornAdapter.ListViewHolder> {
    private ArrayList<Unicorn> listUnicorn;

    public ListUnicornAdapter(ArrayList<Unicorn> list) { this.listUnicorn = list; }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_unicorn, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, final int position) {
        Unicorn unicorn = listUnicorn.get(position);

        Glide.with(holder.itemView.getContext())
                .load(unicorn.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);

        holder.tvName.setText(unicorn.getName());
        holder.tvDetail.setText(unicorn.getDetail());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmove = new Intent(view.getContext(),DetailActivity.class);
                intentmove.putExtra("objek",listUnicorn.get(position));
                view.getContext().startActivity(intentmove);
            }
        });

    }

    @Override
    public int getItemCount() {return listUnicorn.size(); }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }

        }


