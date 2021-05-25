/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spotifay;

import java.util.Date;

/**
 *
 * @author COMPU_MART
 */
public class pop {
    
    public pop(){}
    
    
    
    
    
    
    
    
    public pop(int num_of_albums,double most_listened_year,String last_song, String last_album){
    num_of_albums=num_of_albums;
    most_listened_year=most_listened_year;
    last_song=last_song;
    last_album=last_album;
    }
    
    
    
    int num_of_albums;
    double most_listened_year;
    String last_song;
    String last_album;
    private int BBMAs_awards_num;
    public void setBBMAs_awards_num(int BBMAs_awards_num){
    BBMAs_awards_num=BBMAs_awards_num;
    }
    Date d=new Date();
    int year=d.getYear()+1900;
    
    int getnum_of_albums(){
    return num_of_albums;
    }
    
    double getmost_listened_year(){
    return  most_listened_year;
    }
     String getlast_song(){
     return   last_song;
     }
     
     String getlast_album(){
     return  last_album;
     }
     int getBBMAs_awards_num(){
     return BBMAs_awards_num;
     }
    

   

    
}
