public ZigZag {
    public static void main(String[] args) {
		    String str = "LEETCODEISHIRING";
		    System.out.println(convert(str, 3));
	  }
    public static String convert(String s, int numRows) {
        if(numRows == 1)
            return s;
        
        int len = Math.min(s.length(), numRows);
        String []rows = new String[len];		//对应每一行
        for(int i = 0; i< len; i++) rows[i] = "";		//初始化
        int loc = 0;
        boolean down = false;

        for(int i=0;i<s.length();i++) {
            rows[loc] += s.substring(i,i+1);
            if(loc == 0 || loc == numRows - 1)
                down = !down;
            loc += down ? 1 : -1;
        }
        
        String ans = "";
        for(String row : rows) {
            ans += row;
        }
        return ans;
    }
}
