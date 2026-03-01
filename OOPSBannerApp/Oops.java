public class Oops {
    public static void main(String[]args){
        /* Program to print OOPS banner in 7 line format
         Each line is constructed using String.join()
          Lines are stored in a String array
          A for-each loop is used to print the banner */
          String[]banner = {
            //Array to store all 7 lines of the OOPS banner.
            // Each line joins 4 character segments: O,O,P,S
            String.join(" ",
                "  *****  ", "  *****  ", " ********", "  *****  "),
            String.join(" ",
                " *     * ", " *     * ", " *       ", " *     * "),
            String.join(" ",
                " *     * ", " *     * ", " *       ", " *       "),
            String.join(" ",
                " *     * ", " *     * ", " ******* ", "  *****  "),
            String.join(" ",
                " *     * ", " *     * ", " *       ", "       * "),
            String.join(" ",
                " *     * ", " *     * ", " *       ", " *     * "),
            String.join(" ",
                "  *****  ", "  *****  ", " *       ", "  *****  ")
        };
        // Loop through each line in the array
        // and print it to display the banner
        for (String line : banner) {
            System.out.println(line);
          }
    }
}
