class Solution {
    void print(int[] bills){
        for(int i=0;i<bills.length;i++){
            System.out.print(bills[i]+" ");
        }System.out.println();
    }
    public boolean lemonadeChange(int[] bills) {
        int fives=0;
        int tens=0;
        //Arrays.sort(bills);
        //print(bills);
        for(int i=0;i<bills.length;i++){
            //System.out.print(fives+" ");
            if(bills[i]==5){
                fives++;
            }else if(bills[i]==10){
                if(fives==0){
                    return false;
                }
                tens++;
                
                fives--;
            }else{
                if(tens>0&&fives>0){
                    tens--;
                    fives--;
                }else if(fives>2) fives-=3;
                else return false;
            }
        }return true;
    }
}