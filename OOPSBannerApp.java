public class OOPSBannerApp {

    /**
     * CharacterPatternMap - Inner class for storing character-to-pattern mappings
     */
    static class CharacterPatternMap {
        private final Character character;
        private final String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates and initializes CharacterPatternMap array for predefined characters
     * Populates pattern maps for letters 'O', 'P', 'S' and space character.
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        return new CharacterPatternMap[]{
            new CharacterPatternMap('O', new String[]{
                " *** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " *** "
            }),
            new CharacterPatternMap('P', new String[]{
                "** ",
                "*     *",
                "*     *",
                "** ",
                "*      ",
                "*      ",
                "*      "
            }),
            new CharacterPatternMap('S', new String[]{
                " *** ",
                "*      ",
                "*      ",
                " *** ",
                "      *",
                "      *",
                " *** "
            }),
            new CharacterPatternMap(' ', new String[]{
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       "
            })
        };
    }

    /**
     * Retrieves the ASCII pattern for a given character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter().equals(ch)) {
                return map.getPattern();
            }
        }
        // Default to space if character not found
        return getCharacterPattern(' ', charMaps);
    }

    /**
     * Prints a message as a banner using ASCII art patterns
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        // Each character pattern has 7 lines
        for (int line = 0; line < 7; line++) {
            StringBuilder sb = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                sb.append(pattern[line]).append("  "); // spacing between characters
            }
            System.out.println(sb.toString());
        }
    }

    /**
     * Main method - Entry point for the banner display application
     */
    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}
