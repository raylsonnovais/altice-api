package com.altice.services;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AlticeService {

    public List<Integer> altice = new ArrayList<Integer>(Arrays.asList(0, 1, 1));

    public Integer sequenciaAltice(Integer n){
        return n > 2 ? maiorQueDois(n) : menorQueDois(n);
    }
    
    public List<Integer> allSequenceAltice(Integer n){
    	return mountList(n);
    }
    
    private List<Integer> mountList(Integer n){
    	for(int count = 0; count < n ;count++){
        	if(count + 1 >= altice.size()) {
        		altice.add(altice.get(n - 3) + altice.get(n - 2));
        	}	
        }
    	return altice;
    }

    private Integer maiorQueDois(Integer n){
    	List<Integer> list = mountList(n);
        return list.get(n);
    }

    private Integer menorQueDois(Integer n){
        return altice.get(n);
    }

}
