这是一个基于dubbo，将对外发布成一个web服务。

dubbo 2.5.3 + cxf 2.7.7能正常发布服务；

但dubbo 2.6.5 +cxf 3.2.7  不能正常发布，wsdl会少点行服务地址的内容，但能生成wsdl， soap调用不起，手工把服务地址补上则可以调用  ； 这种情况可以通过dubbo 2.6.5 和 spring cxf分开配置来实现
