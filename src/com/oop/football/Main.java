package src.com.oop.football;

import src.com.oop.football.Position.positions;

public class Main 
{
    public static void main(String[] args) 
    {
        Player neymar = new Player("Wesley", positions.Attackers, 5, 02, 1992, "Brazilian", 1.75D, 80);

        neymar.playerInfo();
    }    
}
