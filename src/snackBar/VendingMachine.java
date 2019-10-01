package snackBar;

public class VendingMachine
{
    //fields

    private static int maxId = 0;
    private int id;
    private String name;

    //constructor

    public VendingMachine(String name)
    {
        maxId++;
        id = maxId;
        this.name = name;
    }

    //methods- setters and getters

    public int getId() //getter
    {
        return id;
    }

    public void setName(String name)   //setter
    {
        this.name = name;
    }

    public String getName() //getter
    {
        return name;
    }




}