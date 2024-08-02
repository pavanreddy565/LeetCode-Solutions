class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        if len(s)!=len(goal):
            return False
        s=list(s)
        for i in range(len(s)):
            print(s)
            if "".join(s)!=goal:
                s.append(s.pop(0))
            else:
                if "".join(s)==goal:
                    return True
        return False