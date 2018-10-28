<%--
  Created by IntelliJ IDEA.
  User: 周路棋
  Date: 2018/10/28
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <!DOCTYPE html>
  <html>
  <head lang="en">
  <meta charset="UTF-8">
  <title>学生信息管理系统</title>
  <meta charset="UTF-8">
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
  <title>学生信息管理系统</title>
  <link href="/style/main1.css" rel="stylesheet">
  <!-- Bootstrap -->
  <link href="/style/bootstrap.css" rel="stylesheet">

  <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
  <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
  <!--[if lt IE 9]>
  <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
  <![endif]-->
  <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
  <script src="/js/jquery.js"></script>
  <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
  <script src="/js/bootstrap.js"></script>
  <script src="/js/main.js"></script>
  </head>
  <body onload="data1()">
  <div class="wrapper">
  <div class="container-fluid content">
  <div class="tit">
  <img src="/img/tit.jpg">
  </div>

  <nav class="navbar navbar-default" role="navigation">
  <div class="container-fluid">
  <div class="navbar-header">
  <a class="navbar-brand" href="#">信息管理</a>
  </div>
  <div>
  <ul class="nav navbar-nav">
  <li class="active"><a href="#">学生信息</a></li>
  <li><a href="#">老师信息</a></li>
  <li><a href="#">档案管理</a></li>
  </ul>
  </div>
  </div>
  </nav>

  <div class="searchBox">
  <form id="fm" class="bs-example bs-example-form" role="form" action="${pageContext.request.contextPath}/student/selectStudentBy">
  <div class="row" style="margin:50px 0 0 0">
  <input type="text" name="name" value="${name}" class="form-control" placeholder="请输入姓名" style="float:left; max-width:260px; margin:0 20px 0 80px;">
  <input type="text" name="id" value="${id}" class="form-control" placeholder="请输入学号" style="float:left; max-width:260px;">
      <button class="btn btn-success ml15" onclick="commitBy()">查询</button>
  <button class="btn btn-warning ml15 popover-show" onclick="show()">
  添加
  </button>
  <div id="bg2">
  <div class="modal-dialog" style="position: absolute; top:50%; left:50%; margin:-150px 0 0 -200px; background: #fff;" >
  <div class="modal-content" id="addBox">
  <div class="modal-header">
  <div class="input-group">
  <span class="input-group-addon">姓名：</span>
  <input type="text" class="form-control" style="max-width:200px;">
  </div>
  <div class="input-group" style="margin-top:10px;">
  <span class="input-group-addon">年龄：</span>
  <input type="text" class="form-control" style="max-width:200px;">
  </div>
  <div class="input-group" style="margin-top:10px;">
  <span class="input-group-addon">学号：</span>
  <input type="text" class="form-control" style="max-width:200px;">
  </div>
  <div class="input-group" style="margin-top:10px;">
  <span class="input-group-addon">班级：</span>
  <input type="text" class="form-control" style="max-width:200px;">
  </div>
  <div class="input-group" style="margin-top:10px;">
  <span class="input-group-addon">导员：</span>
  <input type="text" class="form-control" style="max-width:200px;">
  </div>
  <div class="input-group" style="margin-top:10px;">
  <span class="input-group-addon">创建时间：</span>
  <input id="time1" type="text" class="form-control" style="max-width:200px;">
  </div>
  <div class="input-group" style="margin-top:10px;">
  <span class="input-group-addon">入学年份：</span>
  <input type="text" class="form-control" style="max-width:200px;">
  </div>
  </div>
  <div class="modal-footer">
  <button type="button" class="btn btn-default" data-dismiss="modal" onclick="hideDiv('addBox')">取消
  </button>
  <button type="button" class="btn btn-primary">
  确定添加
  </button>
  </div>
  </div><!-- /.modal-content -->
  </div><!-- /.modal -->
  </div>
  </div>
  </form>
  </div>
  <div class="main">
  <table class="table table-striped table-hover">
  <thead>
  <tr>
  <th>#</th>
  <th>姓名</th>
  <th>年龄</th>
  <th>学号</th>
  <th>班级</th>
  <th>导员</th>
  <th>创建时间</th>
  <th>入学年份</th>
  <th colspan="2">操作</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="student" items="${ students }">

      <tr>
        <td>
          <input type="checkbox">
        </td>
        <td>${student.name}</td>
        <td>${student.age}</td>
        <td>${student.id}</td>
        <td>${student.classNumber}</td>
        <td>${student.teacher}</td>
        <td>${student.creatDate}</td>
        <td>${student.enrollmentYear}</td>
        <td><a>修改</a></td>
        <td><a>删除</a></td>
      </tr>

  </c:forEach>
  </tbody>
  </table>
  </div>
  </div>
  </div>
  </body>
  </html>
