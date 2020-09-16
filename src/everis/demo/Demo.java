/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everis.demo;

import everis.practices.Test;
import everis.practices.b.StaticVariableTypes;
import everis.practices.d.Time;
import everis.practices.e.Generics;
import everis.practices.f.WildCard;
import everis.practices.g.IntroLambda;

/**
 *
 * @author Kurisutian
 */
public class Demo {
    public static void main(String[] args) {
        
        // 1st Practice - Hello world
        System.out.println("Hello world!");
        
        // 2nd Practice - Static variable Types
        Test staticVarTypes = new StaticVariableTypes();
        staticVarTypes.test();
            
        // 3rd Practice - Data Types
            // See DataTypes class at 'practices > c_third' package.
        
        // 4th Practice - Time clock
        Test time = new Time();
        time.test();
        
        // 5th Practice - Generics
        Test generics = new Generics();
        generics.test();
        
        // 6th Practices - Generics and WildCards
        Test wildCard = new WildCard();
        wildCard.test();
        
        // 7th Practices - Introduction to Lambdas
        Test lambdas = new IntroLambda();
        lambdas.test();
    }
}
