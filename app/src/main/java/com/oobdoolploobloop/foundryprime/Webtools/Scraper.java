package com.oobdoolploobloop.foundryprime.Webtools;

import android.os.AsyncTask;

import com.oobdoolploobloop.foundryprime.Items.Warframe;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Scraper {

    public Scraper(){

    }

    public int populateWarframeStats(Warframe warframe){

//        protected void doInBackground

        Boolean primeWarframe = warframe.getNameString().contains("Prime");

        // Remove Prime tag, all data grabbed even for vanilla
        String html = "http://warframe.wikia.com/wiki/" + warframe.getNameString().replace(" Prime", "");



//        try{
//            Document doc = Jsoup.connect("http://warframe.wikia.com/wiki/Nyx").get();
//            Elements elements = doc.select("div.pi-item div.pi-data-value");
//            for(Element element : elements){
//                // Fill out each warframe stat element based on position
//            }
//
//        }catch(IOException e){
//            throw new RuntimeException(e);
//        }
        return 0;
    }



}
