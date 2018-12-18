
package Queues;

import java.util.ArrayDeque;
import java.util.Queue;


public class RadioCallinShow {

    
    public static void main(String[] args) {
        Queue<Caller> phoneLine = new ArrayDeque();
        phoneLine.add(new Caller ("Bob"));
        phoneLine.add(new Caller ("Tom"));
        phoneLine.add(new Caller ("Cindy"));
        
        System.out.println("We currently have " + phoneLine.size() + " callers.");
        System.out.println("Taking the next caller");
        Caller next = phoneLine.remove();
        System.out.println("Talking to" + next);
        
        System.out.println("Two more people have called in and are now on hold");
        phoneLine.add(new Caller("George"));
        phoneLine.add(new Caller("Elaine"));
        
        System.out.println("Find out who the next caller is: " + phoneLine.peek());
        System.out.println("Talking to next caller: " + phoneLine.remove());
        
        System.out.println("We are out of time! --- lets say hi to sll the other callers");
        while(phoneLine.isEmpty()==false){
            System.out.println("Talking to next caller: " + phoneLine.remove());
        }
    }
    
}
