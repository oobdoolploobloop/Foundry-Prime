package com.oobdoolploobloop.foundryprime.Webtools;

import android.os.AsyncTask;
import android.util.Log;

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
            Document doc = Jsoup.connect("http://warframe.wikia.com/wiki/Tiberon_Prime").get();
            Elements elements = doc.select("div.pi-item div.pi-data-value");
            int i = 0;
            //Log.d("Scraped", elements.text());
            for(Element element : elements){
                // Fill out each warframe stat element based on position
//                String s = "Value " + i + " is " + element.val();
//                Log.d("Scraped", element.);
                i++;
                Log.d("Scraped", "Number " + i + ": " + element.text());
            }

        }catch(IOException e){
            throw new RuntimeException(e);
        }

        return retval;

    }

    protected void onPostExecute(Long result){

    }
}
