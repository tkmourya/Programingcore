package StringProgramingdeep;

public class pro3 {
    public static void main(String[] args) {
String s = "minions";
String s2 = "";
for(int i=0; i<s.length();i++){
    char ch = s.charAt(i);
    if(s2.contains(ch+"")){
        System.out.println("duplicate spotted");
        return;
         }
        s2=s2+ch;
    }
        System.out.println("only unique character");
    }
}
