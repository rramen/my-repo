/*
Choose a number, reverse its digits and add it to the original. If the sum is not a palindrome 
(which means, it is not the same number from left to right and right to left), repeat this procedure. For example:

195 (initial number) + 591 (reverse of initial number) = 786

786 + 687 = 1473

1473 + 3741 = 5214

5214 + 4125 = 9339 (palindrome)
*/

class digits {
    public int reverse(int n){
        String num = "";
        int x;
        while(n > 0){
            x = n % 10;
            num += x;
            n -= x;
            n = n/10;
        }
        int y = Integer.parseInt(num);
        return y;
    }

    public int palindrome(int n){
        digits d = new digits();
        int p = n + d.reverse(n);
        if(p != d.reverse(p)){
            return palindrome(p);
        }
        else return p;
    };

    public static void main(String[] args){
        int a = 195;
        digits d = new digits();
        System.out.printf("Our initial number is %d%n", a);
        System.out.printf("The resulting palindrome is %d%n", d.palindrome(a));
    };
}