package org.example;

import javax.xml.bind.JAXBContext;
import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {


        Endpoint.publish("http://0.0.0.0:90/",new BankService());
        System.out.println("Deployed on http://0.0.0.0:90");
       // JAXBContext jaxbContext = JAXBContext.newInstance(Compte.class);


    }
}