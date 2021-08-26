package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

public class Registry {

    /**
     * voters arrayList
     */
    private ArrayList<Integer> votantes = new ArrayList<Integer>();

    
    /**
     * Check if the voter could vote
     * @param p person that is Voting
     * @return Register Result
     */
    public RegisterResult registerVoter(Person p) {
        RegisterResult result = null;
        if(p.isAlive()){
            if(p.getAge()<18){
                result = p.getAge()< 0?RegisterResult.UNDERAGE:RegisterResult.INVALID_AGE;
            }else if(votantes.contains(p.getId())){
                result = RegisterResult.DUPLICATED;
            }else{
                votantes.add(p.getId());
                result = RegisterResult.VALID;
            }
        }else{
            result = RegisterResult.DEAD;
        }
        return result;
    }
}