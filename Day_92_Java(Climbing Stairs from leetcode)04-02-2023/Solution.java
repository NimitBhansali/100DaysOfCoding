class Solution {
    public int climbStairs(int n) {
        int already[]=new int[n+1];   //for storing the steps for already used or implemented steps
        int ways=recur(n,already);
        return ways;
    }
    private static int recur(int n,int already[]){
        if(n<=1) 
            return 1;
        if(already[n]>0)
            return already[n];
        int op1=recur(n-1,already);
        int op2=recur(n-2,already);
        already[n]=op1+op2;
        return op1+op2;
    }
    
}
