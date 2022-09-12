package com.bilgeadam.course04.HomeWork01;

import java.util.Scanner;

public class MatrisTranspoze {
static	Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
		
		MatrisTranspoze.method1();{
			}
		}
		
		
		
public static void method1() {

	

int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		
		
		int [][] d=new int[3] [3];
		for (int i=0;i<3 ;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j] +" ");
			}System.out.println();
			
		}
		System.out.println("++++++++");
		for(int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				d[i][j]=a[j][i];
				System.out.print(d[i][j]  +" ");
			}
			System.out.println(); }



		
		
		
		
} 

}

		
		
		
		
		
		
		
		
	

