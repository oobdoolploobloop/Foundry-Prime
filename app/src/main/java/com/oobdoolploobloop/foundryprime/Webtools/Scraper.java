package com.oobdoolploobloop.foundryprime.Webtools;

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
        Boolean primeWarframe = warframe.getName().contains("Prime");

        // Remove Prime tag, all data grabbed even for vanilla
        String html = "http://warframe.wikia.com/wiki/" + warframe.getName().replace(" Prime", "");

        try{
            Document doc = Jsoup.connect(html).get();
            Elements elements = doc.select("div.pi-item div.pi-data-value");
            for(Element element : elements){
                // Fill out each warframe stat element based on position
            }

        }catch(IOException e){
            throw new RuntimeException(e);
        }
        return 0;
    }



}
