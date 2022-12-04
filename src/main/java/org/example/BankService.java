package org.example;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@WebService(serviceName = "BankWs")
public class BankService {

    @WebMethod(operationName = "Convert")
    public double conversion(@WebParam(name = "montant") double montant){

        return montant*11;
    }

    @WebMethod(operationName = "GetAccount")
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code,10000*Math.random(),new Date());
    }


    @WebMethod(operationName = "GetAccounts")
    public List<Compte> listeCompte(){
        ArrayList<Compte> comptes = new ArrayList<>();
        comptes.add( new Compte(1,10000*Math.random(),new Date()));
        comptes.add( new Compte(2,10000*Math.random(),new Date()));
        comptes.add( new Compte(3,10000*Math.random(),new Date()));

        return comptes;
    }
}
