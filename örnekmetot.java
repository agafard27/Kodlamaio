public class örnekmetot {


    public static void main(String[] args) {
        //bir fonksiyon yaz-bool döndürsün-sayiBul
        //2 parametre alsın P1:dizi P2:30
        //30 sayısı dizide yoktur
        int[] sayilar = new int[]{1, 2, 5, 7, 9};
        int aranacak = 9;
        boolean varMi=sayiBul(sayilar,9);
        mesajVer(varMi,aranacak);
    }
    public static void mesajVer(boolean varmi,int aranacak){
        String mesaj="";

        if (varmi==true) {
            mesaj = ("sayı mevcut değildir" + aranacak);
            System.out.println(mesaj);
        } else{
            //mesajVer("sayi mevcuttur:"+aranacak);
            System.out.println(mesaj);
        }
    }



    public static boolean sayiBul(int[]sayilar,int aranacak){
        boolean varMi = false;
        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        } return varMi;



    }

}

