package com.example.a46406163y.mpc;

import android.databinding.DataBindingUtil;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.a46406163y.mpc.databinding.*;
import java.util.List;


public class WOWAdapter  extends ArrayAdapter<WOW>{


    public WOWAdapter(Context context, int resource, List<WOW> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Obtenim l'objecte en la possició corresponent
        WOW wow = getItem(position);
        Log.w("XXXX", wow.toString());

        LvWOWRowBinding binding = null;

        // Mirem a veure si la View s'està reusant, si no es així "inflem" la View
        // https://github.com/codepath/android_guides/wiki/Using-an-ArrayAdapter-with-ListView#row-view-recycling
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            binding = DataBindingUtil.inflate(inflater, R.layout.lv_wow_row, parent, false);
                                } else {
            binding = DataBindingUtil.getBinding(convertView);
        }

        // Unim el codi en les Views del Layout


        // Fiquem les dades dels objectes (provinents del JSON) en el layout
        binding.lvBossName.setText(wow.getName());
        binding.lvBossLevel.setText("Level: " + wow.getLevel());

        // Retornem la View replena per a mostrarla
        return binding.getRoot();
    }
}
