public class ReCapDemo2_Dizilerle_Calismak extends ArraysDemo {


    public static void main(String[] args) {
        double[] myList={1.2,6.3,4.3,5.6};
       double total=0;
       double max=myList[0];
        for(double number:myList){
            if(max<number) {
                max=number;
            }
            total=total+number;
            yaz(number);
        }
           yaz("Toplam="+total);
        yaz("En Büyük="+max);
    }
}
