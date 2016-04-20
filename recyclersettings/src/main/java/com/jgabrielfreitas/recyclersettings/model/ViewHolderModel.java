package com.jgabrielfreitas.recyclersettings.model;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.jgabrielfreitas.recyclersettings.interfaces.BindViewHolder;

import java.util.List;

import butterknife.ButterKnife;

/**
 * Created by JGabrielFreitas on 18/04/16.
 */
public class ViewHolderModel extends RecyclerView.ViewHolder implements BindViewHolder {

    private   View rootView;
    protected int  type = 1;

    public ViewHolderModel(View itemView) {
        super(itemView);
        this.rootView = itemView;
        ButterKnife.bind(this, itemView);
    }

    public View getRootView() {
        return rootView;
    }

    public void bindViewHolder(ViewHolderModel holder, int position) {
    }
}
