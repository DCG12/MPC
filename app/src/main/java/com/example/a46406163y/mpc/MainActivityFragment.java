package com.example.a46406163y.mpc;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private MediaPlayer mp;
    SoundPool sp;
    public MainActivityFragment() {
    }
    Button button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);


        button = (Button) view.findViewById(R.id.button);
        Button button2 = (Button) view.findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* sp = new SoundPool(1, AudioManager.STREAM_MUSIC, 1);
                song = sp.load(getContext(), R.raw.kick, 1);
            sp.play(song, 1,1,1,0,1);*/
                mp = MediaPlayer.create(getContext(),R.raw.kick);
                mp.start();
            }
        }
        );

        button2.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
               /* sp = new SoundPool(1, AudioManager.STREAM_MUSIC, 1);
                song = sp.load(getContext(), R.raw.kick, 1);1
            sp.play(song, 1,1,1,0,1);*/
                                          mp = MediaPlayer.create(getContext(),R.raw.snare);
                                          mp.start();
                                      }
                                  }
        );

        return view;
    }

}
