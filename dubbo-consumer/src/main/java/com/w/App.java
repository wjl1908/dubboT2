package com.w;

import com.w.service.IBookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:consumer-dubbo.xml");
        context.start();
        System.out.println("consumer启动成功");
        IBookService iBookService= (IBookService) context.getBean("useMsg");
        System.out.println(iBookService);
        System.in.read();
    }
}
