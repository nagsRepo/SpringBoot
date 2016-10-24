$(document).ready(function(){
	$('#GetEmployees').click(function(){
		$.getJSON('http://localhost:8080/getEmployees' , function(data){
			if(data){
				var text = " ";			
				for(var i=0; i< data.length;i++){
					text += "<tr>"+"<td>"+data[i].name+"</td>"+"<td>"+data[i].salary+"</td>"+"<td>"+data[i].age+"</td>"+"<td>"+data[i].social+"</td>"+"</tr>";
				}
				$('#tablebody').html(text)
			}
		});
	});
});