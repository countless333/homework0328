enum coin {
    nikel("nikel", 6), gold("gold", 55), fake("fake", 1);

    private String name;
    private int price;

    coin(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public static coin getprint(int price) {

        System.out.println(values());
        for (coin coin : values()) {
            if (coin.getPrice() == price) {

                return coin;
            }
        }
        throw new IllegalArgumentException("이런쉬바 안댐");
    }
}


public class class5 {


}
