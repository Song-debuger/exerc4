
package webservice.list;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * <pre>
 * &lt;complexType name="clear">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clear", propOrder = {
    "arg0",
    "arg1"
})
public class Clear {

    protected String arg0;
    protected String arg1;

    /**
     * get the value
     * @return
     */
    public String getArg0() {
        return arg0;
    }

    /**
     * set the value
     * 
     * @param value
     */
    public void setArg0(String value) {
        this.arg0 = value;
    }

    /**
     * get the value
     * @return
     */
    public String getArg1() {
        return arg1;
    }

    /**
     * set the value
     * 
     * @param value
     */
    public void setArg1(String value) {
        this.arg1 = value;
    }

}
