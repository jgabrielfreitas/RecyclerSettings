package com.jgabrielfreitas.recyclersettings.views;

import android.view.View;
import android.widget.TextView;

import com.jgabrielfreitas.recyclersettings.R;
import com.jgabrielfreitas.recyclersettings.model.ViewHolderModel;

import java.util.List;

import butterknife.Bind;

/**
 * Created by JGabrielFreitas on 19/04/16.
 */
public class SingleLineRow extends ViewHolderModel {

    TextView singleLineTextView;
    String   content;

    public SingleLineRow(View itemView) {
        super(itemView);
        type = 2;
    }

    public TextView getSingleLineTextView() {
        return singleLineTextView;
    }

    public void setSingleLineTextView(TextView singleLineTextView) {
        this.singleLineTextView = singleLineTextView;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void bindViewHolder(List interactionList, ViewHolderModel holder, int position) {

        singleLineTextView = (TextView) getRootView().findViewById(R.id.singleLineTextView);
        singleLineTextView.setText("IT'S ALIVE!!!");
    }
}
