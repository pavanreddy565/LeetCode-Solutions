class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        min_=len(strs[0])
        if len(strs)<=1:
            return "".join(strs)
        for i in range(1,len(strs)):
            if min_>len(strs[i]):
                min_=len(strs[i])
        
        
        i=0
        start=0
        end=0
        ans=""
        num=0
        while(i<min_):
            l=strs[0][end]
            
            for st in range(1,len(strs)):
                if strs[st][i]!=l:
                    print(l, " ",start ," ",end)
                    num=1
                    ans=strs[0][start:end]
                    start=i+1
                    break
                
            # print("st=",st)
            print(num)
            if start>i:
                break
            #     if len(ans)<end-start+1:
            #         ans=strs[0][start:end+1]
            end+=1
            i+=1
        if num==0:
            ans=strs[0][start:end]
        # if len(ans)<end-start+1 and start!= end:
        #             print(ans)
        #             
        #             print(ans)
        return ans