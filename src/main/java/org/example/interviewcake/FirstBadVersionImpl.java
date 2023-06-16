package org.example.interviewcake;

public class FirstBadVersionImpl
{

    public int firstBadVersion(int n)
    {
        int lowerBound = 0;
        int upperBound = n;

        while(lowerBound <= upperBound) {
            int mid = upperBound - (upperBound - lowerBound)/2;
            if(isBadVersion(mid) == true && isBadVersion(mid - 1) == false) {
                return mid;
            } else if(isBadVersion(mid) == false) {
                lowerBound = mid + 1;
            } else {
                upperBound = mid;
            }
        }
        return -1;
    }

    boolean isBadVersion(int version)
    {
        return true;
    }
}
