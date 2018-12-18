
package Queues;


public class Caller {
    private String name;
    private int id;
    private static int nextid=0;
    
    public Caller (String nm){
        nextid++;
        id=nextid;
        name = nm;
    }

    @Override
    public String toString() {
        return "Caller{" + "Name = " + name + ", id = " + id + '}';
    }
    
}
