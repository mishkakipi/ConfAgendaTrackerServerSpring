<%@include file="header.jsp" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

        <div class="datagrid">
            
            <form:form method="post" action="/update/${session_id}" modelAttribute="sessionToUpdate">
                <table cellpadding="8">
                <thead>
					<tr>
						<th>Name</th>
						<th>Value</th>
					</tr>                               
				</thead>
                <tr>
                    <td class="label">Id</td><td><form:input type="text" path="id" value="${sessionToUpdate.id}" /></td>
                 </tr>
                <tr>
                    <td class="label">Title</td><td><form:input type="text" path="title" value="${sessionToUpdate.title}" /></td>
                 </tr>
                <tr>
                    <td class="label">Location</td><td><form:input type="text" path="location" value="${sessionToUpdate.location}" /></td>
                 </tr>                 
                <tr>
                    <td class="label">Speaker</td><td><form:input type="text" path="speaker" value="${sessionToUpdate.speaker}" /></td>
                 </tr>
                <tr>
                    <td class="label">Start Time</td><td><form:input type="text" path="startTime" value="${sessionToUpdate.startTime}" /></td>
                 </tr>
                <tr>
                    <td class="label">End Time</td><td><form:input type="text" path="endTime" value="${sessionToUpdate.endTime}" /></td>
                 </tr>
                <tr>
                    <td class="label">Date</td><td><form:input type="text" path="date" value="${sessionToUpdate.date}" /></td>
                 </tr>

                 <tr>
                    <td class="label"></td>
                    <td>
                        &nbsp; <input type="submit" name="submit" class="btn" value="Save">
                       <a class="btn" href="/">Cancel</a>
                    </td>
                 </tr>
                 <tfoot>
	<tr>
		<td colspan="4">
			<div id="paging">
			</div>
		</tr>
	</tfoot>                                                  
<tbody>
                </table>
            </form:form>
            
        </div>
        
<%@include file="footer.jsp" %>