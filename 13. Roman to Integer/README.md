# 13. Roman to Integer

- **Difficulty:** Easy
- **LeetCode:** https://leetcode.com/problems/roman-to-integer/

## Description

Convert a valid Roman numeral string to its integer value. When a smaller numeral appears before a larger one, subtract the smaller value; otherwise, add the current value.

## Examples

**Example 1**
```text
Input: s = "III"
Output: 3
```

**Example 2**
```text
Input: s = "LVIII"
Output: 58
```

**Example 3**
```text
Input: s = "MCMXCIV"
Output: 1994
```

## Constraints

- `1 <= s.length <= 15`
- `s` contains only `I`, `V`, `X`, `L`, `C`, `D`, and `M`.
- `s` is a valid Roman numeral in the range `[1, 3999]`.
