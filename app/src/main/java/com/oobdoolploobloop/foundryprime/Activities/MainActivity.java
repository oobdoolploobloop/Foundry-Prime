package com.oobdoolploobloop.foundryprime.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.oobdoolploobloop.foundryprime.Items.GlobalResourcesFile;
import com.oobdoolploobloop.foundryprime.Items.Warframe;
import com.oobdoolploobloop.foundryprime.R;
import com.oobdoolploobloop.foundryprime.Webtools.Scraper;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Warframe warframe = new Warframe(GlobalResourcesFile.WARFRAME_NAMES.NEZHA);
        Scraper scraper = new Scraper();

        warframe.populateStatsFromScraper(scraper);

    }



}