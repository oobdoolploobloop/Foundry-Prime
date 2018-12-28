package com.oobdoolploobloop.foundryprime.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.oobdoolploobloop.foundryprime.Items.GlobalResourcesFile;
import com.oobdoolploobloop.foundryprime.Items.Warframe;
import com.oobdoolploobloop.foundryprime.R;
import com.oobdoolploobloop.foundryprime.UiTools.Adapter_BuilderModList;
import com.oobdoolploobloop.foundryprime.Webtools.Scraper;

public class BuilderActivity extends AppCompatActivity {

    ListView listview;
    private static int buildType;
    private static String createLocation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);

        /* Get the type of build sent by main menu
        * Also get whether the build was loaded from memory
        * or is a fresh build
        */
        Intent intent = getIntent();
        createLocation = intent.getStringExtra(MainActivity.EXTRA_CREATELOCATION);
        buildType = intent.getIntExtra(MainActivity.EXTRA_BUILDTYPE, -1);

        if(createLocation.equals("New")){
            // A new build was started
        }else if(createLocation.equals("Load")){
            // A build is being loaded from memory
        }else{
            // TODO Error processing, somehow invalid number
        }

        listview = (ListView) findViewById(R.id.listview_modlist);
        listview.setAdapter(new Adapter_BuilderModList(this, new String[]{
                "data1", "data2"
        }));

        Warframe warframe = new Warframe(GlobalResourcesFile.WARFRAME_NAMES.ATLAS);
        warframe.populateStatsFromScraper();
    }
}
