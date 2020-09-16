/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everis.practices.f;

/**
 *
 * @author Kurisutian
 */
abstract class Animal {
    
    private String name;
    private String type;
    
    String getName(){
        return this.name;
    }
    
    void setName(String name){
        this.name = name;
    }
    
    abstract String getType();
    
    void eat(){
        System.out.println("Munch munch");
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("");
        sb.append("Name: ").append(name);
        sb.append("\n");
        sb.append("Type: ").append(getType());
        return sb.toString();
    }
    
}