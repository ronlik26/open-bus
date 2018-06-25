//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package eu.datex2.schema._1_0._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Averaged measurements of traffic speed.
 * 
 * <p>Java class for TrafficSpeed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficSpeed">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}TrafficValue">
 *       &lt;sequence>
 *         &lt;element name="averageVehicleSpeed" type="{http://datex2.eu/schema/1_0/1_0}KilometresPerHour" minOccurs="0"/>
 *         &lt;element name="speedPercentile" type="{http://datex2.eu/schema/1_0/1_0}SpeedPercentile" minOccurs="0"/>
 *         &lt;element name="trafficSpeedExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficSpeed", propOrder = {
    "averageVehicleSpeed",
    "speedPercentile",
    "trafficSpeedExtension"
})
public class TrafficSpeed
    extends TrafficValue
{

    protected Float averageVehicleSpeed;
    protected SpeedPercentile speedPercentile;
    protected ExtensionType trafficSpeedExtension;

    /**
     * Gets the value of the averageVehicleSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAverageVehicleSpeed() {
        return averageVehicleSpeed;
    }

    /**
     * Sets the value of the averageVehicleSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAverageVehicleSpeed(Float value) {
        this.averageVehicleSpeed = value;
    }

    /**
     * Gets the value of the speedPercentile property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedPercentile }
     *     
     */
    public SpeedPercentile getSpeedPercentile() {
        return speedPercentile;
    }

    /**
     * Sets the value of the speedPercentile property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedPercentile }
     *     
     */
    public void setSpeedPercentile(SpeedPercentile value) {
        this.speedPercentile = value;
    }

    /**
     * Gets the value of the trafficSpeedExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficSpeedExtension() {
        return trafficSpeedExtension;
    }

    /**
     * Sets the value of the trafficSpeedExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficSpeedExtension(ExtensionType value) {
        this.trafficSpeedExtension = value;
    }

}
