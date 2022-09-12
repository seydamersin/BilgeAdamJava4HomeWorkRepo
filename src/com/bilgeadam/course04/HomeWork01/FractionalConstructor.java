package com.bilgeadam.course04.HomeWork01;

import java.util.Scanner;

public class FractionalConstructor {
	
	// clean koddan çok uzak bir örnek
	
	private static final double[] array = null;
	Scanner scanner = new Scanner(System.in);
	double first = scanner.nextDouble();
	double second = scanner.nextDouble();
	
	public FractionalConstructor() {
		
	}

	public FractionalConstructor(double first, double second) {
		super();
		this.first = first;
		this.second = second;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter an operator(+,-,*,/) : ");
			
			char operator = scanner.next().charAt(0);
			double result = 0;
			
			switch(operator) {
			case '+' :
				result = first+second;
				break;
			case '-':
				result = first-second;
				break;
			case '*' :
				result = first * second;
				break;
			case '/' :
				result= first/second;
				break;
			default:
				System.out.println("Error! operator is not correct");
				return;
			}System.out.println(result);
		}
		

		
	}
	public static void Process() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" kac sayi hesaplayacaksin?:" );
		int number=scanner.nextInt(); 
		scanner.close();
				
		        
		 
		        
		        for (double sayi:array) {
		            System.out.print(sayi+" ");
		System.out.print("Enter an operator(+,-,*,/) : ");

					
					char operator = scanner.next().charAt(0);
					double result =0;
					 
					  for( double num : array)
					
					switch (operator) {
					
					
					case'+':
					   {
				         result = result+num;
				         System.out.println(+result );
				      }break ;
				      
					case '-':{
						result=result-num;
						 System.out.println("Dizi elemanları eksi : " +result );
						 }
					break;
					case '*':{
						result=result*num;
						System.out.println("dizi elemanları :"  +result);
					
					} 
					break;
					case'/':
					{result =result/num;
					System.out.println(result);}
					} break;
				     
				
			
			
				  }}
		

	
	
	
	}
