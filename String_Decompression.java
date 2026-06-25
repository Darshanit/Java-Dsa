class String_Decompression {
    public static void main(String[] args) {
        String str = "c5d2a3";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                int count = Character.getNumericValue(ch);
                char prevChar = str.charAt(i - 1);

                for (int j = 0; j < count; j++) {
                    sb.append(prevChar);
                }
            }
        }

        System.out.println(sb.toString());
    }
}