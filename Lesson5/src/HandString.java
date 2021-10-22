public class HandString {
    public static int find(String strA, String strB) {
        int aLeng = strA.length();
        int bleng = strB.length();
        if (aLeng > bleng) {
            for (int i = 0; i < aLeng; i++) {
                // Kiểm tra phần tử đầu tiên của chuỗi B
                if ((strA.charAt(i)) == (strB.charAt(0))) {
                    // Kiểm tra các phần tử còn lại của chuỗi B
                    int k = i + 1;
                    for (int j = 1; j < bleng; j++) {
                        if ((strB.charAt(j)) != strA.charAt(k)) break;
                        if ((strA.charAt(k) == strB.charAt(bleng - 1))) return i; // trả về vị trí tìm kiếm
                        k++;
                    }

                }
            }
        }
        return -1;
    }

    public static String longestWord(String input) {
        String[] sParts = input.split(" ");
        int max = Integer.MIN_VALUE;
        int position = 0;
        for (int i = 0; i < sParts.length; i++) {
            if (max < sParts[i].length()) {
                max = sParts.length;
                position = i;
            }
        }
        return sParts[position];

    }
}
