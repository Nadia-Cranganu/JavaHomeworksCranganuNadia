/*

 * Simple app which validates a string using regular expression

 * inspired by Marius Neagu

 */

package multithreadingcnp;



import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Scanner;

import java.util.regex.Matcher;

import java.util.regex.Pattern;



/**

 * Cnp validator using regular expression

 * @author MariusNeagu

 */



public class CnpValidator {



    // method for validating birth date

    public static boolean validateBirthDate(String text) throws ParseException {



        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");

        sdf.setLenient(false);

        sdf.parse(text);

        return true;

    } 



    // main method

    public static void main(String[] args) throws ParseException {



        Scanner scan = new Scanner(System.in);

        boolean run = false;



        do {

            System.out.println("Please enter CNP: ");

            String input = scan.next();

            

            if (input.length() < 13 || input.length() > 13) {

                System.out.println("Invalid CNP length, please try again.");

            } else {

                    boolean validCnp = false;

                //check if all 13 characters are digits

                Pattern patternDigits = Pattern.compile("\\d{13}");

                Matcher matcher = patternDigits.matcher(input);



                while (matcher.find()) {

                    validCnp = true;

                }

               

                if (!validCnp) {

                    System.out.println("CNP should contain only numbers, please try again.");

                } else {

                    // check if the first digit equals 1 or 2

                    Pattern patternFirstDigit = Pattern.compile("^[1-2]");

                    Matcher matcherFirstDigit = patternFirstDigit.matcher(input);

                    boolean found = false;

                    while (matcherFirstDigit.find()) {

                        found = true;

                    }

                    // check if first digit is 1 or 2 and extract date

                    if (found) {

                        Pattern patternDate = Pattern.compile("^[1-2]\\d{2}\\d{2}\\d{2}");

                        Matcher matcherDate = patternDate.matcher(input);

                        String resultDate = "";

                        while (matcherDate.find()) {

                            resultDate = String.format(matcherDate.group());

                        }

                        //validate birth date

                        if (validateBirthDate(resultDate.substring(1))) {

                            System.out.println("Congratulations, the CNP entered is correct.");

                            run = true;

                        } else {

                            System.out.println("Invalid date in CNP, please try again.");

                        }

                    } else {

                        System.out.println("First digit of CNP should be 1 or 2, please try again.");

                    }

                }

            }

        } while (!run);

    }

}