enum season{
    spring("봄"){
        public void printseasonmonths(){
            System.out.println(getKoreaseason()+"은 3~5월임");
        }


    }, summer("여름"){
        public void printseasonmonths(){
            System.out.println(getKoreaseason()+"은 6~8월임");
        }


    } ,fall("가을"){
        public void printseasonmonths(){
            System.out.println(getKoreaseason()+"은 9~11월임");
        }


    },winter("겨울"){
        public void printseasonmonths(){
            System.out.println(getKoreaseason()+"봄은 11~2월임");
        }


    };

    private String koreaseason;

    season(String koreaseason){
        this.koreaseason = koreaseason;
    }

    public String getKoreaseason() {
        return koreaseason;
    }

    public abstract void printseasonmonths();
}

public class class9 {

    public static void main(String[] args) {


        season sp = season.spring;
        sp.printseasonmonths();
    }
}
