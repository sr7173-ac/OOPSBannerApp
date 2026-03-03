/**
 * UC7 - Store Character Pattern in a Class
 *
 * @author Shreya
 * @version 2.0
 */
public class OOPSBannerApp {
    
    static class CharacterPatternMap {
        Character character;
        String[] pattern;

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
    
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];
        charMaps[0] = new CharacterPatternMap('O', new String[]{
             "  ****  ",
             " **  ** ",
             " **  ** ",
             " **  ** ",
             " **  ** ",
             " **  ** ",
             "  ****  "
        });
    
       charMaps[1] = new CharacterPatternMap('P', new String[]{
             " *****  ",
             " **  ** ",
             " **  ** ",
             " ****** ",
             " **     ",
             " **     ",
             " **     "
        });
    
        charMaps[2] = new CharacterPatternMap('S', new String[]{
             "  **** ",
             " **  ** ",
             " **     ",
             " ***** ",
             "     ** ",
             " **  ** ",
             "  **** "
        });
        return charMaps;
    }

    
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (Character.toUpperCase(ch) == map.getCharacter()) {
                return map.getPattern();
            }
        }
        return getCharacterPattern(' ', charMaps);
    }
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        for (int i = 0; i < 7; i++) { 
            StringBuilder line = new StringBuilder();
            for (char ch : message.toCharArray()) {
                line.append(getCharacterPattern(ch, charMaps)[i]).append("  ");
            }
            System.out.println(line);
        }
    }
    public static void main(String[] args) {
        // Initialize character pattern maps
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        
        // Define and print the message "OOPS"
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}
   