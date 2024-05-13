package org.example;

public class Main {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        System.out.println(changeAds(100));
    }

    public static int changeAds(int base10) {
        String binary = Integer.toString(base10, 2);
        StringBuilder sb = new StringBuilder();
        char[] chars = binary.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            var r = chars[i] == '0' ? '1' : '0';
            sb.append(r);
        }
        return Integer.parseInt(sb.toString(), 2);
    }

}