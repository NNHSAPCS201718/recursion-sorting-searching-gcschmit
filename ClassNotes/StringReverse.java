
/**
 * Write a description of class StringReverse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringReverse
{
    public static String reverse( String str )
    {
        // must have a terminating case
        if( str.equals( "" ))
        {
            return str;
        }
        
        // must make the problem simplier
        String firstChar = str.substring( 0, 1 );
        String restOfString = str.substring( 1 );
        
        // recurse - call this method recursively with a simplier problem
        String restOfStringReversed = reverse( restOfString );
        
        // return the solution
        String strReversed = restOfStringReversed + firstChar;
        return strReversed;
        
    }
}
