//
// Generated By:JAX-WS RI IBM 2.1.6 in JDK 6 (JAXB RI IBM JAXB 2.1.10 in JDK 6)
//


package net.alldata.axes.web_services.sales;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "sales3x", targetNamespace = "http://axes.alldata.net/web-services/sales", wsdlLocation = "META-INF/wsdl/sales3x.wsdl")
public class Sales3X
    extends Service
{

    private final static URL SALES3X_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(net.alldata.axes.web_services.sales.Sales3X.class.getName());

    static {
        URL url = null;
        try {
            url = net.alldata.axes.web_services.sales.Sales3X.class.getResource("/META-INF/wsdl/sales3x.wsdl");
            if (url == null) throw new MalformedURLException("/META-INF/wsdl/sales3x.wsdl does not exist in the module.");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'META-INF/wsdl/sales3x.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        SALES3X_WSDL_LOCATION = url;
    }

    public Sales3X(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Sales3X() {
        super(SALES3X_WSDL_LOCATION, new QName("http://axes.alldata.net/web-services/sales", "sales3x"));
    }

    /**
     * 
     * @return
     *     returns Sale3X
     */
    @WebEndpoint(name = "Sale3xPort")
    public Sale3X getSale3XPort() {
        return super.getPort(new QName("http://axes.alldata.net/web-services/sales", "Sale3xPort"), Sale3X.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Sale3X
     */
    @WebEndpoint(name = "Sale3xPort")
    public Sale3X getSale3XPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://axes.alldata.net/web-services/sales", "Sale3xPort"), Sale3X.class, features);
    }

}
