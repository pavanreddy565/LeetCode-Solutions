class Solution:
    def isValid(self, word: str) -> bool:
        vowels_='aeiou'
        vowels_+=vowels_.upper()
        consnats_='bcdfghjklmnpqrstvwxyz'
        consnats_+=consnats_.upper()
        allowed=vowels_+consnats_+'0123456789'
        if len(word)<3: return False
        has_vowel=False
        has_consnat=False
        for c in word:
            if c in vowels_:has_vowel=True
            if c in consnats_:has_consnat=True
            if c not in allowed: return False
        return has_vowel and has_consnat

