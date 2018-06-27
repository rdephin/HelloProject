package net.alldata.axes.web_services.sales;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;

public class Sale3xPortProxy{

    protected Descriptor _descriptor;

    public class Descriptor {
        private net.alldata.axes.web_services.sales.Sales3X _service = null;
        private net.alldata.axes.web_services.sales.Sale3X _proxy = null;
        private Dispatch<Source> _dispatch = null;

        public Descriptor() {
            init();
        }

        public Descriptor(URL wsdlLocation, QName serviceName) {
            _service = new net.alldata.axes.web_services.sales.Sales3X(wsdlLocation, serviceName);
            initCommon();
        }

        public void init() {
            _service = null;
            _proxy = null;
            _dispatch = null;
            _service = new net.alldata.axes.web_services.sales.Sales3X();
            initCommon();
        }

        private void initCommon() {
            _proxy = _service.getSale3XPort();
        }

        public net.alldata.axes.web_services.sales.Sale3X getProxy() {
            return _proxy;
        }

        public Dispatch<Source> getDispatch() {
            if (_dispatch == null ) {
                QName portQName = new QName("http://axes.alldata.net/web-services/sales", "Sale3xPort");
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

    public Sale3xPortProxy() {
        _descriptor = new Descriptor();
    }

    public Sale3xPortProxy(URL wsdlLocation, QName serviceName) {
        _descriptor = new Descriptor(wsdlLocation, serviceName);
    }

    public Descriptor _getDescriptor() {
        return _descriptor;
    }

    public Sales33Response sales33(Sales33 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().sales33(parameters,credentials);
    }

    public Sales34Response sales34(Sales34 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().sales34(parameters,credentials);
    }

    public Sales35Response sales35(Sales35 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().sales35(parameters,credentials);
    }

    public Sales36Response sales36(Sales36 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().sales36(parameters,credentials);
    }

    public Sales30Response sales30(Sales30 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().sales30(parameters,credentials);
    }

    public Sales32Response sales32(Sales32 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().sales32(parameters,credentials);
    }

    public Sales37Response sales37(Sales37 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().sales37(parameters,credentials);
    }

    public Sales31Response sales31(Sales31 parameters, Credentials credentials) {
        return _getDescriptor().getProxy().sales31(parameters,credentials);
    }

}