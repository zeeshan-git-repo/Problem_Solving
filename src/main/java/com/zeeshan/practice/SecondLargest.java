package com.zeeshan.practice;

/**
 *
 * @author ZAhmad
 */
public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {98,5,6,2,44,7,01,30,98};
        SecondLargest obj = new SecondLargest();
        obj.find2ndLargest(arr);
        //findsecondMax(arr);
    }
    
    private int findMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        return max;
    }

    private void find2ndLargest(int[] arr) {
        int max = findMax(arr);        
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax =  findMax(arr);
        System.out.println(secondMax);      
       
    }
    
    
    private static void findsecondMax(int arr[]){
        int max = Integer.MIN_VALUE;
        int secondMax= Integer.MIN_VALUE;
        for(int num:arr){
            if(num>max){
                secondMax = max;
                max = num;                
            }else if(num > secondMax && num != max){
                secondMax = num;
            }
        }
        if(secondMax == Integer.MIN_VALUE){
            System.out.println("No 2nd max element found!!!");
        }else{
            System.out.println(secondMax + " is second max element");
        }
    }
    
}
