import java.util.*;

class Solution {
    public static void main(String[] args) {
        int[] arr = {1,2};
        int limit = 3;
        System.out.println(numRescueBoats(arr, limit));
    }
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        int ans = 0;

        while (i <= j) {
            ans++;
            if (people[i] + people[j] <= limit)
                i++;
            j--;
        }

        return ans;
    }
}
