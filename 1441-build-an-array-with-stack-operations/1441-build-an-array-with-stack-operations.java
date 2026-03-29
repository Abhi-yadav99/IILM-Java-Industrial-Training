import java.util.*;
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int i = 0;
        for (int num = 1; num <= n; num++) {
            if (i >= target.length) break;
            result.add("Push");
            if (target[i] == num) {
                i++;
            } else {
                result.add("Pop");
            }
        }
        return result;
    }
}