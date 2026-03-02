/**
 * UC6 - Render OOPS Banner using Static Function
 *
 * @author Shreya
 * @version 2.0
 */
public class OOPSBannerApp {
    public static String[] getOPattern() {

        return new String[] {
             "  ****  ",
             " **  ** ",
             " **  ** ",
             " **  ** ",
             " **  ** ",
             " **  ** ",
             "  ****  "
        };
    }
    public static String[] getPPattern() {

        return new String[] {
             " *****  ",
             " **  ** ",
             " **  ** ",
             " ****** ",
             " **     ",
             " **     ",
             " **     "
        };
    }
    
    public static String[] getSPattern() {

        return new String[] {
             "  **** ",
             " **  ** ",
             " **     ",
             " ***** ",
             "     ** ",
             " **  ** ",
             "  **** "
        };
    }


    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + "  " + 
                               oPattern[i] + "  " + 
                               pPattern[i] + "  " + 
                               sPattern[i]);
        }
    }
}
