class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> l = new LinkedList<>();

        for (char x : s.toCharArray()) {
            if (x == '(' || x == '[' || x == '{') {
                l.addLast(x);
            } else if (l.size() == 0) {
                return false;
            } else if (x == ')' && l.getLast() == '(') {
                l.removeLast();
            } else if (x == ']' && l.getLast() == '[') {
                l.removeLast();
            } else if (x == '}' && l.getLast() == '{') {
                l.removeLast();
            } else {
                return false;
            }
        }

        return l.isEmpty();
    }
}