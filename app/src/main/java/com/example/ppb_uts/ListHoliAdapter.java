package com.example.ppb_uts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListHoliAdapter extends RecyclerView.Adapter<ListHoliAdapter.ListViewHolder>{
    private ArrayList<Holi> listHoli;
    public ListHoliAdapter(ArrayList<Holi> list) {

        this.listHoli = list;


    }
    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;}

    @NonNull
    @Override
    public ListHoliAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_holi, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListHoliAdapter.ListViewHolder holder, int position) {

        Holi holi = listHoli.get(position);

        holder.tvName.setText(holi.getName());
        holder.tvDetail.setText(holi.getMateri());
        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listHoli.get(holder.getAdapterPosition()));
            }

            });
        }

    @Override
    public int getItemCount() {
        return listHoli.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvDetail;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);

        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(Holi data);
    }
}
