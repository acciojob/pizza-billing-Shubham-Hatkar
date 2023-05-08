package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int toppings;
    boolean isExtraCheeseAdded;
    boolean isExtraToppingsAdded;
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

        this.isExtraCheeseAdded = false;
        this.isTakeAway = false;
        this.isBillCreated = false;
        this.isExtraToppingsAdded = false;

        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice()
    {
        return this.price;
    }

    public void addExtraCheese()
    {
        if(!isExtraCheeseAdded)
        {
            isExtraCheeseAdded = true;
            this.price += 80;
        }
    }

    public void addExtraToppings()
    {
        if(!isExtraToppingsAdded)
        {
            isExtraToppingsAdded = true;
            this.price += this.toppings;
        }
    }

    public void addTakeaway()
    {
        // your code goes here
        if(!isTakeAway)
        {
            this.isTakeAway = true;
            this.price += 20;
        }
    }

    public String getBill()
    {
        // your code goes here
        if(!isBillCreated)
        {
            this.isBillCreated = true;

            if(isExtraCheeseAdded)
            {
                this.bill += "Extra Cheese Added: 80" + "\n";
            }
            if(isExtraToppingsAdded)
            {
                this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            }
            if(isTakeAway)
            {
                this.bill += "Paperbag Added: 20" + "\n";
            }
            this.bill += "Total Price: " + this.price;
            return this.bill;
        }
        return "";
    }
}
