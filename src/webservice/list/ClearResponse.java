
package webservice.list;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;complexType name="clearResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clearResponse", propOrder = {
    "_return"
})
public class ClearResponse {

    @XmlElement(name = "return")
    protected String _return;

    /**
     * get the value
     * @return
     */
    public String getReturn() {
        return _return;
    }

    /**
     * set the value
     * 
     * @param value
     */
    public void setReturn(String value) {
        this._return = value;
    }

}
