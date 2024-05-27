class Solution:
    def minWindow(self, s: str, t: str) -> str:
        hashmap = [0] * 256
        for i in t:
            hashmap[ord(i)] += 1
        l = 0
        r = 0
        count = 0
        startindex = -1
        maxlen = 10**6
        # print(hashmap[ord('C')])
        while r < len(s):
            # print(count, s[r])
            if hashmap[ord(s[r])] > 0:
                # print(count, s[r])
                count += 1
            hashmap[ord(s[r])] -= 1
            if count == len(t):
                # maxlen=min(maxlen,r-l+1)
                while count == len(t):
                    if maxlen > r - l + 1:
                        maxlen = min(maxlen, r - l + 1)
                        startindex = l
                    hashmap[ord(s[l])] += 1
                    if hashmap[ord(s[l])] > 0:
                        count -= 1
                    # print(maxlen, " ",count," ",s[l])
                    l += 1

                    # print(startindex)

            r += 1
        # print(s[startindex:startindex+maxlen]," ",startindex," ",maxlen)
        if startindex == -1 and maxlen == 10**6:
            return ""
        return s[startindex : startindex + maxlen]
