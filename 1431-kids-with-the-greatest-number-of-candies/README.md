# 1431. Kids With the Greatest Number of Candies

- **Difficulty:** Easy
- **LeetCode:** https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

## Description

For each child, determine whether giving them all `extraCandies` would make their candy count at least as large as the greatest current count. Return one Boolean answer per child.

## Examples

**Example 1**
```text
Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]
```

**Example 2**
```text
Input: candies = [4,2,1,1,2], extraCandies = 1
Output: [true,false,false,false,false]
```

**Example 3**
```text
Input: candies = [12,1,12], extraCandies = 10
Output: [true,false,true]
```

## Constraints

- `2 <= candies.length <= 100`
- `1 <= candies[i] <= 100`
- `1 <= extraCandies <= 50`
