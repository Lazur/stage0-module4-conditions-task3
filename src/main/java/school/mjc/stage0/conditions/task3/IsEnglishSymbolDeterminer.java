package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        if (Character.isLetter(symbol) && Character.UnicodeBlock.of(symbol) == Character.UnicodeBlock.BASIC_LATIN) {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
