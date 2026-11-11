import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = 0;
        for (int count : candies) {
            greatest = Math.max(greatest, count);
        }

        List<Boolean> result = new ArrayList<>(candies.length);
        for (int count : candies) {
            result.add(count + extraCandies >= greatest);
        }
        return result;
    }
}
