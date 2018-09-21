package com.oobdoolploobloop.foundryprime.Webtools;

import android.os.AsyncTask;

import com.oobdoolploobloop.foundryprime.Items.Warframe;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class WarframeScraper extends AsyncTask<Warframe, Integer, Long> {

    protected Long doInBackground(Warframe... warframe){
        long retval = 1;
        try{
            Document doc = Jsoup.connect("http://warframe.wikia.com/wiki/Nyx").get();
            Elements elements = doc.select("div.pi-item div.pi-data-value");
            for(Element element : elements){
                // Fill out each warframe stat element based on position
            }

        }catch(IOException e){
            throw new RuntimeException(e);
        }

        return retval;

    }

    protected void onPostExecute(Long result){

    }
}
