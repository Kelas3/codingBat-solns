public int maxSpan(int[] nums) 
{
  int myValuesArray[] = new int[nums.length];
  int numNumbers = 0;
  int maxS = 0, currentS = 0;
  for(int i = 0; i < nums.length; i++)
  {
     currentS = 0;
     currentS = span(nums[i], nums);
     if(currentS > maxS) 
     { 
       maxS = currentS; 
     }
  }
   
  return maxS;
}
 
public int span(int value, int[] nums)
{
   int first = 0, second = 0;
   for(int i = 0; i < nums.length; i++) 
   {
      if(nums[i] == value) 
      {
         first = i;
         break;
      }
   }
    
   for(int k = nums.length - 1; k >= 0; k--) 
   {
      if(nums[k] == value) 
      {
         second = k;
         break;
      }      
   }
    
   if(first == second) 
   { 
     return 1; 
     
   } 
   else 
   { 
     return ((second + 1) - first); 
     
   }
}
