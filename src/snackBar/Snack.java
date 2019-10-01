package snackBar;

public class Snack
{
    //fields

    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int machineId;

    //constructor
    public Snack(String name, int quantity, double cost, int machineId)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.machineId = machineId;
    }

    //methods- setters and getters

    public int getId()
    {
        return id;
    }

    public void setSnack(String name)
    {
        this.name = name;
    }

    public String getSnack()
    {
        return name;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public double getCost()
    {
        return cost;
    }

    public void setMachineId(int machineId)
    {
        this.machineId = machineId;
    }

    public int getMachineId()
    {
        return machineId;
    }



    public void addQuantity(int numToAdd)
    {
      quantity += numToAdd;
    }
  
    public void buySnack(int numToBuy)
    {
      quantity -= numToBuy;
    }
  
    public double getTotalCost(int quantity)
    {
      return cost * quantity;
    }
  
    @Override
    public String toString()
    {
      String rtnStr = "name: " + name + "\n" +
                      "quantity: " + quantity + "\n" +
                      "vendingMachineId: " + machineId + "\n" +
                      "total cost of all snacks on hand: " + (cost * quantity) + "\n";
      return rtnStr;
    }
  } 