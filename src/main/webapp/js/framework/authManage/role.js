var roleColumns = [
    { display: '父角色id', name: 'parentId' },
    { display: '角色名', name: 'roleName' },
    { display: '角色中文名', name: 'roleCnName' },
    { display: '角色说明', name: 'comment' },
    { display: '是否可以继承', name: 'canInherit' }
];

function update(url, grid) {
    let form = $("#form");
    let data = grid.getSelectedRow();
    if(!data) {
        $.ligerDialog.error('请选择更新的行');
        return;
    }
    updataForm(form,data);
    form.off("submit");

    let dialog=openDialog("更新", form);
    form.on("submit", function () {
        $.ajax(url,{
            method:'POST',
            data:JSON.stringify(form.serializeJSON()),
            dataType:'json',
            contentType:"application/json",
            success:function (res) {
                if (res.success) {
                    dialog.hide();
                    $.ligerDialog.success('更新成功');
                    grid.loadData();
                } else {
                    $.ligerDialog.error('更新失败,原因:'+res.errorCodes);
                }
            }
        });
        return false;
    });
}

function updataForm(form,data){
    form.find("#roleId").val(data.id);
    form.find("#roleName").val(data.roleName);
    form.find("#roleCnName").val(data.roleCnName);
    form.find("#comment").val(data.comment);
    form.find("input[value="+data.canInherit+"]").click();
}