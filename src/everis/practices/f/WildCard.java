/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everis.practices.f;

import everis.practices.Test;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kurisutian
 */
public class WildCard implements Test{

    private void giveFood(List<? super Animal> list){
        for(Object a: list){
            String name = ((Animal) a).getName();
            System.out.println(name + " has started to eat. Now is happy and says...");
            ((Animal) a).eat();
        }
    }
    
    private void showDataFrom(List<?> list){
        if(list.isEmpty()){
            System.out.println("La lista está vacía.");
        }else{
            for(var a: list){
                System.out.println(a);
            }
        }
    }
    
    @Override
    public void test() {
        
        System.out.println("... Next report: Show a wild card empty list.");
        List<?> unkownGenericList = new ArrayList<>();
        showDataFrom(unkownGenericList);
        
        // Animal subclasses objects
        var d1 = new Dog();
        var c1 = new Cat();
        d1.setName("Luna");
        c1.setName("Murci");
        
        System.out.println("... Next report: Show a wild card list which contain Animal subclass objects type.");
        List<? super Animal> animalInheritanceList = new ArrayList<>();
        animalInheritanceList.add(d1);
        animalInheritanceList.add(c1);
        
        showDataFrom(animalInheritanceList);
        giveFood    (animalInheritanceList);
        
        List<? extends Animal> animalExtendsList = new ArrayList<>();
        showDataFrom(animalExtendsList);
        
    }
    
}
