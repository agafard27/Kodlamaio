public class MukemmelSayi extends ArraysDemo {
    public static void main(String[] args) {
        //6-->1,2,3
        //28-->1,2,4,7,14
        int number=5;
        int toplam=0;
        for (int i = 1; i <number ; i++) {
           if(number%i==0){
               toplam=toplam+i;
           }

        } if(toplam!=number){
            yaz(number +"-->mükemmel sayı değildir");
          }
        else {
            yaz(number+"--> mükemmel bir sayıdır");
        }
    }
}
