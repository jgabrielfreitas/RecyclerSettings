package com.jgabrielfreitas.recyclersettings.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by JGabrielFreitas on 18/04/16.
 */
public class QuickRecyclerView extends RecyclerView {


    public QuickRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        defaultConfig();
    }

    private void defaultConfig() {

        setLayoutManager(new LinearLayoutManager(getContext()));
    }

}
