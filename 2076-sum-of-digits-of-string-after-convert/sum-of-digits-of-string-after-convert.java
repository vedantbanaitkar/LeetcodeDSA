class Solution {
    public static String stringGenerator(String s){
        StringBuilder sn = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            sn.append(((int)s.charAt(i))-96);
        }
        System.out.println(sn);
        return sn.toString();
    }
    public static int getLucky(String s, int k) {
        String sk = stringGenerator(s);
        // System.out.println(sk);
        int r = 0;
        for(int i=0; i<k; i++){
            r = 0;
            for(int j=0; j<sk.length(); j++){
                r+=sk.charAt(j) - '0';
            }
            System.out.println("r="+ r);
            sk = String.valueOf(r); 
        }
        return r;
    }
}