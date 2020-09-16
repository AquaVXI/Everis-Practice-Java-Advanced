/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everis.practices.g;

import everis.practices.Test;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author Kurisutian
 */
public class IntroLambda implements Test{
    
    private List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    private void withLambdas(){
        System.out.println("Test Lambda: With lambdas");
        list.forEach(System.out::println);
    }
    
    private void withLambdasStreamOf(){
        System.out.println("Test Lambda: With lambdas (Stream.of(list).forEach(println))");
        Stream.of(list).forEach(System.out::println);
    }
    
    private void withLambdasInterface(){
        System.out.println("Test Lambda: With lambdas using the interface");
        
        IFuncionalLambda ifLambda = (a, b) -> {
            System.out.println(a+b);
            return a + b;
        };
        
        ifLambda.suma(5, 4);
    }
    
    private void withoutLambdas(){
        System.out.println("Test Lambda: Without lambdas");
        for(var n : list){
            System.out.println("Número: "+n);
        }
    }
    
    @Override
    public void test() {
        
        withoutLambdas();
        
        System.out.println("");
        withLambdas();
        
        System.out.println("");
        withLambdasStreamOf();
        
        System.out.println("");
        withLambdasInterface();
        
    }
    
}
