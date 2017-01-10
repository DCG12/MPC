package com.example.a46406163y.mpc;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.a46406163y.mpc.databinding.FragmentDetailBinding;
public class DetailActivityFragment extends Fragment {

    private View view;
    private FragmentDetailBinding binding;


    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_detail, container, false);
        View view = binding.getRoot();

        Intent i = getActivity().getIntent();

        if (i != null) {
            WOW wow = (WOW) i.getSerializableExtra("wow");

            if (wow != null) {
                updateUi(wow);
            }
        }

        return view;
    }
    private void updateUi(WOW wow) {
        Log.d("WOW", wow.toString());


        binding.lvBossName.setText(wow.getName());
        binding.lvBossLevel.setText(wow.getLevel());

    }
}
