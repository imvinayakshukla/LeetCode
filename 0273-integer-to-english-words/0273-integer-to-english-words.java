class Solution {
    private String[] to19 = "One,Two,Three,Four,Five,Six,Seven,Eight,Nine,Ten,Eleven,Twelve,Thirteen,Fourteen,Fifteen,Sixteen,Seventeen,Eighteen,Nineteen".split(",");
    private String[] tens = "Twenty,Thirty,Forty,Fifty,Sixty,Seventy,Eighty,Ninety".split(",");
    private String[] units = {"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        return words(num).trim();
    }

    private String words(int n) {
        if (n < 20) return to19[n - 1];
        if (n < 100) return tens[n / 10 - 2] + (n % 10 > 0 ? " " + words(n % 10) : "");
        if (n < 1000) return words(n / 100) + " Hundred" + (n % 100 > 0 ? " " + words(n % 100) : "");
        
        StringBuilder sb = new StringBuilder();
        int unitIndex = 0;
        
        while (n > 0) {
            if (n % 1000 != 0) {
                sb.insert(0, words(n % 1000) + " " + units[unitIndex] + " ");
            }
            n /= 1000;
            unitIndex++;
        }
        
        return sb.toString().trim();
    }
}