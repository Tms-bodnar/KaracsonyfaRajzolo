/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karacsonyfarajzolo;

import java.util.Scanner;

/**
 *
 * @author bodnart
 */
public class KaracsonyfaRajzolo {
    /**
     * A karácsonyfarajzoló függvény a megadott paraméterek alapján egy
     * milyen meglepő, karácsonyfát rajzol ki
     * @param alap a fa legalsó szélessége
     * @param magas hány háromszögből áll a fa.
     */
    public static void karacsonyfaRajzolo(int alap, int magas){
        int x = 1;
        int y = alap;
        int z = 0;
        do{
            for( int i = y; i > 0; i--){
                System.out.print(" ");
            }y--;
            for(int j = 0; j < z; j++){
                System.out.print(" *");
            }z++;
            System.out.println(" *");
            x++;
        }while (x <= magas);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Milyen széles legyen a fa alapja?");
        int alap = sc.nextInt();
        System.out.println("Milyen magas legyen a fa?");
        int magas = sc.nextInt();
        int meret = alap - (2* (magas - 1));
        while(meret <= alap){
        karacsonyfaRajzolo(alap, meret);
        meret = meret +2;
        }
        
    }
    
}
