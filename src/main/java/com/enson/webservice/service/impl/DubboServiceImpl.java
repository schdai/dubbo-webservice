    package com.enson.webservice.service.impl;  
      
    import java.text.SimpleDateFormat;  
    import java.util.Date;

import javax.jws.WebService;

import com.enson.webservice.service.DubboService;  
     @WebService(targetNamespace="http://www.cdxt.com.cn") 
    public class DubboServiceImpl implements DubboService {  
      
        public String printWord(String word) {  
            String outWord = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS")  
                    .format(new Date()) + word;  
      
            System.out.println("接收到的 输入参数是："+word);
            System.out.println(outWord);  
      
            return outWord;  
        }  
      
    }  