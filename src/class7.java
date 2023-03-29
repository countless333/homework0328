public class class7 {

    public static void main(String[] args) {

        RGB red = RGB.RED;
        RGB green = RGB.valueOf("GREEN");
        RGB blue = Enum.valueOf(RGB.class,"BLUE");

        System.out.println("빨간색은 " + red.getR() + ","+ red.getG() +"," + red.getB() );


    }



}
