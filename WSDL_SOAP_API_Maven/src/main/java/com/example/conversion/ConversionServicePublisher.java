package com.example.conversion;

import org.apache.cxf.frontend.ServerFactoryBean;

public class ConversionServicePublisher {
    public static void main(String[] args) {
        ServerFactoryBean serverFactory = new ServerFactoryBean();
        serverFactory.setServiceClass(ConversionServiceImpl.class);
        serverFactory.setAddress("http://localhost:8080/conversionService");
        serverFactory.create();
        System.out.println("Service is published at http://localhost:8080/conversionService");
    }
}
