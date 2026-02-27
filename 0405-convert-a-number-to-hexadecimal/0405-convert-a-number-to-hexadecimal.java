class Solution {
    public String toHex(int num) {
        char[] hex= "0123456789abcdef".toCharArray();
        StringBuilder sb=new StringBuilder();
        if(num==0) return "0";
        while(num!=0){
            int rem=num&15;
            sb.append(hex[rem]);
            num>>>=4;

        }
        return sb.reverse().toString();
    }
}