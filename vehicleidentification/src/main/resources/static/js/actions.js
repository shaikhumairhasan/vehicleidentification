function confirmation(number){
	if(confirm("Are you sure you want to delete ?")){
		window.location.href = "/admin/delete/" + number;
	}
}