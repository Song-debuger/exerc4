
package webservice.list;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**ࡣ
 * 
 * <pre>
 * &lt;complexType name="add">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "add", propOrder = {
    "arg0",
    "arg1",
    "arg2",
    "arg3",
    "arg4"
})
public class Add {
	//add command parameters list
    protected String arg0;
    protected String arg1;
    protected String arg2;
    protected String arg3;
    protected String arg4;

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


    /**
     * get the value
     * @return
     */
    public String getArg2() {
        return arg2;
    }


    /**
     * set the value
     * 
     * @param value
     */
    public void setArg2(String value) {
        this.arg2 = value;
    }

    /**
     * get the value
     * @return
     */
    public String getArg3() {
        return arg3;
    }

    /**
     * set the value
     * 
     * @param value
     */
    public void setArg3(String value) {
        this.arg3 = value;
    }

    /**
     * get the value
     * @return
     */
    public String getArg4() {
        return arg4;
    }
    
    /**
     * set the value
     * 
     * @param value
     */
    public void setArg4(String value) {
        this.arg4 = value;
    }

}
