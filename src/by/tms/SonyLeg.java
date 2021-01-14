package by.tms;

public class SonyLeg implements ILeg{
    private int price;
    public SonyLeg(int price){
        this.price=price;
    }
    public SonyLeg(){}
    public void step(){
        System.out.println("Шагает нога Sony");
    }
    public int getPrice(){
        return price;
    }
}
