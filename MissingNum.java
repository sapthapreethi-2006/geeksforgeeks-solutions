class Solution {
    int missingNum(int arr[]) {
        
        Arrays.sort(arr);
        // code here
        int j=1;
        for(int i=0;i<arr.length;i++)
        {
            
                if(arr[i]!=j)
                {
                    return j;
                }
                j++;
                
            } 
            return j;
    }
}