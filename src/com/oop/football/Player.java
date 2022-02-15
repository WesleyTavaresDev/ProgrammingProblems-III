package src.com.oop.football;

import lombok.AllArgsConstructor;
import src.com.oop.football.Position.positions;

@AllArgsConstructor
public class Player
{
    private String name;
    private positions position;
    private String birthDay;
    private String nationality;
    private int height;
    private int weight;
}
