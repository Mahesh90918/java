package com.ifclass;

public class transferstatement {
public static void main(String[] args) {
	for(int i=0;i<=10;i++) {
		if(i==3|i==5|i==10) {
			System.out.println(i);
		}
	}for(int j=0;j<=10;j++) {
		// just identify 
		if(j==0|j==4|j==7|j==10) 
			continue;
			System.out.println(j);
		}
	}
}

