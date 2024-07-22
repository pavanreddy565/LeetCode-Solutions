class Solution:
    def shipWithinDays(self, weights: List[int], days: int) -> int:
        l=max(weights)
        h=sum(weights)
        while l<=h:
            mid=(l+h)//2
            n_days=1
            load=0
            for i in weights:
                if load+i>mid:
                    n_days+=1
                    load=i
                else:
                    load+=i
            print(f'i {i} finalload{load}')
            print("n_days = ",n_days)
            # if n_days==days:
            #     return mid
            if n_days<=days:
                h=mid-1
            else:
                l=mid+1
        return l