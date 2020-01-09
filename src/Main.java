import java.util.*;
public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s) {
        int answer = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count++;
            }
            System.out.println("Number of vowels: " + count);
        }
        return answer;
    }

    //Code you problem number two here
    static int problemTwo(String s) {
       int answer=0;
       String findstr="bob";
       int lastindex=0;
       int count=0;

       while(lastindex!=-1) {
           lastindex = s.indexOf(findstr, lastindex);
           if (lastindex != -1) {
               count++;
               lastindex += findstr.length();
           }
       }
        System.out.println("Number of times ie occurs: "+count);
        return answer;
   }

    //Code your solution to problem number 3 here
    static String problemThree(String s) {
        int answer=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)+1==s.charAt(i+1)){
                count++;
                while(s.charAt(i)+1==s.charAt(i+1)){
                    i++;
                }
            }
            System.out.println("Longest substring in alphabetical order: "+count);
        }
        return s;
    }


    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
    }
}
