package com.cakesoft.solution;

import java.util.Scanner;
import java.util.StringTokenizer;

public class FindFrequency {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a paragraph");
		String s=sc.nextLine();
		
		StringTokenizer stringTokenizer=new StringTokenizer(s," ");
		int size=stringTokenizer.countTokens();
		String s1[]=new String[stringTokenizer.countTokens()];
		int count[]=new int[stringTokenizer.countTokens()];
		int i=0;
		while(stringTokenizer.hasMoreTokens())
		{
			s1[i]=(String) stringTokenizer.nextElement();
			i++;
		}
		
		for(int l=0;l<s1.length;l++)
		{
			int cnt2=0;
			String s2=s1[l];
			for(int k=l+1;k<s1.length;k++)
			{
				if(s2.equals(s1[k]))
				{
					s1[k]="";
					cnt2++;
				}
			}
			count[l]=cnt2;
		}
		int t=0;
		for(int l=0;l<count.length;l++)
		{
			if(t<count[l])
			{
				t=count[l];
			}
		}			
		for(int n=0;n<count.length;n++)	
		{
			if(count[n]==t&&s1[n]!="")
			{
				System.out.println("count="+count[n]+" "+s1[n]);
			}
		}	
	}
}
