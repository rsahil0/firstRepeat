import java.util.*;

class Main
{
    static char firstRepeating(char str[])
    {
        HashSet<Character> h = new HashSet<>();

        // Traverse the input array from left to right
        for (int i=0; i<=str.length-1; i++)
        {
            char c = str[i];

            if (h.contains(c))
                return c;

            else // Else add element to hash set
                h.add(c);
        }

        return '\0';
    }

    // Driver method to test above method
    public static void main (String[] args)
    {
        String str = "saheel";
        char[] arr = str.toCharArray();
        System.out.println(firstRepeating(arr));
    }
}