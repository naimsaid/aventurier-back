package com.cleva.aventurier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cleva.aventurier.service.HeroService;

import static org.junit.jupiter.api.Assertions.*;

class HeroServiceTest {

    private HeroService heroService;

    @BeforeEach
    void setUp() {
        heroService = new HeroService();
    }

    @Test
    void moveHeroTest1() {
        // la position initiale directement du premier test
        heroService.setHeroPosition(3, 0);
        String directions = "SSSSEEEEEENN";
        for (char direction : directions.toCharArray()) {
            heroService.moveHero(String.valueOf(direction));
        }
        assertEquals(9, heroService.getHeroPositionX());
        assertEquals(2, heroService.getHeroPositionY());
    }

    @Test
    void moveHeroTest2() {
        //  la position initiale directement du deuxieme test
        heroService.setHeroPosition(6, 9);
        String directions = "WWNWWWSWS"; 
        for (char direction : directions.toCharArray()) {
            heroService.moveHero(String.valueOf(direction));
        }
        assertEquals(6, heroService.getHeroPositionX()); 
        assertEquals(9, heroService.getHeroPositionY()); 
    }
}
