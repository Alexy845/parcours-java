
import java.util.List;
import java.util.Set;
import java.util.ArrayList;


public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        int[] dp = new int[amount + 1];
        int[] selectedCoins = new int[amount + 1];
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            int minCoins = Integer.MAX_VALUE;
            int selectedCoin = 0;
            for (int coin : coins) {
                if (coin <= i && dp[i - coin] + 1 < minCoins) {
                    minCoins = dp[i - coin] + 1;
                    selectedCoin = coin;
                }
            }
            dp[i] = minCoins;
            selectedCoins[i] = selectedCoin;
        }

        List<Integer> change = new ArrayList<>();
        int remainingAmount = amount;
        while (remainingAmount > 0) {
            change.add(selectedCoins[remainingAmount]);
            remainingAmount -= selectedCoins[remainingAmount];
        }

        return change;
    }
}
