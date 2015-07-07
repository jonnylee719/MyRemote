/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jlee;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Jonathan
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
   
    public String sayHello() throws RemoteException {
        String hello = "Hello";
        return hello;
    }
    
    public MyRemoteImpl() throws RemoteException{
        
    }
    
    public static void main(String[] args) {
        try{
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
