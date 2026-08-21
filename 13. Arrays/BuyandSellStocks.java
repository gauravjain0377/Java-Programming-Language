public class BuyandSellStocks {

    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;  
        
        for(int i=0; i<prices.length; i++) {
            if(buyPrice < prices[i]) {    // profit and prices[i] = Selling Price of the Stock
                int profit = prices[i] - buyPrice;   // today's profit
                maxProfit = Math.max(maxProfit, profit);
            }
            else {
                buyPrice = prices[i];
            }
        }
        
        return maxProfit;
        
        
    }

    public static void main(String[] args) {
        int prices[] = {10, 7, 5, 8, 11, 9};
        System.out.println("Maximum Profit is: " + buyAndSellStocks(prices));
    } 
}
