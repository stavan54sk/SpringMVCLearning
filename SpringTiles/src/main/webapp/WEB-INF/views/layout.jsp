<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
 <html>
 <body>
 <table width="100%" height="100%">
 <tr height="20%">
 <td colspan="2" align="center">
 <tiles:insertAttribute name="header"/>
 </td>
 </tr>
<tr height="60%">
 <td width="20%">
 <tiles:insertAttribute name="menu"/>
 </td>
 <td width="80%">
 <tiles:insertAttribute name="body"/>
 </td>
</tr>
<tr height="20%">
 <td colspan="2" align="center">
 <tiles:insertAttribute name="footer"/>
 </td>
</tr>
</table>
</body>
</html>