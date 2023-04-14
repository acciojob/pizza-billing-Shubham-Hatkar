package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int toppings;
    boolean isExtraCheesAdded;
    boolean isExtraToppingAdded;
    boolean isBillCreated;
    boolean isTakeAway;

    public Pizza(Boolean isVeg)
    {
        this.isVeg = isVeg;
        if(isVeg)
        {
            this.price = 300;
            this.toppings = 70;
        }
        else
        {
            this.price = 400;
            this.toppings = 120;
        }

        this.isExtraCheesAdded = false;
        this.isExtraToppingAdded = false;
        this.isBillCreated = false;
        this.isTakeAway = false;

        this.bill = "Base Price Of The Pizza: " + this.price + "\n";

    }

    public int getPrice()
    {
        return this.price;
    }

    public void addExtraCheese()
    {
        // your code goes here
        if(isExtraCheesAdded == false)
        {
            this.price += 80;
            this.isExtraCheesAdded = true;
        }
    }

    public void addExtraToppings()
    {
        if(isExtraToppingAdded == false)
        {
            this.price += this.toppings;
            this.isExtraToppingAdded = true;
        }
    }

    public void addTakeaway()
    {
        // your code goes here
        if(isTakeAway == false)
        {
            this.price += 20;
            this.isTakeAway = true;
        }
    }

    public String getBill()
    {
        // your code goes here
        if(this.isBillCreated == false)
        {
            if(isExtraCheesAdded == true)
            {
                this.bill += "Extra Cheese Added: 80" + "\n";
            }
            if(isExtraToppingAdded == true)
            {
                this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            }
            if(isTakeAway == true)
            {
                this.bill += "Paperbag Added: 20" + "\n";
            }
            this.bill += "Total Price: " + this.price;
            this.isBillCreated = true;
            return this.bill;
        }

       return "";
    }
}
