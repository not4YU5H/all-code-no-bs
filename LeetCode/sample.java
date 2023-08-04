public class sample{
    public static void main(String[] args) {
        int count[] = new int[256];
        String str = "abcljsndojaneln";
        for (int i = 0; i < str.length(); i++)
            count['b']++;
        for (int i = 0; i < 256; i++)
        if (count[i] > 1)
            System.out.println((char)(i) +
                      ", count = " + count[i]);
    }
}