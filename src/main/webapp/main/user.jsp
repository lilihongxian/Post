<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script>
    $(function () {
        var toolbar = [{
            iconCls: "icon-edit",
            text: "全部导出",
            handler: function () {
                /*$.ajax({
                    url:"${pageContext.request.contextPath}/User/PoiExport",
                    type: "post",
                    dataType:"json"
                })*/

                location.href="${pageContext.request.contextPath}/User/PoiExport"
            }
        }, '-', {
            iconCls: "icon-help",
            text: "全部导入",
            handler: function () {
                $("#uu").dialog("open");
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



        $('#UserMain').datagrid({
            url:"${pageContext.request.contextPath}/User/QueryAll",
            method:"get",
            columns:[[
                {field:"userSex",title:"性别",width:100,editor:{
                    type:"text",
                    options:{
                        required:true
                    }
                }
                },
                {field:"userPrivoince",title:"省份",width:100,editor:{
                    type:"text",
                    options:{
                        required:true
                    }
                }},
                {field:"userCteatetime",title:"时间",width:100,align:"right"
                }
            ]],
            fit:true,
            fitColumns:true,
            pagination:true,
            pageSize:2,
            pageList:[2,5,10,20],
            toolbar:toolbar
        })
    })

    function submit() {

        $("#ff").form("submit",{
            url:"${pageContext.request.contextPath}/User/PoiImport",
            onSubmit:function(){
                return $("#ff").form("validate");
            },
            success:function(){
                $("#UserMain").datagrid("reload");
                $.messager.show({
                    title:'提示',
                    msg:'导入成功',
                });
            },
        });

        $('#uu').dialog('close');

    }

</script>

<div id="uu" class="easyui-dialog" title="My Dialog" style="width:400px;height:200px;"
     data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true,buttons:[{
				text:'保存',
				handler:function(){
				submit();
				}
			},{
				text:'关闭',
				handler:function(){
				    $('#uu').dialog('close')
				}
			}]">

    <form id="ff" method="post" enctype="multipart/form-data">

        <div>
            <label for="file">文件上传:</label>
            <input id="file" class="easyui-filebox" type="text" name="file" data-options="required:true" />
        </div>
    </form>
</div>


<table id="UserMain"></table>
