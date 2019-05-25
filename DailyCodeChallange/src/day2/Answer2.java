package day2;

//space complexity O(1)

public class Answer2 {

    void productArray(int arr[], int n)  
    { 
        int i, temp = 1; 
          
        /* Allocate memory for the product array */
        int prod[] = new int[n]; 
  
        /* Initialize the product array as 1 */
        for(int j=0;j<n;j++) 
            prod[j]=1; 
  
        /* In this loop, temp variable contains product of 
           elements on left side excluding arr[i] */
        for (i = 0; i < n; i++)  
        { 
            prod[i] = temp; 
            temp *= arr[i]; 
        } 
  
        /* Initialize temp to 1 for product on right side */
        temp = 1; 
  
        /* In this loop, temp variable contains product of 
           elements on right side excluding arr[i] */
        for (i = n - 1; i >= 0; i--)  
        { 
            prod[i] *= temp; 
            temp *= arr[i]; 
        } 
  
        /* print the constructed prod array */
        for (i = 0; i < n; i++) 
            System.out.print(prod[i] + " "); 
  
        return; 
    } 
  
    /* Driver program to test above functions */
    public static void main(String[] args) { 
    	Answer2 a2 = new Answer2(); 
        int arr[] = {1, 2, 3, 4, 5}; 
        int n = arr.length; 
        System.out.println("The product array is : "); 
        a2.productArray(arr, n); 
    } 
}
