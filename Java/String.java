public class Example_StringOpr
{
    public static void main(String[] args) 
    {
        String s1="Java Programming";
        char ch[] = {'s','t','r','i','n','g','s'}; 
        String s2= new String(ch);
        String s3= new String("This is Java Strings");
    
        System.out.println(s1); 
        System.out.println(s2);
        System.out.println(s3);
    
        System.out.println("character at index 5 in string s1="+ s1.charAt(5));
        System.out.println("Length of string s1= " +s1.length());
        System.out.println("substring of string s1="+ s1.substring(4)); System.out.println("substring of string s1="+ s1.substring(5,11));
        System.out.println("is Java present in string s1="+ s1.contains("Java"));
        System.out.println("is 00P present in String s1= " +s1.contains("OOP"));
        System.out.println("Is String s1 equal to s2 = " + s1.equals(s2));
    
        String s4="java Programming";
        System.out.println("Is String s1 equal to s4 = " + s1.equals(s4)); 
        System.out.println("Is String s1 equal to s4 (ignore case)= " +s1.equalsIgnoreCase(s4));
        String s5 = String.join("-", "welcome", "to","Java", "Programming");
        System.out.println(s5);
    
        String s6 = String.join("/", "31","10","2022");
        System.out.println(s6);
        System.out.println("Is s6 empty = " + s6.isEmpty());
        
        String s7 = "";
        System.out.println("Is s7 empty = "+ s7.isEmpty());
        System.out.println("concatenated String = " + s1.concat(s6));
        String concatenated = s1.concat(s6);
    
        String s8 = s1.replace("p", "o"); 
        System.out.println("New String s8="+ s8);
    
        String s9 = s1.replace("Java", "oop");
        System.out.println("New String s9="+ s9);
        System.out.println("Index of P in String s1= " + s1.indexOf("P")); 
        System.out.println("Index of a in string s1 from 5 onwards = " + s1.indexOf("a",5)); 
        String s10 = "welcome to Java";
        System.out.println("Index of to in string s10 = " + s10.indexOf("to"));
        
        String s11="HELLO";
        System.out.println("String s11 in lower case = " + s11.toLowerCase());
        String s12 = "how are you?";
        System.out.println("String s12 in upper case = " + s12.toUpperCase());
        
        String s13 = "Aurangabad";
        System.out.println("trimmed string s13 = "+ s13.trim());
        
        int x1 = 15;
        System.out.println("int converted to string " + String.valueOf(x1));
        
        String s14 = "we-are-trying-to-split-a-string";
        String [] words = s14.split("-");
        for(String w: words) 
            System.out.println(w);
    
        //String s15 = "we are trying to split a String";

        //String word1 = s15.split("\\s");
        //for(String w: word1) 
        //System.out.println(w);
    }
}