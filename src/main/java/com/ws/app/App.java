package com.ws.app;


import javax.xml.ws.Endpoint;

public class App {
    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:8081/myWs", new ProcessorImpl());

        // console wsimport http://127.0.0.1:8081/myWs?wsdl  for generate class files
        // console wsimport - keep http://127.0.0.1:8081/myWs?wsdl  for generate class files and java files


    }
}
