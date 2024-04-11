package com.cleva.aventurier.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cleva.aventurier.service.HeroService;

@RestController
public class HeroController {
	
    private int heroPositionX = 0;
    private int heroPositionY = 0;
    	
    @Autowired
    private HeroService heroService;

    @PostMapping("/api/moveHero")
    @CrossOrigin
    public ResponseEntity<?> moveHero(@RequestBody String direction) {
        heroService.moveHero(direction);
        int[] newPosition = { heroService.getHeroPositionX(), heroService.getHeroPositionY() };      

        return ResponseEntity.ok().body(newPosition);
    }
	

    @GetMapping("/api/carte")
    @CrossOrigin
    public String[] getCarte() {
        return new String[] {
        	    "###    ######    ###",
        	    "###      ##      ###",
        	    "##     ##  ##     ##",
        	    "#      ##  ##      #",
        	    "##                ##",
        	    "#####          #####",
        	    "###### ##  ##  #####",
        	    " #     ######     # ",
        	    "     ########       ",
        	    "    ############    ",
        	    "    ############    ",
        	    "     ########      #",
        	    " #     ######     ##",
        	    "###### ##  ## ######",
        	    "#####          #####",
        	    "##                ##",
        	    "#   ## #    # ##   #",
        	    "##   ##      ##   ##",
        	    "###    #    #    ###",
        	    "###    ######    ###"
            
        };
    }


    
    @GetMapping("/api/position")
    @CrossOrigin
    public int[] getHeroPosition() {
        return new int[]{heroPositionX, heroPositionY};
    }
    
    

 
    
  
}
