package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        char ch;
        if (Character.isLetter(character) && Character.UnicodeBlock.of(character) == Character.UnicodeBlock.BASIC_LATIN) {
            ch = Character.toUpperCase(character);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
