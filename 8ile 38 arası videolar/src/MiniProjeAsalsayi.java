public class MiniProjeAsalsayi extends ArraysDemo {
    public static void main(String[] args) {
        int number=25;
        int remainder=number%2;
        yaz(remainder);
        boolean isPrime=true;
        if (number<2){
            yaz("geccersiz sayı gidriniz" );
        }
        for(int i = 2; i<number ; i++){
            if(number%i==0){
                isPrime=false;
            }

        }
        if (isPrime){
            yaz(number+": sayı asaldır");
        }else {
            yaz("sayı asal değildir");
        } //20 video mini proje asal sayı





      /* if(remainder==1){
           yaz("sayı asaldır");
       }else {yaz("sayı asal değildir");}*/
    }
}
