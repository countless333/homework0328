import java.util.Calendar;

enum calculator{
    plus("+"){
        public int calculate(int a, int b){
            return a+b;
        }

    },    minus("-"){
        public int calculate(int a, int b){
            return a-b;
        }

    },    multiply("*"){
        public int calculate(int a, int b){
            return a*b;
        }

    },    divide("/"){
        public int calculate(int a, int b){

            if(b==0)
                throw new ArithmeticException("분모는 0이될수 없다.");

            return a*b;
        }

    };

private String operator;
calculator(String op){
    this.operator = operator;

}

    public String getOperator() {
        return operator;
    }

    public abstract int calculate(int a, int b);

}

public class class8 {

    public static void main(String[] args) {


        calculator add = calculator.plus;
        int result = add.calculate(10,5);
        System.out.println(result);
calculator[] carr = calculator.values();
for(calculator c : carr){
    System.out.println(c.getClass());
    System.out.println(c.calculate(10,4));
}

    }










}
