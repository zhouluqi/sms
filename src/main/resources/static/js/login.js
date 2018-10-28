/*
	@zheng_yq@suixingpay.com
 */
var user = $('user');
var pass = $('pass');
var oBtn = $('btn_login');
var popupBox = $('popupBox');
function disa(){
	oBtn.disabled = true; 
}
//密码框输入函数
pass.onkeyup = function(){
	if (pass.value.length != 0) { //当密码框值长度不为0，解禁登录按钮
		oBtn.disabled = false; 
		oBtn.style.backgroundColor = 'blue';
	}
}
//点击登录按钮判断是否成功
oBtn.onclick = function(){
	if (user.value == 'test' && pass.value == '111111') {
		popupBox.innerHTML = "登录成功，2s后跳转至学生信息管理系统";
		popupBox.style.display = 'block';
		//2s后跳转至学生管理系统页面
		setTimeout(function(){
			popupBox.style.display = 'none';
		},2000);

	}else{
		popupBox.innerHTML = "您输入的账号或密码有误，请重新输入";
		popupBox.style.display = 'block';
		setTimeout(function(){
			popupBox.style.display = 'none';
		},2000);
	}
}

//封装获取dom节点函数
function $(dom){
	return document.getElementById(dom);
}