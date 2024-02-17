public class Main {
    public static void main(String[] args) {

        String str = "hello";
        char[] charArr = str.toCharArray();

        int left = 0;
        int right = charArr.length - 1;

        while(left < right) {
            char storage = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = storage;

            left++;
            right--;
        }

        String result = new String(charArr);
        System.out.println(result);
    }
}