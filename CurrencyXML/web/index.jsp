<%-- 

    Document   : index

    Created on : May 21, 2017, 9:16:20 PM

    Author     : MariusNeagu

--%>



<%@ page contentType="text/html; charset=utf-8" language="java" import="javax.xml.parsers.DocumentBuilderFactory,javax.xml.parsers.DocumentBuilder,org.w3c.dom.*" errorPage="" %>

<%

    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

    DocumentBuilder db = dbf.newDocumentBuilder();

    Document doc = db.parse("C:/Users/user/Documents/NetBeansProjects/JavaHomeworksCranganuNadia/CurrencyXML/web/currency.xml");

    NodeList RegistrationNo = doc.getElementsByTagName("RegistrationNo");

    NodeList Currency = doc.getElementsByTagName("Currency");

    NodeList Name = doc.getElementsByTagName("Name");

    NodeList One = doc.getElementsByTagName("One");

    NodeList Two = doc.getElementsByTagName("Two");

    NodeList Three = doc.getElementsByTagName("Three");

    NodeList Four = doc.getElementsByTagName("Four");

    NodeList Five = doc.getElementsByTagName("Five");

    NodeList Six = doc.getElementsByTagName("Six");

    NodeList Seven = doc.getElementsByTagName("Seven");

    NodeList Eight = doc.getElementsByTagName("Eight");

    NodeList Nine = doc.getElementsByTagName("Nine");

    NodeList Ten = doc.getElementsByTagName("Ten");

    NodeList Eleven = doc.getElementsByTagName("Eleven");

    NodeList Twelve = doc.getElementsByTagName("Twelve");

    NodeList Thirteen = doc.getElementsByTagName("Thirteen");

    NodeList Fourteen = doc.getElementsByTagName("Fourteen");

    NodeList Fifteen = doc.getElementsByTagName("Fifteen");

%>

<!DOCTYPE html>

<html>

    <head>

        <title>Read from XML</title>

    </head>
    <body>
        
        <table border="5">

        <%                int i;

            for (i = 0; i <= RegistrationNo.getLength() - 1; i++) {

        %>



        <tr>

            <td>

                <%= RegistrationNo.item(i).getFirstChild().getNodeValue()%>

            </td>

            <td>

                <%= Currency.item(i).getFirstChild().getNodeValue()%>

            </td>

            <td>

                <%= Name.item(i).getFirstChild().getNodeValue()%>

            </td>

            <td>

                <%= One.item(i).getFirstChild().getNodeValue()%>

            </td>

            <td>

                <%= Two.item(i).getFirstChild().getNodeValue()%>

            </td>

            <td>

                <%= Three.item(i).getFirstChild().getNodeValue()%>

            </td>

            <td>

                <%= Four.item(i).getFirstChild().getNodeValue()%>

            </td>

            <td>

                <%= Five.item(i).getFirstChild().getNodeValue()%>

            </td>

            <td>

                <%= Six.item(i).getFirstChild().getNodeValue()%>

            </td>

            <td>

                <%= Seven.item(i).getFirstChild().getNodeValue()%>

            </td>

            <td>

                <%= Eight.item(i).getFirstChild().getNodeValue()%>

            </td>

            <td>

                <%= Nine.item(i).getFirstChild().getNodeValue()%>

            </td>

            <td>

                <%= Ten.item(i).getFirstChild().getNodeValue()%>

            </td>

            <td>

                <%= Eleven.item(i).getFirstChild().getNodeValue()%>

            </td>

            <td>

                <%= Twelve.item(i).getFirstChild().getNodeValue()%>

            </td>

            <td>

                <%= Thirteen.item(i).getFirstChild().getNodeValue()%>

            </td>

            <td>

                <%= Fourteen.item(i).getFirstChild().getNodeValue()%>

            </td>

            <td>

                <%= Fifteen.item(i).getFirstChild().getNodeValue()%>

            </td>

        </tr>

        <%

            }

        %>

    </table>

</body>

</html>