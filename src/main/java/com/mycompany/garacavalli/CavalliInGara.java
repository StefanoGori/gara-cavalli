/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.garacavalli;

/**
 *
 * @author informatica
 */
public class CavalliInGara implements Runnable{
    Cavalli cavalli;
    GaraCavalli campo;
    Thread t;
    int velocita;
    int conta;
    int posizione;
    
    public CavallInGara(Cavalli c,GaraCavalli g){
        cavalli=c;
        campo=g;
        conta=0;
        velocita=2;
        t=new Thread(this);
        t.start();
        posizione=0;
    }
}
