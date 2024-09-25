/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baitaptuan3;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class BaiTapTuan3 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n;
        do{
            System.out.println("Nhap bai muon hien thi:");
            System.out.println("4: Bai 1");
            System.out.println("4: Bai 2");
            System.out.println("4: Bai 3");
            System.out.println("4: Bai 4");
            System.out.println("5: Bai 5");
            System.out.println("6: Bai 6");
            n=sc.nextInt();
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
    public static void bai1() {
        System.out.println("Nhap vao mot so: ");
        int so = sc.nextInt();
        if (so>0){
            System.out.println("Day la so duong");
        }
        else if (so<0){
            System.out.println("Day la so am");
        }
        else 
            System.out.println("Day la so 0");
    }
    public static void bai2() {
        double dtb;
        System.out.println("Nhap vao diem trung binh: ");
        dtb = sc.nextDouble();
        if (dtb<10&&dtb>=8.5)
        {
            System.out.println("Loai gioi");
        }
        else if (dtb>=7)
                System.out.println("Loai kha");
        else if (dtb>=5)
            System.out.println("Loai trung binh");
        else if (dtb>=4)
            System.out.println("Loai yeu");
        else if (dtb>=0)
            System.out.println("Loai kem");
        else
            System.out.println("Diem khong hop le.");
    }
    public static void bai3() {
        double a, b, c, denta, x, x1 = 0, x2;
        System.out.println("Nhap vao ba so a b c: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        denta = b*b-4*a*c;
        if (a==0){
            System.out.println("khong phai phuong trinh bac hai");
        }else{
            denta=b*b-4*a*c;
            if(denta>0){
                x1=((-b+Math.sqrt(denta))/(2*a));
                x2=((-b-Math.sqrt(denta))/(2*a));
                System.out.println("phuong trinh nay co 2 nghiem phan biet:"+ "x1 = " + x1 + " và x2 = " + x2);
            }else if(denta==0){
                x=-b/(2*a);
                System.out.println("phuong trinh co nghiem kep:x1=x2"+x1);
            }else{
                System.out.println("phuong trinh vo nghiem");
            }
        }
    }
    public static void bai4(){
        int a, b, c;
        System.out.println("Nhap vao 3 so : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int min=a;
        if(b<min){
            min=b;  
        }
        if(c<min){
            min=c;
        }
        System.out.println("So NN trong 3 so la: " + min);  
    }
    public static void bai5() {
        int a, b, c;
            System.out.println("Nhap canh a: ");
            a=sc.nextInt();
            System.out.println("Nhap canh b:");
            b=sc.nextInt();
            System.out.println("Nhap canh c:");
            c=sc.nextInt();
        if(a+b>c&&a+c>b&&b+c>a){
            if(a==b&&b==c){
                System.out.println("Day la tam giac deu.");
            }else{
                if(a==b || a==c || b==c){
                    System.out.println("Day la tam giac can");
                }else{
                    if(a*a==b*b+c*c||b*b==a*a+c*c||c*c==b*b+a*a){
                        System.out.println("Day la tam giac vuong");
                    }
                    else{
                        System.out.println("Day la tam giac thuong");
                    }
                }
            }
        }
        else{
            System.out.println("Day khong phai la tam giac");
        }
    }
    public static void bai6() {
        int a,b;
        double kq;
        System.out.println("Nhap a: ");
        a=sc.nextInt();
        System.out.println("Nhap b: ");
        b=sc.nextInt();
        char operator = sc.next().charAt(0);
       
        switch (operator) {
            case '+':{
                kq=a+b;
                System.out.println("Ket qua cua phep tinh vua chon là: " + kq);
                break;
            }
            case '-':{
                kq=a-b;
                System.out.println("Ket qua cua phep tinh vua chon là: " + kq);
                break;
            }
            case '*':{
                kq=a*b;
                System.out.println("Ket qua cua phep tinh vua chon là: " + kq);
                break;
            }
            case '/':{
                if(b!=0){
                    kq=1.0*a/b;
                    System.out.println("Ket qua cua phep tinh vua chon là: " + kq);
                }else{
                    System.out.println("Khong the chia het cho 0");
                }
                break;
                
            }
            default:{
                System.out.println("Khong nhap phep tinh khac");
            }               
        }
        
    }
}
