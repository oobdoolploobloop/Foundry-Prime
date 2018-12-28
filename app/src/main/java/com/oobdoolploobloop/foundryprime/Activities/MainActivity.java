package com.oobdoolploobloop.foundryprime.Activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.oobdoolploobloop.foundryprime.Items.GlobalResourcesFile;
import com.oobdoolploobloop.foundryprime.Items.Warframe;
import com.oobdoolploobloop.foundryprime.R;
import com.oobdoolploobloop.foundryprime.Webtools.Scraper;

public class MainActivity extends AppCompatActivity {

    private String[] newBuildTypesStrings = {"Warframe", "Gun", "Melee"};
    public static final String EXTRA_BUILDTYPE = "com.oobdoolploobloop.foundryprime.BUILDTYPE";
    public static final String EXTRA_CREATELOCATION = "com.oobdoolploobloop.foundryprime.CREATELOCATION";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Warframe warframe = new Warframe(GlobalResourcesFile.WARFRAME_NAMES.NEZHA);
        //Scraper scraper = new Scraper();

        //warframe.populateStatsFromScraper(scraper);
    }

    public void startNewBuild(View view){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Choose a type of build");
        builder.setItems(newBuildTypesStrings, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                buildTypeSelected(i);
            }
        });
        builder.show();

    }

    private void buildTypeSelected(int buildType){
        Intent intent = new Intent(this, BuilderActivity.class);
        intent.putExtra(EXTRA_BUILDTYPE, buildType);
        intent.putExtra(EXTRA_CREATELOCATION, "New");
        startActivity(intent);
    }


}
