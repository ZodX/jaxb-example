package legoset;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
public class Minifig {

    @XmlAttribute
    private int count;

    @XmlValue
    private String name;

    public Minifig() {};

    public Minifig(int ccount, String cname) {
        this.count = ccount;
        this.name = cname;
    }
}
