package com.deathstages.salim.deathstages;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by forrest on 3/11/15.
 */
    public class ListViewActivity extends ListActivity {
        String[] list1;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            ListView lstView = getListView();
            lstView.setChoiceMode(2); // CHOICE_MODE_MULTIPLE
            lstView.setTextFilterEnabled(true);

            list1 = getResources().getStringArray(R.array.stage1_array);

            setListAdapter(new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_checked, list1));
        }
    };
