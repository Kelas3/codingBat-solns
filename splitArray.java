public boolean splitArray(int[] nums) 
{
  return sideCheck(nums, 0, 0); 
}
public boolean sideCheck(int[] nums, int i, int bal)
{
	if(i == nums.length)
	{
		return (bal == 0);
	}
	if(sideCheck(nums, i + 1, bal + nums[i]))
	{
		return true;
	}
	return sideCheck(nums, i + 1, bal - nums[i]);
}
