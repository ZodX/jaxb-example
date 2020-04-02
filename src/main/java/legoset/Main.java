package legoset;

import jaxb.JAXBHelper;

import java.net.URL;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LegoSet lego = new LegoSet();

        lego.setNumber(75211);
        lego.setName("Imperial TIE Figther");
        lego.setTheme("Star Wars");
        lego.setSubtheme("Solo");
        lego.setYear(Year.of(2018));
        lego.setPieces(519);
        lego.setTags(List.of("Starfighter", "Stormtrooper", "Star Wars", "Solo"));

        ArrayList<Minifig> minifigs = new ArrayList<>();
        minifigs.add(new Minifig(2, "Imperial Mudtrooper"));
        minifigs.add(new Minifig(1, "Imperial Pilot"));
        minifigs.add(new Minifig(1, "Mimban Stormtrooper"));
        lego.setMinifigs(minifigs);

        lego.setWeight(new Weight("kg", 0.89));

        try {
            lego.setUrl(new URL("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter"));
        } catch (java.net.MalformedURLException e){
        }

        try {
            JAXBHelper.toXML(lego, System.out);
        } catch (javax.xml.bind.JAXBException e) {
        } catch (Exception e) {
        }
    }
}
