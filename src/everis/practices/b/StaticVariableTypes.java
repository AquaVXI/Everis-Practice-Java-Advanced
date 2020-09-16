/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everis.practices.b;

import everis.practices.Test;

/**
 *
 * @author Kurisutian
 */
public class StaticVariableTypes implements Test{
    public static String myClassVar = "class or static variable";
    
    public static void getValues(StaticVariableTypes... objects){
        for(var o : objects){
            System.out.println(o.myClassVar);
        }
    }

    @Override
    public void test() {
        var o1 = new StaticVariableTypes();
        var o2 = new StaticVariableTypes();
        var o3 = new StaticVariableTypes();
        
        // Each object passed as parameter print the static variable value.
        StaticVariableTypes.getValues(o1, o2, o3);
        
        // Change the value from one object (can be any)
        o1.myClassVar = "Hi!";
        
        // Show the variable data using the three objects previously created. 
        StaticVariableTypes.getValues(o1, o2, o3);
    }
}
