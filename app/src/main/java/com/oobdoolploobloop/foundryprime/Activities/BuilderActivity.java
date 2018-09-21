package com.oobdoolploobloop.foundryprime.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.oobdoolploobloop.foundryprime.R;
import com.oobdoolploobloop.foundryprime.UiTools.Adapter_BuilderModList;

public class BuilderActivity extends AppCompatActivity {

    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);
        listview = (ListView) findViewById(R.id.listview_modlist);
        listview.setAdapter(new Adapter_BuilderModList(this, new String[]{
                "data1", "data2"
        }));
    }
}
