public class ReverseLetters {
    public static void main(String[] args) {
        String s = "abc@#$,bv";
        char[] arr = s.toCharArray();
        
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
          
            if (!Character.isLetter(arr[i])) {
                i++;
            } 

            else if (!Character.isLetter(arr[j])) {
                j--;
            } 
          
            else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        String result = new String(arr);
        System.out.println("Output: " + result); 
       
    }
}