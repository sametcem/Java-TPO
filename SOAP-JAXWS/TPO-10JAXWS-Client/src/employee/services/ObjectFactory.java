
package employee.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the employee.services package. 
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
public class ObjectFactory {

    private final static QName _GetEmployeeByBirthDateResponse_QNAME = new QName("http://services.employee/", "getEmployeeByBirthDateResponse");
    private final static QName _GetEmployeeByFirstName_QNAME = new QName("http://services.employee/", "getEmployeeByFirstName");
    private final static QName _GetEmployeeByBirthDate_QNAME = new QName("http://services.employee/", "getEmployeeByBirthDate");
    private final static QName _LoadEmp_QNAME = new QName("http://services.employee/", "loadEmp");
    private final static QName _LoadEmpResponse_QNAME = new QName("http://services.employee/", "loadEmpResponse");
    private final static QName _GetEmployeeByLastNameResponse_QNAME = new QName("http://services.employee/", "getEmployeeByLastNameResponse");
    private final static QName _GetEmployeeByFirstNameResponse_QNAME = new QName("http://services.employee/", "getEmployeeByFirstNameResponse");
    private final static QName _GetEmployeeByLastName_QNAME = new QName("http://services.employee/", "getEmployeeByLastName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: employee.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoadEmp }
     * 
     */
    public LoadEmp createLoadEmp() {
        return new LoadEmp();
    }

    /**
     * Create an instance of {@link LoadEmpResponse }
     * 
     */
    public LoadEmpResponse createLoadEmpResponse() {
        return new LoadEmpResponse();
    }

    /**
     * Create an instance of {@link GetEmployeeByLastNameResponse }
     * 
     */
    public GetEmployeeByLastNameResponse createGetEmployeeByLastNameResponse() {
        return new GetEmployeeByLastNameResponse();
    }

    /**
     * Create an instance of {@link GetEmployeeByFirstNameResponse }
     * 
     */
    public GetEmployeeByFirstNameResponse createGetEmployeeByFirstNameResponse() {
        return new GetEmployeeByFirstNameResponse();
    }

    /**
     * Create an instance of {@link GetEmployeeByLastName }
     * 
     */
    public GetEmployeeByLastName createGetEmployeeByLastName() {
        return new GetEmployeeByLastName();
    }

    /**
     * Create an instance of {@link GetEmployeeByBirthDateResponse }
     * 
     */
    public GetEmployeeByBirthDateResponse createGetEmployeeByBirthDateResponse() {
        return new GetEmployeeByBirthDateResponse();
    }

    /**
     * Create an instance of {@link GetEmployeeByFirstName }
     * 
     */
    public GetEmployeeByFirstName createGetEmployeeByFirstName() {
        return new GetEmployeeByFirstName();
    }

    /**
     * Create an instance of {@link GetEmployeeByBirthDate }
     * 
     */
    public GetEmployeeByBirthDate createGetEmployeeByBirthDate() {
        return new GetEmployeeByBirthDate();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeByBirthDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.employee/", name = "getEmployeeByBirthDateResponse")
    public JAXBElement<GetEmployeeByBirthDateResponse> createGetEmployeeByBirthDateResponse(GetEmployeeByBirthDateResponse value) {
        return new JAXBElement<GetEmployeeByBirthDateResponse>(_GetEmployeeByBirthDateResponse_QNAME, GetEmployeeByBirthDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeByFirstName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.employee/", name = "getEmployeeByFirstName")
    public JAXBElement<GetEmployeeByFirstName> createGetEmployeeByFirstName(GetEmployeeByFirstName value) {
        return new JAXBElement<GetEmployeeByFirstName>(_GetEmployeeByFirstName_QNAME, GetEmployeeByFirstName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeByBirthDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.employee/", name = "getEmployeeByBirthDate")
    public JAXBElement<GetEmployeeByBirthDate> createGetEmployeeByBirthDate(GetEmployeeByBirthDate value) {
        return new JAXBElement<GetEmployeeByBirthDate>(_GetEmployeeByBirthDate_QNAME, GetEmployeeByBirthDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadEmp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.employee/", name = "loadEmp")
    public JAXBElement<LoadEmp> createLoadEmp(LoadEmp value) {
        return new JAXBElement<LoadEmp>(_LoadEmp_QNAME, LoadEmp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadEmpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.employee/", name = "loadEmpResponse")
    public JAXBElement<LoadEmpResponse> createLoadEmpResponse(LoadEmpResponse value) {
        return new JAXBElement<LoadEmpResponse>(_LoadEmpResponse_QNAME, LoadEmpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeByLastNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.employee/", name = "getEmployeeByLastNameResponse")
    public JAXBElement<GetEmployeeByLastNameResponse> createGetEmployeeByLastNameResponse(GetEmployeeByLastNameResponse value) {
        return new JAXBElement<GetEmployeeByLastNameResponse>(_GetEmployeeByLastNameResponse_QNAME, GetEmployeeByLastNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeByFirstNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.employee/", name = "getEmployeeByFirstNameResponse")
    public JAXBElement<GetEmployeeByFirstNameResponse> createGetEmployeeByFirstNameResponse(GetEmployeeByFirstNameResponse value) {
        return new JAXBElement<GetEmployeeByFirstNameResponse>(_GetEmployeeByFirstNameResponse_QNAME, GetEmployeeByFirstNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeByLastName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.employee/", name = "getEmployeeByLastName")
    public JAXBElement<GetEmployeeByLastName> createGetEmployeeByLastName(GetEmployeeByLastName value) {
        return new JAXBElement<GetEmployeeByLastName>(_GetEmployeeByLastName_QNAME, GetEmployeeByLastName.class, null, value);
    }

}
