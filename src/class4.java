
enum RGB {
    RED("red", 200, 0, 0), BLUE("blue", 0, 0, 255), GREEN("green", 0, 255, 0), WHITE("white", 0,0,0);

    // 상수명 red("red",255,0,0
    private String name;
    private int R;
    private int G;
    private int B;

    public String getName() {
        return name;
    }

    public int getR() {
        return R;
    }

    public int getG() {
        return G;
    }

    public int getB() {
        return B;
    }

    RGB(String name, int R, int G, int B) {
        this.name = name;
        this.R = R;
        this.G = G;
        this.B = B;
    }

    public void printColor() {
        System.out.println("Name: " + name + ", RGB: (" + R + ", " + G + ", " + B + ")");
    }


    public void makewhite() {
        for (RGB color : RGB.values()) {
            color.R = 0;
            color.G = 0;
            color.B = 0;
        }


    }



}
public class class4 {


    public static void main(String[] args) {

        RGB rgb = RGB.RED;
        System.out.println(rgb.getClass());
        System.out.println(rgb.getName());

        rgb.makewhite();
        System.out.println(rgb.getB()+rgb.getG()+rgb.getR());
        System.out.println(rgb.getName());
    }
}