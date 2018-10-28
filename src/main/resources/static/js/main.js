/**
 * Created by Administrator on 2018/10/28.
 */

function showAddBox(){
    var addBox = document.getElementById("addBox");
    addBox.style.display = "block";
}
function data1(){
    var date = new Date();
    var year = date.getFullYear();
    var mongth = date.getMonth()+1;
    var day = date.getDate();
    var time1 = document.getElementById("time1");
    time1.value = year + "-" + mongth + "-" + day;
}

    function hideDiv(){
        $("#addBox").css("display","none");
        $("#bg2").css("display","none");
    }
function show(){
    $(function(){
        $("#bg2").show().fadeTo(2000,.9);
        $("#addBox").delay(1000).show();
    });
}