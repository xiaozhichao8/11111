<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN" >
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>地区</title>
	<!-- Bootstrap -->
    <link href="<%=request.getContextPath() %>/js/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<!--zTree  -->	
	<link rel="stylesheet" href="<%=request.getContextPath() %>/js/ztree/css/demo.css" type="text/css">
	<link rel="stylesheet" href="<%=request.getContextPath() %>/js/ztree/css/zTreeStyle/zTreeStyle.css" type="text/css">
	
</head>
<body>

<!--部门增加表单  -->
<div id="addAreaForm" style="display: none;" >
	<form class="form-horizontal">
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-3 control-label">上级部门名</label>
		    <div class="col-sm-5">
		      <input type="email" class="form-control" id="add_fatheAreaName" readonly="readonly">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword3" class="col-sm-3 control-label">部门名</label>
		    <div class="col-sm-5">
		      <input type="text" class="form-control" id="add_AreaName" placeholder="部门名">
		    </div>
		  </div>
	</form>
</div>


	<div class="container-fluid">
		<div class="row">
			 <div class="col-md-4">
			 	<div class="panel panel-warning">
			 		<div class="panel-heading">
			 			地区管理
			 			<button type="button" class="btn btn-primary" onclick="addArea()" ><span class="glyphicon glyphicon-plus" aria-hidden="true"></span>增加</button>
			 			<button type="button" class="btn btn-info" onclick="EditArea()" ><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改</button>
			 			<button type="button" class="btn btn-danger" onclick="delArea()" ><span class="glyphicon glyphicon-trash" aria-hidden="true"></span>删除</button>
			 		</div>
			 		<ul id="treeArea" class="ztree"></ul>
			 	</div>
			 </div>
			 <div class="col-md-8">啦啦啦啦</div>
		</div>
	</div>
	
	<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="<%=request.getContextPath() %>/js/jquery-1.12.4.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="<%=request.getContextPath() %>/js/bootstrap/js/bootstrap.min.js"></script>
    <!--ztree  -->
    <script type="text/javascript" src="<%=request.getContextPath() %>/js/ztree/js/jquery.ztree.core.min.js"></script>
    <!--bootbox  -->
    <script src="<%=request.getContextPath() %>/js/bootbox.min.js"></script>
    <script type="text/javascript">
    	$(function(){
    		initArea();
    	})
    	function initArea(){
    		$.ajax({
    			type:'post',
    			url:'<%=request.getContextPath()%>/area/list',
    			success:function(result){
    				if (result.status =="ok") {
						var setting = {
								data: {
									simpleData: {
										enable: true
									}
								}
							};
						$.fn.zTree.init($("#treeArea"), setting, result.data);
					}
    			}
    		})
    	}
    	
    	function addArea(){
    		var treeObj = $.fn.zTree.getZTreeObj("treeArea");
			var nodes = treeObj.getSelectedNodes();
    		if(nodes.length==1){
    				
    			var dialog = bootbox.dialog({
    				title: '添加地区',
    				message: $("#addAreaForm form").clone(),
    				buttons: {
    				    cancel: {
    				        label: "<i class="fa fa-times"></i>取消",
    				        className: 'btn-danger',
    				    },
    				    ok: {
    				        label: "<i class="fa fa-check"></i>确认",
    				        className: 'btn-success',
    				        callback: function(){
								
    				        	
    				        	
    				        }
    				    }
    				}
    			});
    		}else if (nodes.length==0) {
    			bootbox.alert({
    			    message: "请选择上级地区",
    			    backdrop: true,
    			    label: "确定",
    			});
			}else{
				bootbox.alert({
    			    message: "请选择一个上级地区",
    			    backdrop: true,
    			    label: "确定",
    			});
			}
    	}
    	
    </script>
</body>
</html>