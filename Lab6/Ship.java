/**
 * Praciticing OOP by creating a Box class.
 * Sandrin Pacifique Muramutsa, Wilfred Robert-Fajimi
 * 04/26/2024
 */

public class Ship 
{
    private String name;
    private int year;
    private String country;
    
    public Ship(String nam, int yea, String count)
    {
        name = nam;
        year = yea;
        country = count;
    }

    public String getName() 
    {
        return name;
    }

    public int getYear() 
    {
        return year;
    }

    public String getCountry() 
    {
        return country;
    }

    @Override
    public String toString() 
    {
        return name+", "+year + ", flag:"+country;
    }
}

