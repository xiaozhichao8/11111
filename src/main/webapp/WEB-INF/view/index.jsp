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
	<title>电商</title>
	
	<!-- Bootstrap -->
    <link href="<%=request.getContextPath() %>/js/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<!--zTree  -->	
	<link rel="stylesheet" href="<%=request.getContextPath() %>/js/ztree/css/demo.css" type="text/css">
	<link rel="stylesheet" href="<%=request.getContextPath() %>/js/ztree/css/zTreeStyle/zTreeStyle.css" type="text/css">
	<!--dataTable  -->
	<link rel="stylesheet" href="<%=request.getContextPath() %>/js/dataTable/DataTables-1.10.18/css/jquery.dataTables.min.css" type="text/css">
	<!--datetime  -->
	<link rel="stylesheet" href="<%=request.getContextPath() %>/js/bootstrap-datetime/css/bootstrap-datetimepicker.min.css" type="text/css">
	
	
</head>
<body>
<!--部门增加表单  -->
<div id="addDeptForm" style="display: none;" >
	<form class="form-horizontal">
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-3 control-label">上级部门名</label>
		    <div class="col-sm-5">
		      <input type="email" class="form-control" id="add_fathedeptName" readonly="readonly">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword3" class="col-sm-3 control-label">部门名</label>
		    <div class="col-sm-5">
		      <input type="text" class="form-control" id="add_deptName" placeholder="部门名">
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <label for="inputPassword3" class="col-sm-3 control-label">创建时间</label>
		    <div class="col-sm-5">
		      <input type="text" class="form-control" id="add_establishTime" placeholder="创建时间" date="datetimepicker">
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <label for="inputPassword3" class="col-sm-3 control-label">部门描述</label>
		    <div class="col-sm-5">
		      <textarea rows="1" class="form-control" id="add_description"></textarea>
		    </div>
		  </div>
		  
		  
	</form>
</div>
<!--部门修改表单  -->
<div id="DeptEditForm" style="display: none;" >
	<form class="form-horizontal">
		  <div class="form-group">
		    <label for="inputPassword3" class="col-sm-3 control-label">部门名</label>
		    <div class="col-sm-5">
		      <input type="text" class="form-control" id="Edit_deptName">
		      <input type="hidden" class="form-control" id="Edit_deptId">
		    </div>
		  </div>
		   <div class="form-group">
		    <label for="inputPassword3" class="col-sm-3 control-label">创建时间</label>
		    <div class="col-sm-5">
		      <input type="text" class="form-control" id="Edit_establishTime" placeholder="创建时间" date="datetimepicker">
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <label for="inputPassword3" class="col-sm-3 control-label">部门描述</label>
		    <div class="col-sm-5">
		      <textarea rows="1" class="form-control" id="Edit_description"></textarea>
		    </div>
		  </div>
	</form>
</div>




<!--员工增加表单  -->
<div id="addEmpForm" style="display: none;" >
	<form class="form-horizontal">
		  <div class="form-group">
		    <label for="inputPassword3" class="col-sm-3 control-label">员工名</label>
		    <div class="col-sm-5">
		      <input type="text" class="form-control" id="add_ename" placeholder="员工名">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword3" class="col-sm-3 control-label">性别</label>
		    <div class="col-sm-5">
                   <input type="radio" name="add_sex" value="0" />女
                   <input type="radio" name="add_sex" value="1" />男
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword3" class="col-sm-3 control-label">薪资</label>
		    <div class="col-sm-5">
		      <input type="text" class="form-control" id="add_pay" placeholder="薪资">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword3" class="col-sm-3 control-label">员工生日</label>
		    <div class="col-sm-5">
		      <input type="text" class="form-control" id="add_birthday" placeholder="员工生日" date="datetimepicker" />
		    </div>
		  </div>
	</form>
</div>
<!--员工修改表单  -->
<div id="editEmpForm" style="display: none;" >
	<form class="form-horizontal">
		  <div class="form-group">
		    <label for="inputPassword3" class="col-sm-3 control-label">员工名</label>
		    <div class="col-sm-5">
		      <input type="text" class="form-control" id="Edit_ename" placeholder="员工名">
		      <input type="text" class="form-control" id="Edit_id" >
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword3" class="col-sm-3 control-label">性别</label>
		    <div class="col-sm-5">
                   <input type="radio" name="Edit_sex" value="0" />女
                   <input type="radio" name="Edit_sex" value="1" />男
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword3" class="col-sm-3 control-label">薪资</label>
		    <div class="col-sm-5">
		      <input type="text" class="form-control" id="Edit_pay" placeholder="薪资">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword3" class="col-sm-3 control-label">员工生日</label>
		    <div class="col-sm-5">
		      <input type="text" class="form-control" id="Edit_birthday" placeholder="员工生日" date="datetimepicker" />
		    </div>
		  </div>
	</form>
</div>


	
	<div class="container-fluid">
		<div class="row">
			 <div class="col-md-4">
			 	<div class="panel panel-warning">
			 		<div class="panel-heading">部门管理
			 			<button type="button" class="btn btn-primary" onclick="addDept()" ><span class="glyphicon glyphicon-plus" aria-hidden="true"></span>增加</button>
			 			<button type="button" class="btn btn-info" onclick="EditDept()" ><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改</button>
			 			<button type="button" class="btn btn-danger" onclick="delDept()" ><span class="glyphicon glyphicon-trash" aria-hidden="true"></span>删除</button>
			 		</div>
			 		<ul id="treeDept" class="ztree"></ul>
			 	</div>
			 </div>
			 <div class="col-md-8">
				 	<div class="panel panel-danger">
	  					<div class="panel-heading">条件查询</div>
	  					<form class="form-horizontal">
						  <div class="form-group">
						    <label for="inputEmail3" class="col-sm-3 control-label">员工名</label>
						    <div class="col-sm-5">
						      <input type="text" class="form-control" id="condition_ename" placeholder="员工名">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputEmail3" class="col-sm-3 control-label">性别</label>
						    <div class="col-sm-5">
	                                 <input type="radio" name="condition_sex" value="0" />女
	                                 <input type="radio" name="condition_sex" value="1" />男
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputEmail3" class="col-sm-3 control-label">生日</label>
						    <div class="col-sm-5">
						    	<div class="input-group">
						    		<input type="text" id="condition_startBirthday" class="form-control" date="datetimepicker" />
								      <span class="input-group-addon">
								      	<span class="glyphicon glyphicon-resize-horizontal" aria-hidden="true"></span>
								      </span>
							      	<input type="text" id="condition_endBirthday" class="form-control" date="datetimepicker"/>
						    	</div>	
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputEmail3" class="col-sm-3 control-label">薪资</label>
						    <div class="col-sm-5">
						    	<div class="input-group">
						    		<input type="text" class="form-control" id="condition_mainPay"/>
								      <span class="input-group-addon">
								      	<span class="glyphicon glyphicon-yen" aria-hidden="true"></span>
								      </span>
							      	<input type="text" class="form-control" id="condition_maxPay" />
						    	</div>	
						    </div>
						  </div>
						  
						  <div class="form-group">
						    <label for="inputEmail3" class="col-sm-3 control-label"></label>
						    <div class="col-sm-5">
						    		<button type="button" class="btn btn-primary" onclick="conditionQuery()"><span class="glyphicon glyphicon-search" aria-hidden="true"></span>查询</button>
						    		<button type="reset" class="btn btn-primary"><span class="glyphicon glyphicon-repeat" aria-hidden="true"></span>取消</button>
						    </div>
						  </div>
						</form>
	  				</div>
	  				
	  				<button type="button" class="btn btn-primary" onclick="addEmp()" ><span class="glyphicon glyphicon-plus" aria-hidden="true"></span>增加</button>
	  				<button type="button" class="btn btn-info" onclick="editEmp()" ><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改</button>
	  				<button type="button" class="btn btn-link" onclick="deleteEmp()" ><span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除</button>
	  				<div class="panel panel-danger">
	  					 <div class="panel-heading">员工列表</div>
	  						<table id="empTable" class="row-border" style="width:100%">
						        <thead>
						            <tr>
						            	 <th></th>
						                <th>id</th>
						                <th>员工名</th>
						                <th>性别</th>
						                <th>生日</th>
						                <th>薪资</th>
						            </tr>
						        </thead>
						    </table>
	  				</div>
			 </div>
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
    <!--dataTable  -->
    <script src="<%=request.getContextPath() %>/js/dataTable/DataTables-1.10.18/js/jquery.dataTables.min.js"></script>
    <!--datetime  -->
    <script src="<%=request.getContextPath() %>/js/bootstrap-datetime/js/bootstrap-datetimepicker.min.js"></script>
    <script src="<%=request.getContextPath() %>/js/bootstrap-datetime/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
      
      
    <script type="text/javascript">
		$(function(){
			initZtree();
			initTable();
			inintdatetime();
		})
		
		function inintdatetime(){
			 //日期插件
		    $('[date="datetimepicker"]').datetimepicker({
		        format          : 'yyyy-mm-dd', //日期格式，默认值: 'mm/dd/yyyy'
		        weekStart       : 1,            //设置一周从哪一天开始，默认值0（星期日）到6（星期六）
		        startDate       : '0001-01-01', //Date. 默认值：起始时间	
		        endDate         : new Date(),   //截至时间
		        todayHighlight  : true,         //今天高亮
		        todayBin        : 'linked',     //当天日期将会被选中
		        minView         : 'month',      //日期时间选择器所能够提供的最精确的时间选择视图,默认值：0, 'hour'
		        maxView         : 4,            //日期时间选择器最高能展示的选择范围视图 默认值：4, 'decade'
		        startView       : 2,            //日期时间选择器打开之后首先显示的视图。可接受的值：2(month)
		        language        : 'zh-CN',      //设置插件的语言
		        forceParse      : 1,            //当选择器关闭的时候，是否强制解析输入框中的值
		        showMeridian    : 1,            //该选项将启用每日和小时视图的子视图
		        autoclose       : true          //当选择一个日期之后是否立即关闭此日期时间选择器
		    });
		}
		
		
		function initZtree(){
			$.ajax({
				type:'post',
				url:'<%=request.getContextPath()%>/dept/findDeptList',
				success:function(result){
					if (result.status =="ok") {
						var setting = {
								data: {
									simpleData: {
										enable: true
									}
								}
							};
						$.fn.zTree.init($("#treeDept"), setting, result.data);
					}
				}
			})
		}
		function addDept(){
			var treeObj = $.fn.zTree.getZTreeObj("treeDept");
			var nodes = treeObj.getSelectedNodes();
			if (nodes.length==1) {
				//从节点中获得的 id name 值
			 	var v_id=nodes[0].id;
				var v_name=nodes[0].name;
				$("#add_fathedeptName").val(v_name);
				
				var addDialog = bootbox.dialog({
					title: '添加部门',
					message: $("#addDeptForm form").clone(),
					buttons: {
					    ok: {
					        label: "确定",
					        className: 'btn-info',
					        callback: function(){
					        	var param={};
					        	param.fatherId=v_id;
					        	param.deptName=$("#add_deptName",addDialog).val();
					        	param.establishTime=$("#add_establishTime",addDialog).val();
					        	param.description=$("#add_description",addDialog).val();
									$.ajax({
										type:'post',
										url:"<%=request.getContextPath()%>/dept/add",
										data:param,
										success:function(result){
											if (result.status=="ok") {
												var newNodes={};
												newNodes.id=result.data.id;
												newNodes.name=result.data.deptName;
												newNodes.pId=result.data.fatherId;
												newNodes.establishTime=result.data.establishTime;
												newNodes.description=result.data.description;
												
												treeObj.addNodes(nodes[0], newNodes);
											}else{
												bootbox.alert({
												    message: "添加部门失败",
												    className: 'bb-alternate-modal'
												});
											}
										}
									}) 
					        }
					    },
						 cancel: {
						        label: "取消",
						        className: 'btn-danger',
						    }
					}
				});
				inintdatetime();
			}else if (nodes.length==0) {
				bootbox.alert({
				    message: "请选择部门",
				    className: 'bb-alternate-modal'
				});
			}else{
				bootbox.alert({
				    message: "请选择一个部门",
				    className: 'bb-alternate-modal'
				});
			}
		}
		
		
		function EditDept(){
			var treeObj = $.fn.zTree.getZTreeObj("treeDept");
			var nodes = treeObj.getSelectedNodes();
			if (nodes.length==1) {
				//从节点中获得 id name 的值
				var v_id=nodes[0].id;
				var v_name=nodes[0].name;
				var v_establishTime=nodes[0].establishTime;
				var v_description=nodes[0].description;
				
				$("#Edit_deptName").val(v_name);
				$("#Edit_deptId").val(v_id);
				$("#Edit_establishTime").val(v_establishTime);
				$("#Edit_description").val(v_description);
				
				var EditDialog = bootbox.dialog({
					title: '修改部门',
					message: $("#DeptEditForm form").clone(),
					buttons: {
					    ok: {
					        label: "确定",
					        className: 'btn-info',
					        callback: function(){
								var param={};
								param.id=$("#Edit_deptId",EditDialog).val();
								param.deptName=$("#Edit_deptName",EditDialog).val();
								param.establishTime=$("#Edit_establishTime",EditDialog).val();
								param.description=$("#Edit_description",EditDialog).val();
								$.ajax({
									type:'post',
									url:'<%=request.getContextPath()%>/dept/update',
									data:param,
									success:function(result){
										if (result.status=="ok") {
											nodes[0].name = $("#Edit_deptName",EditDialog).val();
											nodes[0].establishTime = $("#Edit_establishTime",EditDialog).val();
											nodes[0].description = $("#Edit_description",EditDialog).val();
											treeObj.updateNode(nodes[0]);
										}else{
											bootbox.alert({
											    message: "修改部门失败",
											    className: 'bb-alternate-modal'
											});
										}
									}
									
								})	
					        }
					    },cancel: {
					        label: "取消",
					        className: 'btn-danger',
					    }
					}
					});
				inintdatetime();
			}else if (nodes.length==0) {
				bootbox.alert({
				    message: "请选择要修改的部门",
				    className: 'bb-alternate-modal'
				});
			}else{
				bootbox.alert({
				    message: "请选择一个部门修改",
				    className: 'bb-alternate-modal'
				});
			}
		}

		function delDept(){
			var treeObj = $.fn.zTree.getZTreeObj("treeDept");
			var nodes = treeObj.getSelectedNodes();
			if (nodes.length==0) {
				bootbox.alert({
				    message: "请选择要删除的部门",
				    className: 'bb-alternate-modal'
				});
			}else {
				bootbox.confirm({
				    message: "这样会删除当前部门下的所有子部门，你确定要删除吗？",
				    buttons: {
				        confirm: {
				            label: '确定',
				            className: 'btn-success'
				        },
				        cancel: {
				            label: '取消',
				            className: 'btn-danger'
				        }
				    },
				    callback: function (result) {
				        if (result==true) {
								console.log(nodesList);
								var str=[];
								var deleteNodes=[];
								for (var i = 0; i < nodes.length; i++) {
								 	var node=nodes[i];
								 	 /*将 zTree 节点数据转换为简单 Array 格式*/						
									 var nodesList = treeObj.transformToArray(node);
								 	for (var j = 0; j < nodesList.length; j++) {
								 		str.push(nodesList[j].id);
								 		deleteNodes.push(nodesList[j])
									}
								}
								$.ajax({
									type:'post',
									url:'<%=request.getContextPath()%>/dept/delete',
									data:{"str":str},
									success:function(result){
										if (result.status=="ok") {
											for (var i=deleteNodes.length;i >= 0; i--) {
												treeObj.removeNode(deleteNodes[i]);
											}
										}else {
											bootbox.alert({
											    message: "删除部门操作失败",
											    className: 'bb-alternate-modal'
											});
										}
									}
								})
						}
				    }
				});
			}
		}
		var v_inquireEmp;
		var v_checkboxs=0;
		function initTable(){
			v_inquireEmp=$('#empTable').DataTable({
				 // 是否允许检索
	            "searching": false,
	            // 是否允许排序
	            "ordering": true,
				"processing": true,
		        "serverSide": true,
		        "lengthMenu": [5, 10, 15, 20, 25],
		        "ajax": {
		        	type:'post',
		            "url": "<%=request.getContextPath()%>/emp/findEmpList",
		        },
		        "language": { 
		        	"url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Chinese.json" 
		        	},
		        "columns": [
		             {
		            	 "data": "id",
		            	 "orderable": false, 
	            		 "render": function (data) {
	            			 return '<input type="checkbox" value="'+data+'"/>';
		            		}
		             },
		            {
		            	"data": "id"
		            },
		            {"data": "ename"},
		            {
		            	"data": "sex",
		            		"render": function (data) {
		            			if (data==0) {
									return "女";
								}else{
									return "男";
								}
		            		}
		            },
		            {"data": "birthday"},
		            {"data": "pay"},
		        ]
			});
			v_inquireEmp.on( 'click', 'tbody tr', function () {
				//$('#empTable input[type="checkbox"]')
				var v_trs=$('#empTable tbody').find("tr");
				//console.log(v_tr[0]);
				for (var i = 0; i < v_trs.length; i++) {
					var v_tr=v_trs[i];
					if ($(v_tr).find("td input[type='checkbox']").prop("checked")) {
						var v_checkbox=$(v_tr).find("td input[type='checkbox']");
						v_checkbox.prop("checked",false);
						$(v_tr).css({color:'',background:''})
						v_checkboxs=0;
					}else {
						var v_checkbox=$(this).find("td input[type='checkbox']");
					 	if (v_checkbox.prop("checked")) {
					 		v_checkbox.prop("checked",false);
					 		$(this).css({color:'',background:''})
					 		v_checkboxs=0;
						}else{
							v_checkbox.prop("checked",true);
							$(this).css({color:'#4D0000',background:'#28004D'});
							v_checkboxs=$(this).find("td").eq(1).html();
						}
					}
				}
				
				var v_id=$(this).find("td").eq(1).html();
				
				
				var v_ename=$(this).find("td").eq(2).html();
				
				var v_sex;
				if ($(this).find("td").eq(3).html()=="男") {
					v_sex=1;
				}else {
					v_sex=0;
				}
				
				var v_birthday=$(this).find("td").eq(4).html();
				var v_pay=$(this).find("td").eq(5).html();
					
				$("#Edit_id").val(v_id);
				$("#Edit_ename").val(v_ename);
				
				var v_sexS=$('#editEmpForm  input[name="Edit_sex"]');
				for (var i = 0; i < v_sexS.length; i++) {
					if (v_sexS[i].value==v_sex) {
						v_sexS[i].checked=true;
					}
				}
				$("#Edit_birthday").val(v_birthday);
				$("#Edit_pay").val(v_pay);
			}); 
		}
		/*条件查询  */
		function conditionQuery(){
			var v_ename=$("#condition_ename").val();
			var v_sex=$('[name="condition_sex"]:checked').val();
			var v_startBirthday=$("#condition_startBirthday").val();
			var v_endBirthday=$("#condition_endBirthday").val();
			var v_mainPay=$("#condition_mainPay").val();
			var v_maxPay=$("#condition_maxPay").val();
			
			var param={};
			param.ename=v_ename;
			param.sex=v_sex;
			param.startBirthday=v_startBirthday;
			param.endBirthday=v_endBirthday;
			param.mainPay=v_mainPay;
			param.maxPay=v_maxPay;
			
			v_inquireEmp.settings()[0].ajax.data=param;
			v_inquireEmp.ajax.reload();
		}
		
		function addEmp(){
			var addEmpDialog=bootbox.dialog({
				title: '员工新增',
				message:$("#addEmpForm form").clone(),
				size:"large",
				closeButton:false,
				buttons: {
				    cancel: {
				        label: "取消",
				        className: 'btn-danger',
				    },
				    ok: {
				        label: "确认",
				        className: 'btn-info',
				        callback: function () {
				        	var param={};
				        	param.ename=$("#add_ename",addEmpDialog).val();
				        	param.sex=$('[name="add_sex"]:checked',addEmpDialog).val();
				        	param.pay=$("#add_pay",addEmpDialog).val();
				        	param.birthday=$("#add_birthday",addEmpDialog).val();
				        	console.log(param);
				        	$.ajax({
				        		type:'post',
				        		url:'<%=request.getContextPath()%>/emp/addEmp',
				        		data:param,
				        		success:function(result){
				        			if (result.status=="ok") {
				        				//v_inquireStaff.fnDraw(false);
				        				conditionQuery();
									}
				        		}
				        	})
					    }
				    },
				}
			});
			inintdatetime();
		}
		function editEmp(){
			if (v_checkboxs!=0) {
				var editEmpDialog=bootbox.dialog({
					title: '员工修改',
					message:$("#editEmpForm form").clone(),
					size:"large",
					closeButton:false,
					buttons: {
					    cancel: {
					        label: "取消",
					        className: 'btn-danger',
					    },
					    ok: {
					        label: "确认",
					        className: 'btn-info',
					        callback: function () {
					        	var param={};
					        	param.id=$("#Edit_id",editEmpDialog).val();
					        	param.ename=$("#Edit_ename",editEmpDialog).val();
					        	param.sex=$('[name="Edit_sex"]:checked',editEmpDialog).val();
					        	param.pay=$("#Edit_pay",editEmpDialog).val();
					        	param.birthday=$("#Edit_birthday",editEmpDialog).val();
					        	console.log(param);
					        	$.ajax({
					        		type:'post',
					        		url:'<%=request.getContextPath()%>/emp/updateEmp',
					        		data:param,
					        		success:function(result){
					        			if (result.status=="ok") {
					        				//v_inquireStaff.fnDraw(false);
					        				conditionQuery();
					        				v_checkboxs=0;
					        				bootbox.alert({
					        				    message: "修改员工成功",
					        				    className: 'bb-alternate-modal'
					        				});
										}
					        		}
					        	})
						    }
					    },
					}
				});
				inintdatetime();
			}
			else {
				bootbox.alert({
				    message: "请选择要修改的员工",
				    className: 'bb-alternate-modal'
				});
			}
		}
		function deleteEmp(){
			if (v_checkboxs!=0) {
				bootbox.confirm({
				    title: "删除员工",
				    message: "你却定要删除这位员工吗？？？？？？",
				    buttons: {
				        cancel: {
				            label: '<i class="fa fa-times"></i> 取消'
				        },
				        confirm: {
				            label: '<i class="fa fa-check"></i> 确认'
				        }
				    },
				    callback: function (result) {
				        console.log('This was logged in the callback: ' + result);
				        if (result) {
							$.ajax({
								type:'post',
								url:'<%=request.getContextPath()%>/emp/deleteEmp',
								data:{"id":v_checkboxs},
								success:function(result){
									if (result.status=="ok") {
				        				//v_inquireStaff.fnDraw(false);
				        				conditionQuery();
				        				v_checkboxs=0;
				        				bootbox.alert({
				        				    message: "删除员工成功",
				        				    className: 'bb-alternate-modal'
				        				});
									}else {
										conditionQuery();
				        				v_checkboxs=0;
										bootbox.alert({
				        				    message: "删除员工失败",
				        				    className: 'bb-alternate-modal'
				        				});
									}
								}
							})
						}
				    }
				});
			}else {
				bootbox.alert({
				    message: "请选择要删除的员工",
				    className: 'bb-alternate-modal'
				});
			}
		}

	</script>
</body>
</html>