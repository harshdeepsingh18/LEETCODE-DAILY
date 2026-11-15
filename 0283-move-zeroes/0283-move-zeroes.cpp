class Solution {
public:
    void moveZeroes(vector<int>& nums) {
     vector<int> arr(nums.size());
     int j=0;
      
      for(int i=0;i<nums.size();i++){
        if(nums[i]!=0){
            arr[j]=nums[i];
            j++;
        }
      }
      for(int i=0;i<arr.size();i++){
        nums[i]=arr[i];
      }
    }
};