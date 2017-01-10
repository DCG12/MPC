package com.example.a46406163y.mpc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 46406163y on 10/01/17.
 */
public class CardsCursorAdapter extends CupboardCursorAdapter<WOW> {

    public CardsCursorAdapter(Context context, Class<WOW> entityClass) {
        super(context, entityClass);
    }

    @Override
    public View newView(Context context, WOW model, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        LvCardsRowBinding binding = DataBindingUtil.inflate(
                inflater, R.layout.lv_wow_row, parent, false);

        return binding.getRoot();
    }

    @Override
    public void bindView(View view, Context context, WOW model) {
        LvCardsRowBinding binding = DataBindingUtil.getBinding(view);
        binding.lvCardName.setText(model.getName());
        binding.lvCardType.setText("Tipo:  " + model.getType());
    }

}
