class Solution {
    public boolean isPalindrome(String s) {
        char ch[]=s.toCharArray();
        int i=0;
        for(char c:ch){
            if(isAlpaNumeric(c)){
                ch[i]=Character.toLowerCase(c);
                i++;
            }
        }
        int left=0; int right=i-1;

        while(left<right){
            if(ch[left]!=ch[right])
            return false;
            else{left++;right--;}
        }
        return true;
    }
        
    
    public static boolean isAlpaNumeric(char ch){
        return (ch>='A'&&ch<='Z') ||(ch>='a'&&ch<='z')||(ch>='0'&&ch<='9');
    }
}
