
package webservice.list;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.list package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class FactoryOfObeject {

    private final static QName _DeleteResponse_QNAME = new QName("http://www.webservice.list", "deleteResponse");
    private final static QName _AddResponse_QNAME = new QName("http://www.webservice.list", "addResponse");
    private final static QName _QueryResponse_QNAME = new QName("http://www.webservice.list", "queryResponse");
    private final static QName _RegisterResponse_QNAME = new QName("http://www.webservice.list", "registerResponse");
    private final static QName _Query_QNAME = new QName("http://www.webservice.list", "query");
    private final static QName _Add_QNAME = new QName("http://www.webservice.list", "add");
    private final static QName _Delete_QNAME = new QName("http://www.webservice.list", "delete");
    private final static QName _Register_QNAME = new QName("http://www.webservice.list", "register");
    private final static QName _Clear_QNAME = new QName("http://www.webservice.list", "clear");
    private final static QName _ClearResponse_QNAME = new QName("http://www.webservice.list", "clearResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.list
     * 
     */
    public FactoryOfObeject() {
    }

    /**
     * Create an instance of  add
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of delete
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of AddResponse
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of response
     * 
     */
    public QueryResponse createQueryResponse() {
        return new QueryResponse();
    }

    /**
     * Create an instance of response
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of query
     * 
     */
    public Query createQuery() {
        return new Query();
    }

    /**
     * Create an instance of clear
     * 
     */
    public Clear createClear() {
        return new Clear();
    }

    /**
     * Create an instance of clear response
     * 
     */
    public ClearResponse createClearResponse() {
        return new ClearResponse();
    }

    /**
     * Create an instance of delete
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of register
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of JAXBElement deleteResponse
     * 
     */
    @XmlElementDecl(namespace = "http://www.webservice.list", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance ofJAXBElement addResponse
     * 
     */
    @XmlElementDecl(namespace = "http://www.webservice.list", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of queryResponse
     * 
     */
    @XmlElementDecl(namespace = "http://www.webservice.list", name = "queryResponse")
    public JAXBElement<QueryResponse> createQueryResponse(QueryResponse value) {
        return new JAXBElement<QueryResponse>(_QueryResponse_QNAME, QueryResponse.class, null, value);
    }

    /**
     * Create an instance of registerResponse
     * 
     */
    @XmlElementDecl(namespace = "http://www.webservice.list", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of query
     * 
     */
    @XmlElementDecl(namespace = "http://www.webservice.list", name = "query")
    public JAXBElement<Query> createQuery(Query value) {
        return new JAXBElement<Query>(_Query_QNAME, Query.class, null, value);
    }

    /**
     * Create an instance of add
     * 
     */
    @XmlElementDecl(namespace = "http://www.webservice.list", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of delete
     * 
     */
    @XmlElementDecl(namespace = "http://www.webservice.list", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of register
     * 
     */
    @XmlElementDecl(namespace = "http://www.webservice.list", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of clear
     * 
     */
    @XmlElementDecl(namespace = "http://www.webservice.list", name = "clear")
    public JAXBElement<Clear> createClear(Clear value) {
        return new JAXBElement<Clear>(_Clear_QNAME, Clear.class, null, value);
    }

    /**
     * Create an instance of clear
     * 
     */
    @XmlElementDecl(namespace = "http://www.webservice.list", name = "clearResponse")
    public JAXBElement<ClearResponse> createClearResponse(ClearResponse value) {
        return new JAXBElement<ClearResponse>(_ClearResponse_QNAME, ClearResponse.class, null, value);
    }

}
