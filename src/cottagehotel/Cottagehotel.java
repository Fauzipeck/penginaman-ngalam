/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cottagehotel;

import java.util.Scanner;

/**
 *
 * @author moklet
 */
public class Cottagehotel {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String kamar,hari;
        System.out.println("Masukan kamar yang anda pesan: ");
        kamar = input.next();
        System.out.println("Masukan hari: ");
        hari = input.next();
        System.out.println("Masukan jumlah orang yang menginap: ");
        int orang = input.nextInt();
       int harga = 0; 
        
    
       if (kamar.equals("duku")){
        if (hari.equals("weekday")){
        harga = 915000;}
        else if (hari.equals("weekend")) {
        harga = 1025000;}
        else if (hari.equals("holiday")) {
        harga = 1225000;}
        if (orang<=2) {
            
        }        
        else {System.out.println("Masukan input yang sesuai");}
      }
       
       if (kamar.equals("jeruk")){
         if (hari.equals("weekday")){
         harga = 915000;}
         else if (hari.equals("weekend")) {
         harga = 1025000;}
         else if (hari.equals("holiday")) {
         harga = 1025000;}
        if (orang<=2) {
        }
        else {System.out.println("Masukan input yang sesuai");}
       }
       
       
        if (kamar.equals("alpukat")){
          if (hari.equals("weekday")){
          harga = 575000;}
          else if (hari.equals("weekend")) {
          harga = 695000;}
          else if (hari.equals("holiday")) {
          harga = 895000;}
         if (orang<=1) {
             
          }  
         else {System.out.println("Masukan input yang sesuai");}
         }

         if (kamar.equals("jambu air")){
           if (hari.equals("weekday")){
           harga = 575000;}
           else if (hari.equals("weekend")) {
           harga = 695000;}
           else if (hari.equals("holiday")) {
           harga = 895000;}
          if (orang<=1) {
              
           }
          else {System.out.println("Masukan input yang sesuai");}
          }

          if  (kamar.equals("durian")){
             if (hari.equals("weekday")){
             harga = 595000;}
             else if (hari.equals("weekend")) {
             harga = 715000;}
             else if (hari.equals("holiday")) {
             harga = 915000;}
            if (orang<=2) {
                
             }
            else {System.out.println("Masukan input yang sesuai ");}
            
            }
             if (kamar.equals("melon")){
              if  (hari.equals("weekday")){
              harga = 595000;}
              else if (hari.equals("weekend")) {
              harga = 715000;}
              else if (hari.equals("holiday")) {
              harga = 915000;}
             if (orang<=2) {
                 
              }
             else {System.out.println("Masukan input yang sesua");
              }}
           
             if (kamar.equals("belimbing")){
               if (hari.equals("weekday")){
               harga = 495000;}
               else if (hari.equals("weekend")) {
               harga = 575000;}
               else if (hari.equals("holiday")) {
               harga = 755000;}
              if (orang<=2)  {
               }
              else {System.out.println("Maukan input yang sesuai");
               }}
             
               if (kamar.equals("mangga")){
                if (hari.equals("weekday")){
                harga = 495000;}
                else if (hari.equals("weekend")) {
                harga = 575000;}
                else if (hari.equals("holiday")) {
                harga = 755000;}
               if (orang<=2) {
                    }
               else {System.out.println("Masukan input yang sesuai");
                }}
               
                      if (kamar.equals("kedondong")){
                 if (hari.equals("weekday")){
                 harga = 495000;}
                 else if (hari.equals("weekday")) {
                 harga = 575000;}
                 else if (hari.equals("weekend")) {
                 harga = 755000;}
                if (orang<=2) {
                     }
                else {System.out.println("Masukan input yang sesuai");
                 }}
                      
                            if (kamar.equals("barrack")){
                 if (hari.equals("weekday")){
                 harga = 250000;}
                 else if (hari.equals("weekend")) {
                 harga = 25000;}
                 else if (hari.equals("holiday")) {
                 harga = 35000;}
                if (orang<=1) {
                     }
                else {System.out.println("Masukan input yang sesuai");
                 }}
                    System.out.println("harga="+harga);
               }
               
                    }




