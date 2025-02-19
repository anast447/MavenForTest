public class LR8_ReplaceText {
    public static void main(String[] args) {
        String text = "Привет Влад, ты лабы по джаве сделал?";
        int k = 3;
        char replacementChar = '$';

        String modifiedText = replace(text, k, replacementChar);

        System.out.println("Текст: " + text);
        System.out.println("Измененный текст: " + modifiedText);
    }

    public static String replace(String text, int k, char replacementChar) {
        String[] words = text.split(" ");
        StringBuilder modifiedText = new StringBuilder();

        for (String word : words) {
            if (k > word.length()) {
                modifiedText.append(word);
            } else {
                String modifiedWord = word.substring(0, k - 1) + replacementChar + word.substring(k);
                modifiedText.append(modifiedWord);
            }
            modifiedText.append(" ");
        }
        return modifiedText.toString().trim();
    }
}