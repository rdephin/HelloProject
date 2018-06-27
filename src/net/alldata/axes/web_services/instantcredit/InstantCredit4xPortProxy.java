package net.alldata.axes.web_services.instantcredit;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;

public class InstantCredit4xPortProxy{

    protected Descriptor _descriptor;

    public class Descriptor {
        private net.alldata.axes.web_services.instantcredit.InstantCredit4X_Service _service = null;
        private net.alldata.axes.web_services.instantcredit.InstantCredit4X _proxy = null;
        private Dispatch<Source> _dispatch = null;

        public Descriptor() {
            init();
        }

        public Descriptor(URL wsdlLocation, QName serviceName) {
            _service = new net.alldata.axes.web_services.instantcredit.InstantCredit4X_Service(wsdlLocation, serviceName);
            initCommon();
        }

        public void init() {
            _service = null;
            _proxy = null;
            _dispatch = null;
            _service = new net.alldata.axes.web_services.instantcredit.InstantCredit4X_Service();
            initCommon();
        }

        private void initCommon() {
            _proxy = _service.getInstantCredit4XPort();
        }

        public net.alldata.axes.web_services.instantcredit.InstantCredit4X getProxy() {
            return _proxy;
        }

        public Dispatch<Source> getDispatch() {
            if (_dispatch == null ) {
                QName portQName = new QName("http://axes.alldata.net/web-services/instantCredit", "InstantCredit4xPort");
                _dispatch = _service.createDispatch(portQName, Source.class, Service.Mode.MESSAGE);

                String proxyEndpointUrl = getEndpoint();
                BindingProvider bp = (BindingProvider) _dispatch;
                String dispatchEndpointUrl = (String) bp.getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY);
                if (!dispatchEndpointUrl.equals(proxyEndpointUrl))
                    bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, proxyEndpointUrl);
            }
            return _dispatch;
        }

        public String getEndpoint() {
            BindingProvider bp = (BindingProvider) _proxy;
            return (String) bp.getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY);
        }

        public void setEndpoint(String endpointUrl) {
            BindingProvider bp = (BindingProvider) _proxy;
            bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointUrl);

            if (_dispatch != null ) {
                bp = (BindingProvider) _dispatch;
                bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointUrl);
            }
        }

    }

    public InstantCredit4xPortProxy() {
        _descriptor = new Descriptor();
    }

    public InstantCredit4xPortProxy(URL wsdlLocation, QName serviceName) {
        _descriptor = new Descriptor(wsdlLocation, serviceName);
    }

    public Descriptor _getDescriptor() {
        return _descriptor;
    }

    public InstantCredit44Response instantCredit44(InstantCredit44 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().instantCredit44(parameters,credentials);
    }

    public InstantCredit43Response instantCredit43(InstantCredit43 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().instantCredit43(parameters,credentials);
    }

    public InstantCredit46Response instantCredit46(InstantCredit46 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().instantCredit46(parameters,credentials);
    }

    public InstantCredit47Response instantCredit47(InstantCredit47 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().instantCredit47(parameters,credentials);
    }

    public InstantCredit48Response instantCredit48(InstantCredit48 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().instantCredit48(parameters,credentials);
    }

    public InstantCredit49Response instantCredit49(InstantCredit49 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().instantCredit49(parameters,credentials);
    }

    public InstantCredit41Response instantCredit41(InstantCredit41 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().instantCredit41(parameters,credentials);
    }

    public InstantCredit411Response instantCredit411(InstantCredit411 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().instantCredit411(parameters,credentials);
    }

    public InstantCredit40Response instantCredit40(InstantCredit40 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().instantCredit40(parameters,credentials);
    }

    public InstantCredit42Response instantCredit42(InstantCredit42 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().instantCredit42(parameters,credentials);
    }

    public InstantCredit410Response instantCredit410(InstantCredit410 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().instantCredit410(parameters,credentials);
    }

    public InstantCredit45Response instantCredit45(InstantCredit45 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().instantCredit45(parameters,credentials);
    }

}