package com.example.android.silkboardapplication;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.silkboardapplication.R;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.viewHolder> {
    List <com.example.android.silkboardapplication.cardObject> farms;
    public adapter(){}

    public adapter(List<com.example.android.silkboardapplication.cardObject> farms) {
        this.farms = farms;
    }

    public class viewHolder extends RecyclerView.ViewHolder{
         TextView farm_name,farm_address,vStatus,farm_distance;ImageView farm_image;
         public viewHolder(View itemView) {
             super(itemView);
             farm_name=itemView.findViewById(R.id.farm_name);
             farm_address=itemView.findViewById(R.id.farm_address);
             vStatus=itemView.findViewById(R.id.vStatus);
             farm_distance=itemView.findViewById(R.id.farm_distance);
             farm_image=itemView.findViewById(R.id.farm_image);
         }
     }

    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card, parent, false);

        return new viewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(viewHolder holder, int position) {
        com.example.android.silkboardapplication.cardObject card=farms.get(position);
        holder.farm_image.setImageResource(card.image);
        holder.farm_distance.setText(Float.toString(card.distance)+" KM(s)");
        if(card.status)
        {
            holder.vStatus.setTextColor(Color.rgb(0, 114, 15));
            holder.vStatus.setText("Verification Complete");
        }
        else
        {
            holder.vStatus.setText("Verification pending");
        }
        holder.farm_name.setText(card.farmName);
        holder.farm_address.setText(card.address);

    }



    @Override
    public int getItemCount() {
        return farms.size();
    }
}
