class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] p1 = new int[s.length()];
        int[] p2 = new int[t.length()];
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int id1 = 0;
        int id2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!map1.containsKey(s.charAt(i))) {
                map1.put(s.charAt(i), id1++);
            }
            if (!map2.containsKey(t.charAt(i))) {
                map2.put(t.charAt(i), id2++);
            }
            p1[i] = map1.get(s.charAt(i));
            p2[i] = map2.get(t.charAt(i));
        }
        return Arrays.equals(p1, p2);
    }
}