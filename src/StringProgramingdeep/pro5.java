package StringProgramingdeep;

public class pro5 {
    public static void main(String[] args) {
        String s = "minion";
        for (int i=0; i<s.length();i++){
            for (int j=i+1;j<s.length();j++){
                String temp = s.substring(i,j);
                if(isUnique(temp)){
                    System.out.println(temp);
                }
            }
        }
    }
    public static boolean isUnique(String s){
    String s2 = "";
    for(int i=0; i<s.length();i++){
        char ch = s.charAt(i);
        if(s2.contains(ch+"")){
            return false;
        }
        s2=s2+ch;
    }
return true;

}
}
