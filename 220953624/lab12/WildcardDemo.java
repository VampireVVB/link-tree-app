
import java.util.ArrayList;
import java.util.List;

class Vehicle 
{
    public void tires() 
    {
        System.out.println("vehicles have even numbers of tires");
    }
}

class twowheeler extends Vehicle 
{
    @Override
    public void tires() 
    {
        System.out.println("Two wheelers have two tires");
    }
}

class threewheeler extends Vehicle 
{
    @Override
    public void tires() 
    {
        System.out.println("Three wheelers have three tires");
    }
}

public class WildcardDemo 
{
     public static void printnumtires(List<? extends Vehicle> vehicles)
    {
        for (Vehicle vehicle: vehicles)
        {
            vehicle.tires();
        }
    }
    public static void main(String[] args)
    {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new twowheeler());
        vehicles.add(new threewheeler());
            printnumtires(vehicles);

        List<twowheeler> tw = new ArrayList<>();
        tw.add(new twowheeler());
        tw.add(new twowheeler());
            printnumtires(tw);

        List<threewheeler> thw = new ArrayList<>();
        thw.add(new threewheeler());
        thw.add(new threewheeler());
            printnumtires(thw);
    }
}