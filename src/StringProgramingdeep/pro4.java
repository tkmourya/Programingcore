package StringProgramingdeep;

public class pro4 {
    public static void main(String[] args) {
    String s = "banana";
    String str ="";
    for (int i=0;i<s.length();i++){
        if(!str.contains(s.charAt(i) + "")){
            str+=s.charAt(i);
        }
    }
        System.out.println("original string: "+s);
        System.out.println("string  without duplicate : "+str);
    }
}
