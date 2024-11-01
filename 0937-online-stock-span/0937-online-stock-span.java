class StockSpanner {
    public ArrayList<Integer> stack;

    public StockSpanner() {
        this.stack = new ArrayList<>();
    }
    
    public int next(int price) {
        int count=1;
        int i=0;
        int n=this.stack.size();
        while(n>0&&i<n&&this.stack.get(n-1-i)<=price){
            count++;
            i++;
        } //count++;
        this.stack.add(price);
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */