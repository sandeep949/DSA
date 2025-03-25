package com.example.DSA.leetcode;

public class DSA {
    public static void main(String[] args) {
        DSA dsa = new DSA();
        //System.out.println(dsa.countPrimes1(10));
        //System.out.println(dsa.countPrimes(10));
        //dsa.longestPalindrome("babad");
        int[] arr = {1,2,3,4,5};
         dsa.reverseNumber(arr);

         for(int nums : arr){
             System.out.print(nums +" ");
         }
    }
    public boolean isPrime(int num) {
        if (num < 2) return false; // Numbers less than 2 are not prime
        for (int i = 2; i * i <= num; i++) { // Loop from 2 to sqrt(num)
            if (num % i == 0) return false; // If divisible by i, it's not prime
        }
        return true; // Otherwise, it's prime
    }

    // Function to count the number of prime numbers less than n
    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) { // Iterate from 2 to n-1
            if (isPrime(i)) count++; // If prime, increment count
        }
        return count;
    }

    public void longestPalindrome(String s) {
        System.out.println(s);
    }


    public int countPrimes1(int n) {
        if (n < 1) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }


        public  void reverseNumber(int[] arr){

        int left = 0;
        int right = arr.length-1;

        while(arr[left] < arr[right]){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

    }
}

