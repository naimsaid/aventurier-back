
package com.cleva.aventurier;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cleva.aventurier.service.HeroService;

@SpringBootTest
public class HeroServiceIntegrationTest {

    @Autowired
    private HeroService heroService;

    @Test
    public void testMoveHero() {
        // Position initiale connue du héros (0,10)    
    	
    	
        heroService.setHeroPosition(0, 10);
        

        String directions = "SSSSEEEEEENN";
        for (char direction : directions.toCharArray()) {
            heroService.moveHero(String.valueOf(direction));
        }
        
        // Assert: Vérifie que la position du héros a été mise à jour correctement
        assertThat(heroService.getHeroPositionY()).isEqualTo(10);
    }
}
