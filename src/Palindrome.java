public class Palindrome {

    static boolean isPalindrome(String name){
        name = name.toLowerCase();

        String rev = "";

        for(int i=name.length()-1;i>=0;i--){
            rev  = rev + name.charAt(i);
        }

        return name.equals(rev);
    }


    public static void main(String[] args) {
        if(isPalindrome("madam")){
            System.out.println("The number is Palindrome");
        }else {
            System.out.println("The number is not a palindrome");
        }
    }
}
