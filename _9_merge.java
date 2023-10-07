package Thecodeworld;

import java.util.Arrays;
import java.util.Scanner;

public class _9_merge {

public static void SortArray(int a[], int b[], int res[], int n, int m) {
		     
		    int i=0, j=0, k=0;
		    while (i < n){
		      res[k] = a[i];
		      i++;
		      k++;
		    }
		     while (j < m) {
		              res[k] = b[j];
		              j++;
		              k++;
		          }
		     Arrays.sort(res);
		      
		    }
		  
		  
static int removeDuplicates(int res[], int a){
		    
		    if(a == 0 || a ==1 ){
		      return a;
		    }
		    
		    int j= 0 ;
		    for(int i= 0; i <a-1; i++ )
		        if(res[i] !=res [i+1])
		        res[j++]= res [i];
		    
		    res[j++] = res [a-1];
		    
		    return j;
		    
		      
		    }
		  
  public static void main(String[] args) {
			  Scanner in=new Scanner(System.in);
				System.out.println("enter the size of the matrix:");
				int size=in.nextInt();
				System.out.println("enter  the matrix A:");
				
				int A[]=new int[size];
				for(int i=0;i<size;i++) {
					
						A[i]=in.nextInt();	
					}
				
				System.out.println("enter the size of the matrix:");
				int size1=in.nextInt();
				System.out.println("enter  the matrix B:");
				int B[]=new int[size1];
				for(int i=0;i<size1;i++) {
						B[i]=in.nextInt();	
					}
				
		    //merge two arrays
		     int res[] = new int[ size + size1];
		     SortArray(A, B,res, size, size1);
		     System.out.println("Sorted merged list");
		     
		     for (int i= 0 ; i < res.length ;i++){
		       System.out.print(  res[i]+" ");
		     }
		     
		     //removing duplicates
		     int h = res.length;
		     h =removeDuplicates(res, h);
		     
		     System.out.println("Printing element after removing duplicates");
		          for (int i=0; i<h; i++){
		             System.out.print (res[i]+" ");
		      }
		  }
		}

