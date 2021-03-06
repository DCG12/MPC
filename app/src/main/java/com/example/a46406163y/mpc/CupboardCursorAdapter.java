package com.example.a46406163y.mpc;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;

/**
 * Created by 46406163y on 10/01/17.
 */
public class CupboardCursorAdapter<T> extends CursorAdapter{
    private final Cupboard mCupboard;
    private Class<T> mEntityClass;

    public CupboardCursorAdapter(Context context, Class<T> entityClass) {
        this(context, cupboard(), entityClass, null);
    }

    public CupboardCursorAdapter(Context context, Cupboard cupboard, Class<T> entityClass) {
        this(context, cupboard, entityClass, null);
    }

    public CupboardCursorAdapter(Context context, Cupboard cupboard, Class<T> entityClass, Cursor cursor) {
        super(context, cursor, false);
        this.mEntityClass = entityClass;
        this.mCupboard = cupboard;
    }

    public abstract View newView(Context context, T model, ViewGroup parent);

    public abstract void bindView(View view, Context context, T model);

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return newView(context, getItem(cursor.getPosition()), parent);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        bindView(view, context, getItem(cursor.getPosition()));
    }

    public T getItem(int position) {
        if (getCursor().moveToPosition(position)) {
            return mCupboard.withCursor(getCursor()).get(mEntityClass);
        } else {
            throw new IllegalArgumentException("Invalid position: " + position);
        }
    }
}
