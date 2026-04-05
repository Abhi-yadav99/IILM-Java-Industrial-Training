class Solution {
    public String maskPII(String s) {
        if (s.contains("@")) {
            s = s.toLowerCase();
            int idx = s.indexOf('@');
            char first = s.charAt(0);
            char last = s.charAt(idx - 1);
            return first + "*****" + last + s.substring(idx);
        } else {
            String digits = "";
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) digits += c;
            }
            int n = digits.length();
            String local = "***-***-" + digits.substring(n - 4);
            if (n == 10) return local;
            String country = "+";
            for (int i = 0; i < n - 10; i++) country += "*";
            return country + "-" + local;
        }
    }
}