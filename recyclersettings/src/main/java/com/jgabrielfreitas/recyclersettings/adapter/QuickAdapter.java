package com.jgabrielfreitas.recyclersettings.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jgabrielfreitas.recyclersettings.RowInteraction;
import com.jgabrielfreitas.recyclersettings.interfaces.OnRecyclerViewItemClickListener;
import com.jgabrielfreitas.recyclersettings.model.ViewHolderModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JGabrielFreitas on 18/04/16.
 */
public class QuickAdapter extends RecyclerView.Adapter<ViewHolderModel> {

    public OnRecyclerViewItemClickListener onRecyclerViewItemClickListener;

    public QuickAdapter(OnRecyclerViewItemClickListener onRecyclerViewItemClickListener) {
        this.onRecyclerViewItemClickListener = onRecyclerViewItemClickListener;
    }

    public ViewHolderModel onCreateViewHolder(ViewGroup parent, int viewType) {
        return onRecyclerViewItemClickListener.getViewHolder(viewType);
    }

    public void onBindViewHolder(ViewHolderModel holder, int position) {
        holder.bindViewHolder(holder, position);
    }

    public int getItemCount() {
        return onRecyclerViewItemClickListener.getViewHolderModels().size();
    }
}
