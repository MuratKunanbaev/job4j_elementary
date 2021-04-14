package live;

public class Loop {
    public static void main(String[] args) {
        String left = "2173896";
        String right = "2233796";
        int num = 0;
        for (int i = 0; i <= left.length() - 1; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                num++;
            }
        }
        System.out.println(num);
    }
}
