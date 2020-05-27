class StockSpanner {

    Stack<Integer> prices, span;

    public StockSpanner() {
        prices = new Stack<>();
        span = new Stack<>();
    }

    public int next(int price) {
        int count = 1;
        while (!prices.isEmpty() && prices.peek() <= price) {
            prices.pop();
            count += span.pop();
        }

        prices.push(price);
        span.push(count);
        return count;
    }
}
