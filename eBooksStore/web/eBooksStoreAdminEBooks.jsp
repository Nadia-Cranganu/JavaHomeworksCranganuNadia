<%-- 
    Document   : eBooksStoreAdminEBooks
    Created on : Nov 19, 2016, 7:36:42 PM
    Author     : gheor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Electronic Books Store Manage Ebooks</title>
        <link rel="stylesheet" type="text/css" href="./css/eBooksStoreCSS.css">
    </head>
    <body>
        <%-- test if actual user is authenticated and authorized --%>
        <c:choose>
            <c:when test="${validUser == true}">   
                <!-- include menu -->
                <%@ include file="./utils/eBooksStoreMenu.jsp" %>
                <%-- Master view --%>
                <form action="${pageContext.request.contextPath}/eBooksStoreAdminEBooks" method="POST">
                    <sql:setDataSource 
                        var="snapshot" 
                        driver="org.apache.derby.jdbc.ClientDriver"
                        url="jdbc:derby://localhost:1527/ebooksstore;create=true;"
                        user="APP"  
                        password="APP"/>
                    <sql:query dataSource="${snapshot}" var="result">
                        SELECT EBOOKS.ISBN, AUTHORS.NAME, EBOOKS.TITLE, EBOOKS.PAGES, EBOOKS.PRICE, EBOOKS.RATING FROM AUTHORS, EBOOKS, EBOOKS_AUTHORS 
                        WHERE AUTHORS.ID = EBOOKS_AUTHORS.ID_AUTHOR AND EBOOKS_AUTHORS.ISBN = EBOOKS.ISBN ORDER BY TITLE ASC
                    </sql:query>
                    <table border="1" width="100%">
                        <tr>
                            <td width="4%" class="thc"> select </td>    
                            <td width="15%" class="thc">ISBN</td>
                            <td width="15%" class="thc">NAME</td>
                            <td width="15%" class="thc">TITLE</td>
                            <td width="15%" class="thc">PAGES</td>
                            <td width="15%" class="thc">PRICE</td>
                            <td width="15%" class="thc">RATING</td>
                        </tr>
                    </table>   
                        
                    <table border="1" width="100%">    
                        <c:forEach var="row" varStatus="loop" items="${result.rows}">
                            <tr>
                                <td width="4%" class="tdc"><input type="checkbox" name="ebooks_checkbox" value="${row.id}"></td>
                                <td width="15%" class="tdc"><c:out value="${row.isbn}"/></td>
                                <td width="15%" class="tdc"><c:out value="${row.name}"/></td>
                                <td width="15%" class="tdc"><c:out value="${row.title}"/></td>
                                <td width="15%" class="tdc"><c:out value="${row.pages}"/></td>
                                <td width="15%" class="tdc"><c:out value="${row.price}"/></td>
                                <td width="15%" class="tdc"><c:out value="${row.rating}"/></td>
                            </tr>
                            
                            
                            
                        </c:forEach>
                    </table>
                    <%-- Details --%>
                    <sql:setDataSource 
                        var="snapshotroles" 
                        driver="org.apache.derby.jdbc.ClientDriver40"
                        url="jdbc:derby://localhost:1527/ebooksstore;create=true;"
                        user="APP"  
                        password="APP"/>
                    <sql:query dataSource="${snapshotroles}" var="resultroles">
                        SELECT TITLE from EBOOKS ORDER BY TITLE ASC 
                    </sql:query>
                    <table class="tablecenterdwithborder">
                        <tr><td>    
                                <table>
                                    
                                        <td> ISBN </td>
                                        <td> <input type="text" name="ebooks_isbn"></input></td>
                                 
                                    
                                        <td> TITLE </td>
                                        <td> <input type="password" name="ebooks_title"></input></td>
                                   
                                    
                                        <td> PAGES </td>
                                        <td> <input type="password" name="ebooks_pages"></input></td>
                                    
                                  
                                        <td> PRICE </td>
                                        <td> <input type="password" name="ebooks_price"></input></td>
                                    
                                    
                                        <td> RATING </td>
                                        <td> <input type="password" name="ebooks_rating"></input></td>
                                       
                                </table>
                                <%-- buttons --%>
                               <table class="tablecenterdwithborder">
                                    <tr><td class="tdc"><input type="submit" class="ebooksstorebutton" name="ebooks_insert" value="Insert"></td> 
                                        <td class="tdc"><input type="submit" class="ebooksstorebutton" name="ebooks_update" value="Update"></td>
                                        <td class="tdc"><input type="submit" class="ebooksstorebutton" name="ebooks_delete" value="Delete"></td> 
                                        <td class="tdc"><input type="submit" class="ebooksstorebutton" name="ebooks_cancel" value="Cancel"></td>
                                    </tr>  
                                </table>
                            </td></tr>
                    </table>    
                </form>
            </c:when>
            <c:otherwise>
                <c:redirect url="./index.jsp"></c:redirect>
            </c:otherwise>
        </c:choose>
    </body>    
</html>
