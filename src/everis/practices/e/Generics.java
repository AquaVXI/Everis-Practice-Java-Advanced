/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everis.practices.e;

import everis.practices.Test;

/**
 *
 * @author Kurisutian
 */
public class Generics<T> implements Test {
    
    public void m(T t){
        System.out.println("Soy un genérico, y mi parámetro es: "+t);
    }

    @Override
    public void test() {
        var g1 = new Generics<String>();
        g1.m("Soy un genérico de tipo <String>.");
        
        var g2 = new Generics<Integer>();
        g2.m(2);
    }
    
}
