package tasks;

public class test9 {
    static void sampleMethod(char s1[], char s2[])
    {
        int i = 0;
        for (i = 0; i < s1.length-1; i++)
            s2[i] = s1[i];
    }

    public static void main(String[] args)
    {
        char s1[] = "GoodMorning".toCharArray();
        char s2[] = new char[s1.length];
        sampleMethod(s1, s2);
        System.out.println(String.valueOf(s2));
    }
}

