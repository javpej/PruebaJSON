package com.example.javi.pruebajson;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Javi on 16/3/17.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context context;
    ArrayList<Item> array;

    public RecyclerViewAdapter(Context context, ArrayList<Item> array) {
        this.context = context;
        this.array =array;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);

        View v = inflater.inflate(R.layout.cardview, null);

        MyViewHolder holder = new MyViewHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

    Item itemselected = array.get(position);

        holder.tvCiudad.setText(itemselected.getsCiudad());
        holder.tvTemperatura.setText(itemselected.getsTemperatura());
        holder.tvTiempo.setText(itemselected.getsTiempo());

    }

    @Override
    public int getItemCount() {
        return array.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tvCiudad;
        TextView tvTemperatura;
        TextView tvTiempo;

        public MyViewHolder(View itemView) {
            super(itemView);

            tvCiudad = (TextView) itemView.findViewById(R.id.TVCiudad);
            tvTemperatura = (TextView) itemView.findViewById(R.id.TVTemperatura);
            tvTiempo = (TextView) itemView.findViewById(R.id.TVTiempo);

        }
    }
}
