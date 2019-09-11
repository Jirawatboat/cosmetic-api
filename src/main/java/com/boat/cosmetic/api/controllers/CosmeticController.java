package com.boat.cosmetic.api.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boat.cosmetic.api.entities.Cosmetic;
import com.boat.cosmetic.api.services.CosmeticService;
@RestController
public class CosmeticController {
	
	
	@Autowired 
	CosmeticService cosmeticService; 

	
	  List<Cosmetic> cosmetics = new ArrayList<>(Arrays.asList(
	  
	  ));
	 
    
    @RequestMapping("/cosmetics")
    public List<Cosmetic> getAllCosmetics() {
        return cosmeticService.getAllCosmetics();
    }
    @RequestMapping(value = "/cosmetics/{id}",
                    method=RequestMethod.DELETE)
    public void deleteCosmetics(@PathVariable String id) {
        for(int i = 0; i < cosmetics.size(); i++) {
            if(cosmetics.get(i).getId().equals(id)) {
                cosmetics.remove(i);
                break;
            }
        }
    }
    @RequestMapping(value = "/cosmetics", 
    		method=RequestMethod.POST)
    public void addCosmetic(@RequestBody Cosmetic cosmetic) {
    	cosmeticService.addCosmetic(cosmetic);
    	//CosmeticService.addCosmetic(cosmetic);
    }
}
