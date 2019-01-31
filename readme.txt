这是一个基于dubbo，将对外发布成一个web服务。

dubbo 2.5.3 + cxf 2.7.7能正常发布服务；

但dubbo 2.6.5 +cxf 3.2.7  不能正常发布，会少内容。这种情况可以通过dubbo 2.6.5 和 spring cxf分开配置来实现