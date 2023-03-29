public class homework15 {
    public static void main(String[] args) {
Integer[] a = {1, 2,3,6,7,15};
        System.out.println(homework15.getmin(a));

    }

    public static <T extends Number> T getmin(T[] e){
        T min=null;
        int index = 0;
        for(int i=0;i<e.length;i++){

            if(index==0){

                min=e[0];
            }
            else{
                if(e[i].doubleValue()<min.doubleValue()){
                    min = e[i];
                }

            }
            index++;
        }

        return min;



    }

}
