package com.jgabrielfreitas.recyclersettings.interfaces;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import com.jgabrielfreitas.recyclersettings.R;
import com.jgabrielfreitas.recyclersettings.model.ViewHolderModel;
import com.jgabrielfreitas.recyclersettings.views.SingleLineRow;

import java.util.List;

/**
 * Created by JGabrielFreitas on 19/04/16.
 */
public abstract class OnRecyclerViewItemClickListener {

    private List<ViewHolderModel> viewHolderModels;
    private Context context;

    public OnRecyclerViewItemClickListener(List<ViewHolderModel> viewHolderModels, Context context) {
        this.viewHolderModels = viewHolderModels;
        this.context = context;
    }

    public void addViewHolder(ViewHolderModel holderModel) {
        viewHolderModels.add(holderModel);
    }

    public void setViewHolderModels(List<ViewHolderModel> viewHolderModels) {
        this.viewHolderModels = viewHolderModels;
    }

    public List<ViewHolderModel> getViewHolderModels() {
        return viewHolderModels;
    }

    public abstract void onRecyclerViewItemClick(RecyclerView.ViewHolder viewHolder);

    public ViewHolderModel getViewHolder(int type) {

//        switch (type) {
//            case 2:
//                View optionView = LayoutInflater.from(context).inflate(R.layout.option_settings_row, parent, false);
//                return new SingleLineRow(optionView);
//            default:
                return null;
//        }
    }
}
