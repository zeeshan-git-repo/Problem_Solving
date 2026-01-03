package com.zeeshan.search.bs;

/**
 *
 * @author ZAhmad
 */
public class FindSquareRoot {
    public static void main(String[] args) {
        int number = 3;
        FindSquareRoot obj = new FindSquareRoot();
        System.out.printf("Square root of %d is : %d" , number, obj.sqrt(number));
    }
    
    private int sqrt(int number){
        int start = 0, end = number;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            int value = mid * mid; // use long if value exceeds int value
            if(value==number){
                return mid;                
            }else if(value <number){
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
    
}
