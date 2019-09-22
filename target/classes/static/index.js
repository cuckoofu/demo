$(document).ready(function() {
	$(".login").click(function() {
		console.log($("#username")[0].value);
		console.log($("#password")[0].value);
		$.ajax({
			url: "http://localhost:8080/login",
			type: "get",
			async: false,
			data: {
				userName: $("#username")[0].value,
				password: $("#password")[0].value
			},
			dataType: "json",
			success: function(data) {
				if (data == "success") {
					alert("登陆成功");
				} else {
					alert("登陆失败");
				}
			}
		});
	});

	$(".back-main").click(function(){
//        $(".view-list").show();
//        $(".detail-field").css("display","none");
//        $(".add-field").css("display","none");
        window.location.href="http://localhost:8080/index";
	})

	$(".add-field-button").click(function(){
        $(".view-list").css("display","none");
        $(".detail-field").css("display","none");
        $(".add-field").show();
	})

//	$(".saveFieldButton").click(function(orgId){
//        console.log($("#fieldName").val());
//        console.log($("#fieldValue").val());
//        $.get("http://localhost:8080/field/save/"+orgId+"/"+$("#fieldName").val()+"/"+$("#fieldValue").val(), function(result){});
//	})
function saveFieldButton(orgId) {
    $.get("http://localhost:8080/field/save/"+orgId+"/"+$("#fieldName").val()+"/"+$("#fieldValue").val(), function(result){});
}

});


function saveFieldButton(orgId) {
    $.get("http://localhost:8080/field/save/"+orgId+"/"+$("#fieldName").val()+"/"+$("#fieldValue").val(), function(result){
         window.location.href="http://localhost:8080/field/"+orgId;
    });
}