package leetcode.ArrayQA;

import java.util.Scanner;
/* 1672. A customer's wealth is the amount of money they have in all their bank accounts.
The richest customer is the customer that has the maximum wealth.
Example:
Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation:
1st customer has wealth = 6
2nd customer has wealth = 10
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.*/

public class RichestCustomer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of customers");
        int Number_cust = sc.nextInt();
        System.out.println("Enter no. of banks or accounts");
        int Number_bank_acc_cust = sc.nextInt();

        System.out.println("Enter CUSTOMERS Details : ");
        int[][] Customers = new int[Number_cust][Number_bank_acc_cust];
        //input
        //Number_cust
        for (int cust_id = 0; cust_id < Number_cust; cust_id++) {
            //columns
            for (int bank_id = 0; bank_id < Number_bank_acc_cust; bank_id++) {
                Customers[cust_id][bank_id] = sc.nextInt();
            }
        }
        // summing row elements
        int max_wealth = 0;
        for (int cust_id = 0; cust_id < Number_cust; cust_id++) {
            //columns
            int cust_wealth = 0;
            for (int bank_id = 0; bank_id < Number_bank_acc_cust; bank_id++) {
                cust_wealth += Customers[cust_id][bank_id];
            }
            if (cust_wealth > max_wealth) {
                max_wealth = cust_wealth;
            }
        }
        System.out.println("Max wealth among customers is: " + max_wealth);
    }
}
/*Leetcode solution
* class Solution {
    public int maximumWealth(int[][] accounts) {

        int max_wealth=0;

        for (int cust_id = 0; cust_id < accounts.length; cust_id++) {
            //columns
            int cust_wealth = 0;
            for (int bank_id = 0; bank_id < accounts[0].length; bank_id++) {
                cust_wealth += accounts[cust_id][bank_id];
            }
            max_wealth = Math.max(max_wealth, cust_wealth);
        }

        return max_wealth;
    }
}
* */