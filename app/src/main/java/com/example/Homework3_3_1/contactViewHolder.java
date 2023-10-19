package com.example.Homework3_3_1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a3_3_1.R;


public class contactViewHolder extends RecyclerView.ViewHolder {
    private TextView tv_name;
    public contactViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_name= itemView.findViewById(R.id.tv_name);

    }
    public void onBind (String contactName){
        tv_name.setText(contactName);
    }

}
