# 1920. Build Array from Permutation

- **Difficulty:** Easy
- **LeetCode:** https://leetcode.com/problems/build-array-from-permutation/

## Description

Given a zero-based permutation `nums`, construct an array `ans` of the same length where `ans[i] = nums[nums[i]]`, then return `ans`.

## Examples

**Example 1**
```text
Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
```

**Example 2**
```text
Input: nums = [5,0,1,2,3,4]
Output: [4,5,0,1,2,3]
```

## Constraints

- `1 <= nums.length <= 1000`
- `0 <= nums[i] < nums.length`
- All values in `nums` are unique.
