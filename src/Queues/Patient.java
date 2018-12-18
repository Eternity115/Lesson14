
package Queues;

import java.time.LocalDateTime;


public class Patient implements Comparable<Patient>{
    private String name;
    private int condition;
    private LocalDateTime time;
    public Patient(String nm, int con){
        name = nm;
        condition = con;
        time = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }
    

    @Override
    public String toString() {
        String cond;
        if (condition==3){
            cond="Fair";
        }
        else if (condition==2){
            cond="Serious";
        }
        else if (condition==1){
            cond="Critical";
        }
        else 
            throw new AssertionError();
        return name + "\t" + cond;
        
    }
    
    
    
    @Override
    public int compareTo(Patient other) {
        if (condition==other.condition)
            return time.compareTo(other.time);
        else 
            return condition-other.condition;
    }
    
}
