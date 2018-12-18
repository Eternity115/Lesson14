
package Stacks;


public class Container {
    private static int nextid = 1001;
    private int id;
    private String name;
    
    public Container(){
        id = nextid++;
        name = "unassigned";
    }

    public void book(String name) {
        this.name = name;
    }
    
    public void unbook(String name) {
        this.name = "unassigned";
    }

    @Override
    public String toString() {
        return "ID: " + id + "| Borrower: " + name;
    }
    
}
