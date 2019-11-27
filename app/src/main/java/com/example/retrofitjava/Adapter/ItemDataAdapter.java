package com.example.retrofitjava.Adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitjava.Model.ResultItem;
import com.example.retrofitjava.R;


public class ItemDataAdapter extends RecyclerView.Adapter<ItemDataAdapter.ViewHolder> {


    private Context context;
    private ArrayList<ResultItem> resultItems;

    public ItemDataAdapter(Context context, ArrayList<ResultItem> resultItems) {
        this.context = context;
        this.resultItems = resultItems;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return  new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_data, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvSubTitle.setText(resultItems.get(position).getFirst_name());
        holder.tvTitle.setText(resultItems.get(position).getEmail());
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return resultItems.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvTitle,tvSubTitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvSubTitle= itemView.findViewById(R.id.tvSubTitle);
            tvTitle= itemView.findViewById(R.id.tvTitle);
        }
    }
}
