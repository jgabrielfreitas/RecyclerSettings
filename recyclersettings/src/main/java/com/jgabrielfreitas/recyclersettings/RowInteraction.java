package com.jgabrielfreitas.recyclersettings;

import android.content.Context;
import android.support.annotation.LayoutRes;

import com.jgabrielfreitas.recyclersettings.model.ViewHolderModel;

/**
 * Created by JGabrielFreitas on 19/04/16.
 */
public class RowInteraction {

    private ViewHolderModel model;
    private int     layoutToInflate;
    private Context context;

    public RowInteraction(@LayoutRes int layoutToInflate) {
        this.layoutToInflate = layoutToInflate;
    }

    public RowInteraction(@LayoutRes int layoutToInflate, ViewHolderModel model, Context context) {
        this.layoutToInflate = layoutToInflate;
        this.context = context;
        this.model = model;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public ViewHolderModel getModel() {
        return model;
    }

    public void setModel(ViewHolderModel model) {
        this.model = model;
    }

    public int getLayoutToInflate() {
        return layoutToInflate;
    }

    public void setLayoutToInflate(int layoutToInflate) {
        this.layoutToInflate = layoutToInflate;
    }
}
