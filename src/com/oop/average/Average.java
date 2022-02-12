package src.com.oop.average;

public class Average 
{
    private double numberOne;
    private double numberTwo;
    private double numberThree;
    
    public Average(){}

    public Average(double numberOne, double numberTwo, double numberThree)
    {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.numberThree = numberThree;
    }
    
    public double average()
    {
        return (numberOne + numberTwo + numberThree) / 3; 
    }
}
