public class class6 {

    private String name;
    private int age;

    public class6(String name, int age) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }

        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120.");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        class6 obj = new class6("김은석", 1130);
        System.out.println("Name: " + obj.getName() + ", Age: " + obj.getAge());
    }



}
