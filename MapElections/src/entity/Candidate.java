package entity;

public class Candidate {
    private String name;
    private Integer votes;
 
    public Candidate(String label, Integer ballot) {
       name = label;
       votes = ballot;
    }
 
    public String getName() {
       return name;
    }
 
    public Integer getVote() {
       return votes;
    }
 
    @Override
    public int hashCode() {
       final int prime = 31;
       int result = 1;
       result = prime * result + ((name == null)? 0 : name.hashCode());   //if name is null sum with 0 otherwise calls for hashCode on name
       result = prime * result + ((votes == null)? 0 : votes.hashCode());
       return result;
    }
 
    @Override
    public boolean equals(Object obj) {
       if(this == obj) {
          return true;
       }
       if(obj == null) {
          return false;
       }
       if(getClass() != obj.getClass()) {
          return false;
       }
       Candidate other = (Candidate) obj;
       if(name == null) {
          if(other.name != null) {
             return false;
          }        
       } else if(!name.equals(other.name)) {
          return false;
       } 
       if(votes == null) {
          return false;
       } else if(!votes.equals(other.votes)) {
          return false;
       }
       return true;
    }
}
