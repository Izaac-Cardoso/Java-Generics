package service;

import java.util.Map;
import java.util.HashMap;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

import entity.Candidate;

public class Process {

    Candidate candidate; 
    Map<String, Integer> poll = new HashMap<>();
    String fields[], line, path;
 
    public String getPath(String directory) {
        return path = directory;
    }

    public void processFile() {
        try(BufferedReader bf = new BufferedReader(new FileReader(path))) {
            while((line = bf.readLine()) != null) {
               fields = line.split(",");
      
               String name = fields[0];
               Integer count = Integer.parseInt(fields[1]);
      
               /*
                *if a name already exists in the poll then take their value pair
                *and sum it up with the others values assigned to their name else 
                *add the new key-value to HashMap.
                */
               if(poll.containsKey(name)) {
                  int votesSoFar = poll.get(name);
                  poll.put(name, count + votesSoFar);
               } else {
                  poll.put(name, count);
               }         
            } 
            for(String key : poll.keySet()) {
                System.out.println(key + ": " + poll.get(key));
            }      
       } catch(IOException e) {
            System.out.print("Error: " + e.getMessage());
        }
       
    }
}



