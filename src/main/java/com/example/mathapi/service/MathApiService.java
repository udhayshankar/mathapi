package com.example.mathapi.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MathApiService {

    public Integer findMinimum(Integer[] arr){
        Integer small = Integer.MAX_VALUE;
        for(Integer val : arr){
            if(small > val){
                small = val;
            }
        }
        return small;
    }

    public Integer findMaximum(Integer[] arr){
        Integer big = Integer.MIN_VALUE;
        for(Integer val : arr){
            if(big < val){
                big = val;
            }
        }
        return big;
    }

    public Double findAverage(Integer[] arr){
        Double sum = Double.valueOf(0);
        for(Integer val : arr){
            sum += val;
        }
        return  (Double) sum/arr.length;
    }

    public String findMedian(Integer[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        if(n%2 == 0){
            int firstElement = arr[n/2];
            int secondElement = arr[n/2 -1];
            Double val = Double.valueOf((double)(firstElement+secondElement)/2);
            return val.toString();
        } else{
            return arr[n/2].toString();
        }
    }
    public Double findPercentile(Integer[] arr, Integer quantifier){
        Arrays.sort(arr);
        int n = arr.length;
        int count = 0;
        for(int val : arr){
            if(val < quantifier){
                count++;
            }
        }
        return ((double)count/n)*100;
    }

}
