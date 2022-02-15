package src.com.oop.football;

public class Position 
{
    
    public enum positions 
    {
        Defense(40), Midfield(38), Attackers(35);
        int value;
        private positions(int value)
        {
            this.value = value;
        }
    };


}
