/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int x1=sc.nextInt();
		    int y1=sc.nextInt();
		    int D=sc.nextInt();
		  //  int food = (x+y);
		  //  int supply = (x1+y1);
		    if(x>=D*x1 && y>=D*y1){
		        System.out.println("Yes");
		    }else{
		        System.out.println("no");
		    }
		}
	}
}
