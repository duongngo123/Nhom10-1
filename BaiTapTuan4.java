/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class BaiTapTuan4 {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        do{
            System.out.println("Nhap bai muon hien thi:");
            System.out.println("1: Bai 1");
            System.out.println("2: Bai 2");
            System.out.println("3: Bai 3");
            System.out.println("4: Bai 4");
            System.out.println("5: Bai 5");
            System.out.println("6: Bai 6");
            n=sc.nextInt();
            switch(n){
                case 1: {
                   bai1();
                break;
                }case 2: {
                   bai2();
                break;
                }case 3: {
                   bai3();
                break;
                }
                case 4: {
                   bai4();
                break;
                }
                case 5:{
                    bai5();
                    break;
                }
                case 6:{
                    bai6();
                    break;
                }
                default: {
                    System.out.println("So khac khong hien thi duoc.");
                }               
            }
        }while(n!=0);
       
    }
    public static void bai1(){
        System.out.print("Nhập số n: ");
        int n = sc.nextInt();
        
        int tong = 0;
        for (int i = 1; i <= n; i++) 
        {
            tong += i;
        }
        
        System.out.println("Tổng các số từ 1 đến " + n + " là: " + tong);
    }
    public static void bai2(){
        for(int i=1;i<=10;i++){
            System.out.println("bang cuu chuong "+i+":");
                for(int j=1;j<=10;j++){
                    System.out.println(i+"x"+j +"="+(i*j)); 
        }
                System.out.println("");
    }
    public static void bai3(){
        System.out.println("Nhap vao mot so nguyen");
        int n=sc.nextInt();
        long giaithua =1;
        //ta su dung vong lap cho de hieu
        for(int i=1;i<=n;i++){
            giaithua*=i;   
    }
        System.out.println("Giai thua "+n+"la:" + giaithua);
    }
    public static void bai4() {
       int n;
        System.out.println("Nhap so: ");
        n=sc.nextInt();
        if(n<2){
            System.out.println("Day khong khong phai so nguyen to");
        }
        else{
            for(int i=2; i<=n;i++){
                if(n%i==0)
                    System.out.println("Day khong phai la so nguyen to");
                else
                    System.out.println("Day la so nguyen to");
                return;
            }
            
        }
    }
    //tim UCLN va BCNN
    public static int UCLN(int a , int b){
            if(b==0) return a;
            return UCLN(b,a%b);
    }
    public static int BCNN(int a, int b) {
        return a*b/UCLN(a,b);
    }
    public static void bai5() {    
            int n,m;
            System.out.println("Nhap 2 so ca");   
            n=sc.nextInt();
            m=sc.nextInt();  
            System.out.println("UCLN la: "+UCLN(n,m));   
            System.out.println("BCNN la: "+BCNN(n,m));
    }
    public static void bai6() {
        System.out.println("Nhap vao mot so nguyen: ");
        int n=sc.nextInt();
        int soTam=n;
        int soDaoNguoc=0;
        while(n!=0){
            int so=n%10;
            soDaoNguoc=soDaoNguoc*10+so;
            n=n/10;
        }
        if(soTam==soDaoNguoc)
            System.out.println(soTam+" la so dao nguoc");
        else System.out.println(soTam+" khong phai so dao nguoc");
    }
}
