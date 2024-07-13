class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mp = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            
            if (!mp.containsKey(sc)) {
                if (mp.containsValue(tc)) return false;
                mp.put(sc, tc);
            } else {
                if (mp.get(sc) != tc) return false;
            }
        }
        return true;
    }
}