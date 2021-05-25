/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spotifay;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author COMPU_MART
 */
public class Spotifay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       pop Ariana_grande=new pop(12,2012,"7rings","not only you");
       pop Justin_Bieber=new pop(14,2009,"peaches","lonely");
       pop The_weekend=new pop(13,2021,"save your tears","souls");
       pop Bruno_mars=new pop(9,2007,"leave the door open","love to be hated");
      
       kpop BTS=new  kpop(10,2021,"butter","BE","ARMY");
       kpop BLACK_PINK=new kpop(3,2020,"how you like that","The ALBUM","Blinks");
       kpop ENYBHEN=new kpop(1,2021,"love_dazed","fever","ENGINE");
       kpop Twice=new kpop(9,2016,"more&more","do me a favor","ones");
           
       Bruno_mars.setBBMAs_awards_num(4);
       BTS.setBBMAs_awards_num(7);
        System.out.println(Bruno_mars.getBBMAs_awards_num());
        Date d=new Date();
        System.out.println(d);
        
        System.out.println("                     welcome on spotifay analyst                                       ");
        System.out.println("                    two of its categories :pop , kpop                              ");
        System.out.println(" choose your style :      ");
        System.out.println(" press 1 for pop ");
        System.out.println("press 2 for kpop");
        
        int category=input.nextInt();
        switch(category){
            case 1:System.out.println("choose AG ,JB, TW or BM for "+"  "+"Ariana grande/ Justin Bieber/ The weekend / Bruno mars");
            break;
            case 2:System.out.println("choose BT, BP , EN or TC for "+"  "+"BTS/ BLACk pink/ ENYBHEN/ TWICE");
            break;
               
        }
        String idol=input.next();
        switch(idol){
            case "AG":System.out.println("Ariana grande :\n"+ Ariana_grande.num_of_albums +"\n"+Ariana_grande.most_listened_year+"\n"+Ariana_grande.last_song+"\n"+Ariana_grande.last_album);
            break;
              case "JB":System.out.println(" Justin Bieber:\n"+Justin_Bieber.num_of_albums+"\n"+Justin_Bieber.most_listened_year+"\n"+Justin_Bieber.last_song+"\n"+Justin_Bieber.last_album);
            break;
             case "TW":System.out.println(" The weekend:\n"+The_weekend.num_of_albums+"\n"+The_weekend.most_listened_year+"\n"+The_weekend.last_song+"\n"+The_weekend.last_album);
            break;
             case "BM":System.out.println("Bruno mars :\n"+Bruno_mars.num_of_albums+"\n"+Bruno_mars.most_listened_year+"\n"+Bruno_mars.last_song+"\n"+Bruno_mars.last_album+"\n"+Bruno_mars.getBBMAs_awards_num());
            break;
             case "BT":System.out.println("BTS :\n"+BTS.num_of_albums+"\n"+BTS.most_listened_year+"\n"+BTS.last_song+"\n"+BTS.last_album+"\n"+BTS.getBBMAs_awards_num());
            break;
             case "BP":System.out.println("BLACk pink :\n"+BLACK_PINK.num_of_albums+"\n"+BLACK_PINK.most_listened_year+"\n"+BLACK_PINK.last_song+"\n"+BLACK_PINK.last_album);
            break;
             case "EN":System.out.println("ENYBHEN :\n"+ENYBHEN.num_of_albums+"\n"+ENYBHEN.most_listened_year+"\n"+ENYBHEN.last_song+"\n"+ENYBHEN.last_album);
            break;
             case "TC":System.out.println("TWICE :\n"+Twice.num_of_albums+"\n"+Twice.most_listened_year+"\n"+Twice.last_song+"\n"+Twice.last_album);
            break;
           
               
        }
     
    }
    
}