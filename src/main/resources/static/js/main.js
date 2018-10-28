/**
 * Created by Administrator on 2018/10/28.
 */

//function showAddBox(){
//    var addBox = document.getElementById("addBox");
//    addBox.style.display = "block";
//}
function data1(){
    var date = new Date();
    var year = date.getFullYear();
    var month = date.getMonth()+1;
    var day = date.getDate();
    var creatDate = document.getElementById("creatDate");
    creatDate.value = year + "-" + month + "-" + day;
}

function hideDiv(){
     $("#addBox").hide();
     $("#bg2").hide();
}
function show(){
    $(function(){
        $("#bg2").show().fadeTo(2000,.9);
        $("#addBox").delay(1000).show();
    });
}
function del(){
    $("#name").val("");
    $("#age").val("");
    $("#sex").val("");
    $("#classNumber").val("");
    $("#teacher").val("");
    $("#EnrollmentYear").val("");
}
function send1(){
    alert("添加成功了");
}
function modify(){
    alert("修改成功");
}


