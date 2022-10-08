public class HarfBulma extends ArraysDemo{
    public static void main(String[] args) {
        String harf="a";
        String [] inceSesli={"e","i","ü","ö"};
        String [] kalinSesli={"a","ı","u","o"};
        boolean büyük=false;

        for (String gezi:inceSesli) {
                 harf= harf.toLowerCase();
                 if(harf==gezi){
                     yaz("inceSesli");
                     büyük=true;break;}

        }  if(büyük==false)yaz("kalın seslidir");

        /*for (String gezi2:kalinSesli) {
            harf=  harf.toLowerCase(); int sayac = 0;
            sayac=1+sayac;
            //yaz(sayac+"<sayac");
           // yaz(harf+"<harf");
           // yaz(gezi2+"<gezi2");

            if(harf==gezi2){yaz("kalın seslidir"); break;}

        }

         //Hocanın kodu
        char harf2='ı';
        switch (harf2){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                yaz("kalın sesli harf");
            default:
                yaz("İnce sesli harf");
        }*/





    }
}
