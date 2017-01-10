package com.example.a46406163y.mpc;

import android.net.Uri;
import android.support.annotation.Nullable;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

public class APIWOW {

    private static final String BASE_URL = "https://us.api.battle.net/wow/boss/?locale=en_US&apikey=kqqxgdajmjuahyapepfsbvg4aj88qeyw";

    static ArrayList<WOW> getInfoBoss() {
        Uri builtUri = Uri.parse(BASE_URL)
                .buildUpon()
                .build();
        String url = builtUri.toString();

        return doCall(url);

    }

    static ArrayList<WOW> getInfoHeroics() {
        Uri builtUri = Uri.parse(BASE_URL)
                .buildUpon()
                .build();
        String url = builtUri.toString();

        return doCall(url);

    }
        @Nullable
        private static ArrayList<WOW> doCall(String url){
            try {
                String JsonResponse = HttpUtils.get(url);
                ArrayList<WOW> bosses = new ArrayList<>();

                JSONObject data = new JSONObject(JsonResponse);
                JSONArray jsonBoss = data.getJSONArray("bosses");

                for (int i = 0; i < jsonBoss.length(); i++) {
                    WOW boss = new WOW();
                    JSONObject object = jsonBoss.getJSONObject(i);
                    boss.setName(object.getString("name"));
                    boss.setHealth(object.getInt("health"));
                    bosses.add(boss);
                }

                return bosses;
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

