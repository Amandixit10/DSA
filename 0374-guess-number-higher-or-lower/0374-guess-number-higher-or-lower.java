/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
       int hi=n;
        int lo=-1;
        while(hi-lo>1)
        {
            int mid=lo+(hi-lo)/2;
            int val=guess(mid);
            if(val==0)
            {
                return mid;
            }
            if(val<0)
            {
                hi=mid;
            }
            else{
                lo=mid;
            }
        }
        return hi;
    }
}