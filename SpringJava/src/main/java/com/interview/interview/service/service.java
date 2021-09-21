package com.interview.interview.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
@Service
public class service {

	public int[] fib(int n)
	{
		ArrayList<Integer> list =new ArrayList<Integer>();
		int n1=0,n2=1,n3,i,count=n;    
		 list.add(0);
		 list.add(1);
		    
		 for(i=2;i<count;++i)   
		 {    
		  n3=n1+n2;    
		  list.add(n3);   
		  n1=n2;    
		  n2=n3;    
		 }  
		int[] arr=new int[list.size()];
		for(int j=0;j<list.size();j++)
		{
			arr[j]=list.get(j);
		}
		return arr;
	}
}
