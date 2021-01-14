package by.tms;


public class Run {
    public static void main(String[] args) {
        SonyHead sonyHead = new SonyHead(120);
        SonyHand sonyHand = new SonyHand(85);
        SonyLeg sonyLeg = new SonyLeg(90);
        ToshibaHead toshibaHead = new ToshibaHead(110);
        ToshibaHand toshibaHand = new ToshibaHand(75);
        ToshibaLeg toshibaLeg = new ToshibaLeg(70);
        SamsungHead samsungHead = new SamsungHead(135);
        SamsungHand samsungHand = new SamsungHand(110);
        SamsungLeg samsungLeg = new SamsungLeg(100);
        Robot example1 = new Robot(samsungHead, toshibaHand, sonyLeg);
        System.out.println("Робот #1: ");
        example1.action();
        System.out.println("Цена комплектующих этого робота: " + example1.getPrice());
        System.out.println("-------------------------");
        Robot example2 = new Robot(toshibaHead, sonyHand, toshibaLeg);
        System.out.println("Робот #2: ");
        example2.action();
        System.out.println("Цена комплектующих этого робота: " + example2.getPrice());
        System.out.println("-------------------------");
        Robot example3 = new Robot(sonyHead, samsungHand, samsungLeg);
        System.out.println("Робот #3: ");
        example3.action();
        System.out.println("Цена комплектующих этого робота: " + example3.getPrice());
        System.out.println("-------------------------");

        int [] prices = new int [3];
        prices[0] = example1.getPrice();
        prices[1] = example2.getPrice();
        prices[2] = example3.getPrice();

        int maxPrice=prices[0];
        for(int i=0; i<prices.length; i++){
            if(maxPrice<prices[i]) {
                maxPrice = prices[i];
            }
        }
        System.out.println("Цена самого дорого робота = " + maxPrice);
    }
}
