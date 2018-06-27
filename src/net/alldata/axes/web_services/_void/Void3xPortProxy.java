package net.alldata.axes.web_services._void;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;

public class Void3xPortProxy{

    protected Descriptor _descriptor;

    public class Descriptor {
        private net.alldata.axes.web_services._void.Void3X_Service _service = null;
        private net.alldata.axes.web_services._void.Void3X _proxy = null;
        private Dispatch<Source> _dispatch = null;

        public Descriptor() {
            init();
        }

        public Descriptor(URL wsdlLocation, QName serviceName) {
            _service = new net.alldata.axes.web_services._void.Void3X_Service(wsdlLocation, serviceName);
            initCommon();
        }

        public void init() {
            _service = null;
            _proxy = null;
            _dispatch = null;
            _service = new net.alldata.axes.web_services._void.Void3X_Service();
            initCommon();
        }

        private void initCommon() {
            _proxy = _service.getVoid3XPort();
        }

        public net.alldata.axes.web_services._void.Void3X getProxy() {
            return _proxy;
        }

        public Dispatch<Source> getDispatch() {
            if (_dispatch == null ) {
                QName portQName = new QName("http://axes.alldata.net/web-services/void", "Void3xPort");
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

    public Void3xPortProxy() {
        _descriptor = new Descriptor();
    }

    public Void3xPortProxy(URL wsdlLocation, QName serviceName) {
        _descriptor = new Descriptor(wsdlLocation, serviceName);
    }

    public Descriptor _getDescriptor() {
        return _descriptor;
    }

    public Sale36Response sale36(Sale36 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().sale36(parameters,credentials);
    }

    public Void33Response void33(Void33 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().void33(parameters,credentials);
    }

    public Return35Response return35(Return35 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().return35(parameters,credentials);
    }

    public Void30Response void30(Void30 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().void30(parameters,credentials);
    }

    public Sale37Response sale37(Sale37 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().sale37(parameters,credentials);
    }

    public Return37Response return37(Return37 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().return37(parameters,credentials);
    }

    public Void34Response void34(Void34 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().void34(parameters,credentials);
    }

    public Void35Response void35(Void35 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().void35(parameters,credentials);
    }

    public Return36Response return36(Return36 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().return36(parameters,credentials);
    }

    public Return34Response return34(Return34 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().return34(parameters,credentials);
    }

    public Void32Response void32(Void32 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().void32(parameters,credentials);
    }

    public Void31Response void31(Void31 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().void31(parameters,credentials);
    }

}