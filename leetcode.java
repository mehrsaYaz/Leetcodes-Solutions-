package leetcode;

public class leetcode {

	 public static int[]  merge(int[] nums1, int m, int[] nums2, int n) {
	       int[] results =new int[m+n];
	       int i=0;
	       int j=0;
	       int k=0;
	       while(i<m && j<n) {
	    	   if(nums1[i]<nums2[j]) {
	    		   results[k]=nums1[i];
	    		   i++;
	    		   k++;

	    	   }else {
	    		   results[k]=nums2[j];
	    		   j++;
	    		   k++;
	    	   }
	       }
	       while (i < m) {
	           results[k++] = nums1[i++];
	       }

	      
	       while (j < n) {
	           results[k++] = nums2[j++];
	       }
	   
	       
           return results;
	    }
   
	 public static void main(String[] args) {
		 
		 
		 
		 
		 
		 
	        int[] nums1= {1,2,4,4,5};
	        int[] nums2= {3,4,5};
	        
	      
	       int[] result =new int[200];
	       result=merge(nums1,nums1.length,nums2,nums2.length);
	       for(int i=0;i<result.length;i++) {
	    	   System.out.print(result[i]);
	       }
	        
	        
	    }

	
	
	       
	       
	       

	    
	

}
