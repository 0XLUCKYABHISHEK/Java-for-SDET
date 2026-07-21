public class CountofCapializedWord {

    public static int getCountofCapatilizedWord(String inputstring){
        int count=0;
        for (int i=0;i<inputstring.length();i++){
            if(inputstring.charAt(i)>='A' && inputstring.charAt(i)<='Z'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int allcount=getCountofCapatilizedWord("HelloWorldWe Are Learning");
        System.out.println(allcount);
    }
}