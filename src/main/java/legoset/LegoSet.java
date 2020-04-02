package legoset;

import java.time.Year;
import java.util.List;
import lombok.Data;
import movie.YearAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@Data
public class LegoSet {

    @XmlAttribute
    private int number;

    private String name, theme, subtheme;

    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;

    private int pieces;

    @XmlElementWrapper()
    @XmlElement(name = "tag")
    private List<String> tags;

    @XmlElementWrapper()
    @XmlElement(name = "minifig")
    private List<Minifig> minifigs;

    private Weight weight;
}
