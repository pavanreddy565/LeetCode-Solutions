class MedianFinder {
    private PriorityQueue<Integer> minHeap, maxHeap;
    private int l,r;
    public MedianFinder() {
        this.maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        this.minHeap = new PriorityQueue<Integer>();
        this.l=0;
        this.r=0;
    }
    
    public void addNum(int num) {
        this.maxHeap.add(num);
        this.l++;
        while(this.minHeap.size()>0 && this.maxHeap.size()>0 && this.minHeap.peek()<this.maxHeap.peek()){
            this.minHeap.add(this.maxHeap.poll());
            this.r++;
            this.l--;
        }while(Math.abs(this.r-this.l)>1){
            if(this.r-this.l >1){
                this.maxHeap.add(this.minHeap.poll());
                this.l++;
                this.r--;
            }else{
                this.minHeap.add(this.maxHeap.poll());
                this.r++;
                this.l--;
            }
        }
    }
    
    public double findMedian() {
        double ans;
        if(this.r==this.l){
            ans =(double)(this.minHeap.peek()+this.maxHeap.peek())/2;
        }else if(this.r>this.l){
            ans = this.minHeap.peek();
        }else{
            ans = this.maxHeap.peek();
        }System.out.println(this.l+" "+this.r+" "+ans);
        return ans;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */