public int[] fix34(int[] nums) 
{
  int[] result = nums;
  for(int i = 0; i < result.length; i++) 
  {
      if(result[i] == 3 && i != result.length) 
      {
          int index = findIndex(result);
          if(index != -1) {
              int temp = result[i + 1];
              result[i + 1] = result[index];
              result[index] = temp;
          }
      }
  }  
   
  return result;
}
 
public int findIndex(int[] nums) 
{
    for(int i = 0; i < nums.length; i++) 
    {
        if((i == 0 && nums[i] == 4) || (nums[i] == 4 && nums[i - 1] != 3)) 
        {
            return i;
        }
    }
     
    return -1;
}
