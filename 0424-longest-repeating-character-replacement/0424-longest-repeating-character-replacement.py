class Solution(object):
    def characterReplacement(self, s, k):
        l = r = maxlen = maxfre = 0
        hsh = {}
        while (r < len (s)):
            if s[r] in hsh:    
                hsh[ s[r] ] += 1
            else:
                hsh [ s[r]] = 1
            maxfre = max(maxfre, hsh[ s[r]])
            if (r-l+1 - maxfre > k ):
                hsh[s[l]] -= 1

                l += 1 
            else:
                maxlen = max(r-l+1, maxlen)
            
            r += 1
        return maxlen