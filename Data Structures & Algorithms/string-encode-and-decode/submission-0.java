class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String str:strs){
            sb.append(str.length()+"#"+str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=str.indexOf('#',i);
            int length=Integer.parseInt(str.substring(i,j));
            list.add(str.substring(j+1,length+j+1));
            i=length+j+1;
        }
return list;


    }
}
