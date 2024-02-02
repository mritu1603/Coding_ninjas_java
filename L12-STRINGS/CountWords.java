import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int countSpace = 1;
        for(int i = 0;i<str.length();i++){
           if(str.charAt(i) == ' '){
               countSpace++;
           }
           
        }
        
        System.out.print(countSpace);

        

    }
}
