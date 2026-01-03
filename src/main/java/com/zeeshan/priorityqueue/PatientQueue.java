package com.zeeshan.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PatientQueue {
    public static void main(String[] args) {
        Comparator<Patient> patientComparator = (p1,p2)->{
            if(p1.age!= p2.age){
                return Integer.compare(p2.getAge(), p1.getAge());
            }else{
                return p1.gender.compareTo(p2.gender);
            }
        };

        PriorityQueue<Patient> priorityQueue = new PriorityQueue<>(patientComparator);
        priorityQueue.add(new Patient("John",67,"Male"));
        priorityQueue.add(new Patient("Aliya",34,"Female"));
        priorityQueue.add(new Patient("Jesus",34,"Male"));
        priorityQueue.add(new Patient("Kiara",29,"Female"));
        priorityQueue.add(new Patient("Robert",97,"Male"));

        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
    }
}
