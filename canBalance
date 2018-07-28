public boolean canBalance(int[] nums) 
{
 
  for(int i = 0; i < nums.length; i++) 
  {
    int x = 0;
    int y = 0;
     
    for(int k = 0; k < nums.length; k++) 
    {
      if(k > i) {
        y += nums[k];
      }
      else 
      {
        x += nums[k];
      }
    }
    if(x == y) 
    {
      return true;
    }
  }
   
  return false;
}
