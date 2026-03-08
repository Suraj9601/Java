class SortString {
    public static void main(String[] args) {
        String str = "suraj";
        System.out.println(sortString(str));
    }

    static String sortString(String str) {
        char[] chars = str.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i+1; j < chars.length; j++) {
                if (chars[i] > chars[j]) {
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                } 
            }
        }
        return new String(chars);
    }
}