package com.blitznihar.app;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
         System.out.println( ApplicationProperties.INSTANCE.getAppPropertyByName("displayText") );
    }
}
