package com.BasicCoding;

public class TriangleMultiplied {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int mul = i;
            for (int j = 0; j < n + 1 - i; j++) {
                System.out.print(mul + " ");
                mul *= i;
            }
            System.out.println(" ");
        }
    }
}
//Int, primary key , foreign key , unique, not null, check, distinct, group by
// category - id ,names
// product - id , names, prize , cat_id
/*
 * select c.name, sum(p.prize) as total
 * from  product p
 * Join category c ON C.ID = P.ID
 *  group by c.name ;
 * */
//