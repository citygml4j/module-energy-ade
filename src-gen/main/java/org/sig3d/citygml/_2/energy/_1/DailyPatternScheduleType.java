//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Wed Feb 13 16:55:57 CET 2019
//


package org.sig3d.citygml._2.energy._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Schedule representation consisting of a set of daily schedules associated to recurrent day types (weekday, weekend etc.). In different time periods within a year, different daily schedules may be associated to a day type.
 * 
 * <p>Java-Klasse für DailyPatternScheduleType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DailyPatternScheduleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/1.0}AbstractScheduleType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="periodOfYear" type="{http://www.sig3d.org/citygml/2.0/energy/1.0}PeriodOfYearPropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailyPatternScheduleType", propOrder = {
    "periodOfYear"
})
public class DailyPatternScheduleType
    extends AbstractScheduleType
{

    @XmlElement(required = true)
    protected List<PeriodOfYearPropertyType> periodOfYear;

    /**
     * Gets the value of the periodOfYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodOfYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodOfYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodOfYearPropertyType }
     * 
     * 
     */
    public List<PeriodOfYearPropertyType> getPeriodOfYear() {
        if (periodOfYear == null) {
            periodOfYear = new ArrayList<PeriodOfYearPropertyType>();
        }
        return this.periodOfYear;
    }

    public boolean isSetPeriodOfYear() {
        return ((this.periodOfYear!= null)&&(!this.periodOfYear.isEmpty()));
    }

    public void unsetPeriodOfYear() {
        this.periodOfYear = null;
    }

}
