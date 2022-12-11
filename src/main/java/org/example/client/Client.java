package org.example.client;

import org.example.proxy.BankService;
import org.example.proxy.BankWs;

public class Client {

    public static void main(String[] args) {
        BankService stub = new BankWs().getBankServicePort();
        System.out.println(stub.convert(11));
    }
}
