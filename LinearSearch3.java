public class LinearSearch3 {
    static int searchChar(String s, char target) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "hello";
        char target = 'l';
        System.out.println("Index of '" + target + "': " + searchChar(s, target)); // 2
    }
}