package com.jgabrielfreitas.recyclerdemo;

import android.view.View;
import android.widget.TextView;

import uk.co.ribot.easyadapter.ItemViewHolder;
import uk.co.ribot.easyadapter.PositionInfo;
import uk.co.ribot.easyadapter.annotations.LayoutId;
import uk.co.ribot.easyadapter.annotations.ViewId;

/**
 * Created by JGabrielFreitas on 20/04/16.
 */
@LayoutId(R.layout.single_line_row)
public class SingleLineViewHolder extends ItemViewHolder<String> {

    @ViewId(R.id.singleLineTextView)
    TextView singleLineTextView;

    public SingleLineViewHolder(View view) {
        super(view);
    }

    public void onSetValues(String item, PositionInfo positionInfo) {

        singleLineTextView.setText(item);
    }

    public interface SingleLineTouch {

        void onTouch(String string);
    }
}
