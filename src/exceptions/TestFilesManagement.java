/*

 * Test Files Management

 */

package exceptions;



import java.io.IOException;



/**

 * Create a class TestFilesManagement class, having a main method, to test all

 * methods created in the FilesManagement created class. Catch all exceptions

 * possible to appear.

 *

 * inspiraton: Doru programatoru'

 */

public class TestFilesManagement {



    public static void main(String[] args) {

        FilesManagement manager = new FilesManagement();

        String file = "C:\\Users\\user\\Documents\\NetBeansProjects\\Scoala Informala.txt";

        try {

            String content = "Mi-a placut cursul de Java cu Ghita.";

            manager.writeStringFile(file, content);

            String existingContent = manager.readStringFile(file);

            if (content.equals(existingContent)) {

                System.out.println("Write a content succesfuly");

                System.out.println("Read a content succesfuly");

            } else {

                System.out.println("Error in file content!");

            }

            String appendedContent = "Trebuie sa-mi fac timp sa exersez.";

            manager.addStringToFile(file, appendedContent);

            existingContent = manager.readStringFile(file);

            if ((content + appendedContent).equals(existingContent)) {

                System.out.println("Add a content succesfuly");

            } else {

                System.out.println("Error in adding file content!");

            }

            manager.deleteFileContent(file);

            existingContent = manager.readStringFile(file);

            if (existingContent.equals("")) {

                System.out.println("Delete a content succesfuly");

            } else {

                System.out.println("Error in deleting file content!");

            }

        } catch (IOException ioe) {

            System.out.println("Error occured " + ioe.getMessage());

        }

    }

}