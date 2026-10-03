import java.util.*;

class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> res = new ArrayList<>();

        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                int b = Integer.bitCount(h) + Integer.bitCount(m);

                if (b == turnedOn) {
                    String a = String.format("%d:%02d", h, m);
                    res.add(a);
                }
            }
        }

        return res;
    }
}
