package com.example.a076766.clrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rmatze@itriagehealth.com on 9/21/16.
 */

public class MyAdapter extends
        RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<String> mDataset;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textview;

        public ViewHolder(View view) {
            super(view);
            textview = (TextView) view.findViewById(R.id.textview);
        }
    }

    public MyAdapter(List<String> list) {
        this.mDataset = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_row_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textview.setText(mDataset.get(position));
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}