package com.cleva.aventurier.service;

import org.springframework.stereotype.Service;

@Service
public class HeroService {

    private int heroPositionX = 0;
    private int heroPositionY = 10;
    
    private String[] carte = new String[] {
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
    
    public void moveHero(String direction) {
        switch (direction) {
            case "N":
                if (heroPositionY > 0 && isCellAccessible(heroPositionY - 1, heroPositionX)) {
                    heroPositionY--;
                }
                break;
            case "S":
                if (heroPositionY < carte.length - 1 && isCellAccessible(heroPositionY + 1, heroPositionX)) {
                    heroPositionY++;
                }
                break;
            case "E":
                if (heroPositionX < carte[heroPositionY].length() - 1 && isCellAccessible(heroPositionY, heroPositionX + 1)) {
                    heroPositionX++;
                }
                break;
            case "W":
                if (heroPositionX > 0 && isCellAccessible(heroPositionY, heroPositionX - 1)) {
                    heroPositionX--;
                }
                break;
        }
    }

    private boolean isCellAccessible(int y, int x) {
        return carte[y].charAt(x) != '#';
    }
    
    public int getHeroPositionX() {
        return heroPositionX;
    }

    public int getHeroPositionY() {
        return heroPositionY;
    }
    
    public void setHeroPosition(int x, int y) {
        this.heroPositionX = x;
        this.heroPositionY = y;
    }

}
