class Solution {
    public int totalFruit(int[] fruits) {
        int l=0;
        int r=0;
        int n=fruits.length;
        int size=0;
        int maxlength=0,length=0;
        int ls=0;
        List<Integer> list=new ArrayList<>(2);
        while(r<n){
            if(!list.contains(fruits[r]) && size<2){
                list.add(fruits[r]);
                size++;
               
                length=r-l+1;
                maxlength=Math.max(length,maxlength);
                //System.out.println(fruits[l] +" "+l+" "+fruits[r]+" len1 "+length);
                ls=r;
                r++;
                
            }else if (list.contains(fruits[r])){
                
                length=r-l+1;
                maxlength=Math.max(length,maxlength);
                //System.out.println(fruits[l] +" "+fruits[r]+" len "+length);
                if(fruits[ls]!=fruits[r])
                    ls=r;
                r++;
                
            }else{
                int store=0;
                //System.out.println(list);
                
                for(int i=0;i<2;i++){
                    if (list.get(i)!=fruits[r-1]){
                        store=i;
                    }
                }int num=list.get(store);
                list.remove(store);
                size--;
                
                // while (fruits[l]!=fruits[r-1]){
                //     l++;
                // }
                l=ls;
                //System.out.println(list);
            }
        }return maxlength;
    }
}