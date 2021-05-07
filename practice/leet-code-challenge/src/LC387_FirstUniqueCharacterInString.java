public class LC387_FirstUniqueCharacterInString {
    public int firstUniqChar(String s){
        int index=-1;
        for(int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                index = i;
                break;
            }
        }
        return index;
    }
}
