class Solution {
    public boolean isSubsequence(String s, String t) {

        return check(s,t);

    }

    public boolean check(String s,String t) {
        int j=0;
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();

        for (int i = 0; i < b.length && j<a.length; i++)

        {
            if(a[j]==b[i])
            j++;


        System.out.println(j);
        }
        return (j==s.length());
    }
}