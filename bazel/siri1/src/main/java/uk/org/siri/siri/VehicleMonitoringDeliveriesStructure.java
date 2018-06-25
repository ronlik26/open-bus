//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package uk.org.siri.siri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Deliveries for vehicle monitoring services Used in WSDL.
 * 
 * <p>Java class for VehicleMonitoringDeliveriesStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleMonitoringDeliveriesStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}VehicleMonitoringDelivery" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleMonitoringDeliveriesStructure", propOrder = {
    "vehicleMonitoringDelivery"
})
public class VehicleMonitoringDeliveriesStructure {

    @XmlElement(name = "VehicleMonitoringDelivery", required = true)
    protected List<VehicleMonitoringDeliveryStructure> vehicleMonitoringDelivery;

    /**
     * Delviery for Vehicle Activity Service Gets the value of the vehicleMonitoringDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleMonitoringDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleMonitoringDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleMonitoringDeliveryStructure }
     * 
     * 
     */
    public List<VehicleMonitoringDeliveryStructure> getVehicleMonitoringDelivery() {
        if (vehicleMonitoringDelivery == null) {
            vehicleMonitoringDelivery = new ArrayList<VehicleMonitoringDeliveryStructure>();
        }
        return this.vehicleMonitoringDelivery;
    }

}
