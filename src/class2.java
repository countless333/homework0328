 enum defaultmonth {
    JAN(1), FEB(2), MAR(3), APR(4), MAY(5),
    JUN(6), JUL(7), AUG(8), SEP(9), OCT(10),
    NOV(11), DEC(12);

    private int monthVal;

    defaultmonth(int monthVal) {
        this.monthVal = monthVal;
    }

    public int getMonthVal() {
        return monthVal;
    }

    public static void printMonth(int month) {
        defaultmonth[] monthArr = values();
        for(int i = 0; i < monthArr.length; i++) {
            if(monthArr[i].getMonthVal() == month) {
                System.out.println("입력한 달은 " +
                        monthArr[i].getMonthVal()
                        + "월 입니다.");
            }
        }
    }

    public void printAddMonth(int month) {
        if(this.getMonthVal() + month <= 12) {
            System.out.println(month + "개월 뒤는 "
                    + (this.getMonthVal() + month)
                    + "월입니다.");
        } else {
            int remain = this.getMonthVal() + month - 12;

            while(remain > 12) {
                remain -= 12;
            }

            System.out.println(month + "개월 뒤는 "
                    + (JAN.monthVal + remain - 1)
                    + "월입니다.");
        }
    }
}








public class class2 {
    public static void main(String[] args) {
//enum객체를 만들 때 생성자가 자동으로 호출
        //호출한 상수값이 생성자의 매개변수로 들어가서 선언되어있는 변수에 대입된다.





        defaultmonth mar = defaultmonth.MAR;
        System.out.println(mar.getMonthVal());

        defaultmonth jan = defaultmonth.JAN;
        defaultmonth feb = defaultmonth.valueOf("FEB");
        defaultmonth apr = Enum.valueOf(defaultmonth.class,"APR");


        System.out.println("jan L " + jan);
        System.out.println("jan L " + feb);
        System.out.println("jan L " + apr);

        defaultmonth[] vmarr = defaultmonth.values();
        for(defaultmonth v : vmarr){

            System.out.println(v.name() + "은" + v.ordinal() + "인덱스에 있습니다.");
        }

        mar.printAddMonth(13);

    }
}
