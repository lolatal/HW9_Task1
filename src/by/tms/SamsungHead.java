package by.tms;

public class SamsungHead implements IHead{
    private int price;
    public SamsungHead(int price){
        this.price=price;
    }
    public SamsungHead(){}
    public void speak(){
        System.out.println("Говорит голова Samsung");
    }
    public int getPrice(){
        return price;
    }
}
