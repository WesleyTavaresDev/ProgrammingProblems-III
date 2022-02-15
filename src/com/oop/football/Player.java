package src.com.oop.football;

import src.com.oop.football.Position.positions;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Player
{
    private String name;
    private positions position;

    private int dayBirth, monthBirth, yearBirth;

    private String nationality;
    private double height;
    private int weight;

    public void playerInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Player position: " + position);

        System.out.printf("\n%s/%s/%s\n", dayBirth, monthBirth, yearBirth);
        System.out.println("Nationality: " + nationality);
        System.out.println("Height:"  + height);
        System.out.println("Weight: " + weight);

        System.out.println("Age: " + getAge());
        System.out.println("Time for retire: " + position.getTimeForRetire(getAge(), position) + "years");
    }

    int getAge()
    {
        return AgeCalculator.calculateAge(dayBirth, monthBirth, yearBirth);
    }
}
