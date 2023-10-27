package com.example;

import com.example.Proxy.ProxyImg;

/**
 * test Design Pattern Proxy
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ProxyImg proxyImg = new ProxyImg("test_10mb.jpg");
        proxyImg.display();
        System.out.println("");
        proxyImg.display();
    }
}
