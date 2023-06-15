class Solution {
    public void moveZeroes(int[] a) {
       
        int i=0,j=0;
        
        // t stores the index of the last element, which will be (number of elements - 1) as array index starts from 0.
        int t=a.length-1;
        while(i<=t)
        {
            if(a[i]!=0)
            {
                //copying only the non-zero elements in the original array itself as need to keep it in-place
                a[j++]=a[i]; 
            }
            i++;
        }
        
        // counting the number of zeroes, which will be equal to the total numbers - the non zero numbers.
        j=t-j+1;
        

        //filling the remaining array with the zeros starting from end.
        while(j!=0)
        {
            a[t--]=0;
            j--;
        }
    }     
}