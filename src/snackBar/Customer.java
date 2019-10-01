package snackBar;

public class Customer
{
    //fields

    private static int maxId = 0;
    private int id;
    private String name;
    private double cash;

    //constructor

    public Customer(String name, double cash)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.cash = cash;
    }

    // methods - set and get

    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setCash(double cash)
    {
        this.cash = cash;
    }

    public double getCash()
    {
        return cash;
    }

    public void addCash(double numToAdd)
    {
      cash += numToAdd;
    }
  
    public void buySnack(double total)
    {
      cash -= total;
    }
   


}