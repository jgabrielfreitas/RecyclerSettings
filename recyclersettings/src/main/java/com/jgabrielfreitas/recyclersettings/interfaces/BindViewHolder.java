package com.jgabrielfreitas.recyclersettings.interfaces;

import com.jgabrielfreitas.recyclersettings.model.ViewHolderModel;

import java.util.List;

/**
 * Created by JGabrielFreitas on 19/04/16.
 */
public interface BindViewHolder<T> {

    void bindViewHolder(ViewHolderModel holder, int position);
}
