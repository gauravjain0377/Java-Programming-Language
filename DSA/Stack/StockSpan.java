/*  

Problem Statement

Suppose the stock prices are:

Day:    0   1   2   3   4   5   6
Price: 100  80  60  70  60  85 100

For each day, find the span.

The span means:

How many consecutive days (including today) have a stock price less than or equal to today's price?

Example

For Day 0:

Price = 100

No previous day.

Span = 1

For Day 1:

80

Previous price:

100 > 80

Stop.

Span = 1

For Day 3:

70

Previous prices:

60 ≤ 70 ✔
80 > 70 ✘

Span:

70
60

Answer = 2

For Day 5:

85

Previous prices:

60 ≤ 85 ✔
70 ≤ 85 ✔
60 ≤ 85 ✔
80 ≤ 85 ✔
100 > 85 ✘

Span = 5

Final answer:

Price : 100 80 60 70 60 85 100
Span  :  1  1  1  2  1  5  7
*/

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {

    public static void stockSpan(int price[], int span[]) {

        Stack<Integer> s = new Stack<>();

        span[0] = 1;
        s.push(0);

        for (int i = 1; i < price.length; i++) {
            while (!s.isEmpty() && price[i] >= price[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - s.peek();
            }

            s.push(i);
        }
    }

   public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of days: ");
    int n = sc.nextInt();

    int[] price = new int[n];
    int[] span = new int[n];

    System.out.println("Enter stock prices:");

    for (int i = 0; i < n; i++) {
        price[i] = sc.nextInt();
    }

    stockSpan(price, span);

    System.out.println("Stock Span:");

    for (int i = 0; i < n; i++) {
        System.out.print(span[i] + " ");
    }

    sc.close();
}
}