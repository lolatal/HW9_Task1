package by.tms;

public class SonyHand implements IHand{
    private int price;
    public SonyHand(int price){
        this.price=price;
    }
    public SonyHand(){}
    public void upHand(){
        System.out.println("Поднимается рука Sony");
    }
    public int getPrice(){
        return price;
    }
}
