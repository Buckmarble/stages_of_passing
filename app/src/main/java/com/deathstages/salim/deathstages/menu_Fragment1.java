package com.deathstages.salim.deathstages;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Salim on 3/11/2015.
 */
public class menu_Fragment1 extends android.app.Fragment {

    View rootview;
    private CharSequence mString;
    @Nullable
    //@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.menu_layout1, container, false);
        return rootview;
    }
}
