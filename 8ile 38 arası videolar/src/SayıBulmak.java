public class SayıBulmak extends ArraysDemo{
    public static void main(String[] args) {
        int[] sayilar=new int[]{1,2,5,7,9,0};
        int aranan=788;
        int say=0;
        boolean sayı=true;
        for (int gezi:sayilar) {
            say=say+1;

            if(aranan==gezi){
                yaz("dizide bulunmaktadır sırası :"+say);
                sayı=false;
                break;
            }

        } if(sayı==true){
            yaz("dizide bulunmamakta");
        }

    }
}
