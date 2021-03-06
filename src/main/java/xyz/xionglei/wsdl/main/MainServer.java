package xyz.xionglei.wsdl.main;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import xyz.xionglei.wsdl.service.PortalUserImpl;

public class MainServer {

    public static void main(String[] args) {
        JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
        jaxWsServerFactoryBean.setAddress("http://xionglei.jiuqi.com.cn:9999/wsdl_service");
        jaxWsServerFactoryBean.setServiceClass(PortalUserImpl.class);
        Server server = jaxWsServerFactoryBean.create();
        server.start();
    }
}
