<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/7/6
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script>
    $(function () {
        var toolbar = [{
            iconCls: "icon-edit",
            text: "添加",
            handler: function () {
                $("#dd").dialog("open");
            }
        }, '-', {
            iconCls: "icon-help",
            text: "修改",
            handler: function () {
                var row = $("#BannerMain").edatagrid("getSelected");
                if (row != null){
                   var index = $("#BannerMain").edatagrid("getRowIndex",row);
                    $("#BannerMain").edatagrid("editRow",index);
                }else{
                    alert("请先选中行")
                }
            }
        }, '-', {
            iconCls: "icon-edit",
            text: "删除",
            handler: function () {
                var row = $("#BannerMain").edatagrid("getSelected");
                if (row != null){
                    var index = $("#BannerMain").edatagrid("getRowIndex",row);
                    $("#BannerMain").edatagrid("destroyRow",index);
                }else {
                    alert("请先选中行")
                }
            }
        }, '-', {
            iconCls: "icon-edit",
            text: "保存",
            handler: function () {
                $("#BannerMain").edatagrid("saveRow");
            }

        }
        ]



        $('#BannerMain').edatagrid({
            url:"${pageContext.request.contextPath}/Banner/QueryAll",
            method:"get",
            columns:[[
                {field:"bannerStatus",title:"状态",width:100,editor:{
                    type:"text",
                    options:{
                        required:true
                    }
                }
                },
                {field:"bannerDescription",title:"描述",width:100,editor:{
                    type:"text",
                    options:{
                        required:true
                    }
                }},
                {field:"bannerCreattime",title:"时间",width:100,align:"right"
                }
            ]],
            fit:true,
            fitColumns:true,
            pagination:true,
            pageSize:2,
            pageList:[2,5,10,20],
            toolbar:toolbar,
            updateUrl:"${pageContext.request.contextPath}/Banner/Update",
            destroyUrl:"${pageContext.request.contextPath}/Banner/Delete",
            view: detailview,
            detailFormatter: function(rowIndex, rowData){
                return '<table><tr>' +
                    '<td rowspan=2 style="border:0"><img src="${pageContext.request.contextPath}/banner/' +rowData.bannerPicname+ '" style="height:50px;"></td>' +
                    '<td style="border:0">' +
                    '<p>Attribute: ' + rowData.bannerCreattime + '</p>' +
                    '<p>Status: ' + rowData.bannerStatus + '</p>' +
                    '</td>' +
                    '</tr></table>';
            }
        })
    })
    
    function submit() {

        $("#ff").form("submit",{
            url:"${pageContext.request.contextPath}/Banner/Add",
            onSubmit:function(){
                return $("#ff").form("validate");
            },
            success:function(){
                $("#BannerMain").datagrid("reload");
                $.messager.show({
                    title:'提示',
                    msg:'添加成功',
                });
            },
        });

        $('#dd').dialog('close');

    }
</script>



<table id="BannerMain"></table>

<div id="dd" class="easyui-dialog" title="My Dialog" style="width:400px;height:200px;"
     data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true,buttons:[{
				text:'保存',
				handler:function(){
				submit();
				}
			},{
				text:'关闭',
				handler:function(){
				    $('#dd').dialog('close')
				}
			}]">

<form id="ff" method="post" enctype="multipart/form-data">
        <div>
            <label for="bannerDescription">描述:</label>
            <input id="bannerDescription" class="easyui-validatebox" type="text" name="bannerDescription" data-options="required:true" />
        </div>
        <div>
            <label for="bannerStatus">状态:</label>
            <select id="bannerStatus" class="easyui-combobox" name="bannerStatus" style="width:200px;">
                <option value="可见">展示</option>
                <option value="不可见">不展示</option>
            </select>
        </div>

        <div>
            <label for="file">文件上传:</label>
            <input id="file" class="easyui-filebox" type="text" name="bannerPicpath" data-options="required:true" />
        </div>
    </form>
</div>
<div id="userAdddialog"></div>

