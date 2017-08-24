<%@include file="header.jsp" %>
<div class="page-data">
         <div class="datagrid">
            <table>
				<thead>
					<tr>
						<th>ID</th>
						<th>Title</th>
						<th>Speaker</th>
						<th>Location</th>
						<th>Start Time</th>
						<th>End Time</th>
						<th>Action</th>
					</tr>                               
				</thead>
<tfoot>
	<tr>
		<td colspan="7">
			<div id="paging">
						<ul>
					<a class="btn" href="/add">Add New Session Details</a>
				</ul>
			</div>
		</tr>
	</tfoot>                                                  
<tbody>

<c:choose>	
<c:when test="${not empty ConferenceSessions}">

			<c:forEach var="listValue" items="${ConferenceSessions}">
			<tr>
			
				<td>${listValue.id}</td>
				<td>${listValue.title}</td>
				<td>${listValue.speaker}</td>
				<td>${listValue.location}</td>
				<td>${listValue.startTime}</td>
				<td>${listValue.endTime}</td>
				<td>
                        <a class="btn" href="update/${listValue.id}">Update</a>                       
                        <a class="btn" href="delete/${listValue.id}" style="float: right; background-color: #ff0000">Delete</a>                       
                    </td>
			</tr>
			</c:forEach>

	</c:when>
	<c:otherwise>
	<tr>
                    <td colspan="7">No sessions found for the conference</td>
                 </tr>
	</c:otherwise>
</c:choose>
	</tbody>           
            </table>
            
		</div>
<%@include file="footer.jsp" %>