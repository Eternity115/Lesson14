
package Stacks;


public class Tire {
    private String name;
    private String id;
    private static int nextid=1000;
    
    public Tire(String n){
        name = n;
        id="T- " +  nextid;   //or id=nextid++; to do it on one line
        nextid++;
    }

    @Override
    public String toString() {
        return "Tire{" + "Name: " + name + ", id: " + id + '}';
    }
    
    
}
