package by.tms;

public class SamsungLeg implements ILeg{
    private int price;
    public SamsungLeg(int price){
        this.price=price;
    }
    public SamsungLeg(){}
    public void step(){
        System.out.println("Шагает нога Samsung");
    }
    public int getPrice(){
        return price;
    }
}
