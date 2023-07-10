package Sequence;

import java.util.Scanner;

public class CollatzeSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        do{
	            System.out.println(n);
	            if(n%2==0){
	                n=n/2;

	            }
	            else{
	                n=((3*n)+1);
	            }
	        }while(n>1);
	        System.out.print(n);
	    }

	}


