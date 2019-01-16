
class Solution {
	
    public int solution(int[] A) {
        int headCounter = 0;
        int tailCounter = 0;
        int coinChange;
        int min;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                headCounter++;
            } else {
                tailCounter++;
            }
        }

        if (headCounter < tailCounter) {
            min = headCounter;
            coinChange = 0;
        } else {
            min = tailCounter;
            coinChange = 1;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] == coinChange) {
                if (coinChange == 1) {
                    A[i] = 0;
                } else {
                    A[i] = 1;
                }
            }
        }

        return min;
    }
}
