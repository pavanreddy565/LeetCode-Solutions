class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<asteroids.length;i++){
            if(st.empty()){
                st.push(asteroids[i]);
                continue;
            }
            int re=0;
            while(!st.empty() && st.peek()>0 &&asteroids[i]<0  && Math.abs(asteroids[i])>=Math.abs(st.peek())){
                
                re=st.pop();
                if(Math.abs(re)==Math.abs(asteroids[i]))break;
            }
            //System.out.println(re);
            
            if(!st.empty()&&(st.peek()<=asteroids[i]||st.peek()*asteroids[i]>0)&&Math.abs(re)!=Math.abs(asteroids[i])){
                
                st.push(asteroids[i]);
            }
            if(st.empty()&&Math.abs(re)!=Math.abs(asteroids[i])){
                st.push(asteroids[i]);
            }
            
        }
        int [] ans= new int[st.size()];
        int i=st.size()-1;
            while(!st.empty()){
                ans[i--]=st.pop();
            }return ans;
    }
}