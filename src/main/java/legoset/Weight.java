package legoset;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
public class Weight {

    @XmlAttribute
    private String unit;

    @XmlValue
    private double value;

    public Weight() {};

    public Weight(String cunit, double cvalue) {
        this.unit = cunit;
        this.value = cvalue;
    }
}
