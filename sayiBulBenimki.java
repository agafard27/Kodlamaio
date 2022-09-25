public class sayiBulBenimki {




    public static void main(String[] args) {
        int[] sayilar=new int[]{11,2,3,4,5,11,7,8,11,10};
        int arananDeğer=23;
        boolean sayiVarmi=false;

       for (int i=0;i<sayilar.length;i++)
       {  int sayac=0;
            if(arananDeğer==sayilar[i])
            {
             System.out.println(sayilar[i]); i++;
             System.out.println("sayının dizideki sırası:"+i);
             sayiVarmi=true;  sayac++;
             System.out.println("sayac :"+sayac);
            }
        } if (sayiVarmi==false)System.out.println("sistemde sayı yok");
}
}
