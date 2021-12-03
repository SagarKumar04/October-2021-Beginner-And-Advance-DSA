package LeetCodeQuestion;

/*
Link: https://leetcode.com/problems/find-the-winner-of-the-circular-game/

There are n friends that are playing a game. The friends are sitting in a circle and are numbered from 1 to n in clockwise order. More formally, moving clockwise from the ith friend brings you to the (i+1)th friend for 1 <= i < n, and moving clockwise from the nth friend brings you to the 1st friend.

The rules of the game are as follows:

Start at the 1st friend.
Count the next k friends in the clockwise direction including the friend you started at. The counting wraps around the circle and may count some friends more than once.
The last friend you counted leaves the circle and loses the game.
If there is still more than one friend in the circle, go back to step 2 starting from the friend immediately clockwise of the friend who just lost and repeat.
Else, the last friend in the circle wins the game.
Given the number of friends, n, and an integer k, return the winner of the game.
 */

import java.util.List;

public class FindTheWinnerOfTheCircularGame {
    public int getWinner(int n, int k) {
        if(n == 1) {
            return 0;
        }
        int winner = getWinner(n - 1, k);
        int actualWinner = (winner  + k) % n;

        return actualWinner;

    }

    public int getWinnerUsingList(List<Integer> list, int n, int k) {
        if(list.size() == 1) {
            return list.get(0);
        }

        n = (n + k - 1) % list.size();

        list.remove(n);

        return getWinnerUsingList(list, n, k);
    }

    public int findTheWinner(int n, int k) {
        int winner = getWinner(n, k) + 1;

        return winner;
    }
}
