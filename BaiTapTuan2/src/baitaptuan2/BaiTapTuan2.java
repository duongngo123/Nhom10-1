/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitaptuan2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class BaiTapTuan2 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n;
        do {
            System.out.println("\n\n\n---------Menu--------");
            System.out.println("1: Bai 1 ");
            System.out.println("2: Bai 2 ");
            System.out.println("3: Bai 3 ");
            System.out.println("4: Bai 4 ");
            System.out.println("-------------------");
            System.out.println("Nhap vao lua chon: ");
            n = sc.nextInt();
            sc.nextLine();
            
            switch(n){
                case 1: {
                    bai1();
                    break;
                }
                case 2: {
                    bai2();
                    break;
                }
                case 3: {
                    bai3();
                    break;
                }
                case 4: {
                    bai4();
                    break;
                }
                default: {
                    System.out.println("Key nhap khong dung");
                }
            }
        }while(n != 0);
    }
    
    public static void bai1(){
        String ten;
        System.out.println("Nhap vao ten cua ban: ");
        ten = sc.nextLine();
        System.out.println("Hello: " + ten);
    }
    
    public static void bai2(){
        String ten;
        int tuoi;
        float ccao;
        boolean CoThichLT;
        System.out.println("Nhap vao ten:");
        ten = sc.nextLine();
        System.out.println("Nhap so tuoi cua ban : ");
        tuoi=sc.nextInt();
        System.out.println("Nhap chieu cao cua ban : ");
        ccao=sc.nextFloat();
        System.out.println("Ban co thich lap trinh khong? ");
        CoThichLT=sc.nextBoolean();
        System.out.println("Ban ten la: "+ ten + " Tuoi : " + tuoi + " cao : "+ ccao +" ban co thich lap trinh khong " + CoThichLT);
    }
    public static void bai3() {
        int a , b,tg,hieu,tich;
        double thuong, pdu;
        System.out.println("Nhap vao 2 so can tinh: ");
        a=sc.nextInt();
        b=sc.nextInt();
        tg=a+b;
        hieu=a-b;
        thuong= a/(b*1.0);
        pdu=a%b;
        tich=a*b;
        System.out.println("Tong 2 so : "+tg);
        System.out.println("Hieu 2 so : "+hieu);
        System.out.println("Thuong 2 so : "+ thuong);
        System.out.println("Tich 2 so : "+ tich);
        System.out.println("phan du 2 so : "+pdu);
        
    }
    
    public static void bai4(){
        int thang;
        double tien, lai;
        System.out.println("Nhap vao so tien: ");
        tien = sc.nextDouble();
        System.out.println("Nhap vao so lai: ");
        lai = sc.nextDouble();
        System.out.println("Nhap vao so thang: ");
        thang = sc.nextInt();
        
        
        System.out.println("Tien lai la: " + (thang * lai/100.0 * tien));
        System.out.println("Tien goc nhan la: " + (tien + (thang * lai/100.0 * tien)));
        
    }
    
    
}