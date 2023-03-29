public class homework14 {
    public static void main(String[] args) {
Integer[] b = new Integer[100];
for(int i=0;i<b.length;i++){
    b[i] = i;

}
        homework14.printarr(b);


    }

//질문 위 int로 하고 아래것도 int로 바꿔서 할수는 없는가

    public static <E> void printarr(E[] e){

        for(int i=0;i<e.length;i++){
            if((int)e[i]%3==0){
                System.out.println(e[i]);

            }


        }


    }
}
