function add(url) {
    let form = $("#form");
    form.on("submit", function () {
        $.ajax(url,{
            method:'POST',
            data:JSON.stringify(form.serializeJSON()),
            dataType:'json',
            contentType:"application/json",
            success:function (res) {
                if (res.success) {
                    $.ligerDialog.success('增加成功');
                    closeDialog(form);
                    grid.loadData();
                } else {
                    $.ligerDialog.error('增加失败');
                }
            }

        });
        return false;
    });
    openDialog("增加", form);
}

function update(url, grid) {
    let form = $("#form");
    form.on("submit", function () {
        $.ajax(url,{
            method:'POST',
            data:JSON.stringify(form.serializeJSON()),
            dataType:'json',
            contentType:"application/json",
            success:function (res) {
                if (res.success) {
                    $.ligerDialog.success('更新成功');
                    closeDialog(form);
                    grid.loadData();
                } else {
                    $.ligerDialog.error('更新失败');
                }
            }
        });
        return false;
    });

    openDialog("更新", form);
}

function delet(url, grid) {
    let data = grid.getSelectedRow();
    if(!data) {
        $.ligerDialog.error('请选择删除的行');
        return;
    }
    data=filterUnderLine('_',data);
    $.ajax(url,{
        method:'POST',
        data:JSON.stringify(data),
        dataType:'json',
        contentType:"application/json",
        success:function (res) {
            if (res.success) {
                $.ligerDialog.success('删除成功');
                grid.loadData();
            } else {
                $.ligerDialog.error('删除失败');
            }
        }
    });
}
function filterUnderLine(param,dd){
    let t={};
    for(let o in dd){
        if(o.indexOf(param) === -1){
            t[o]=dd[o];
        }
    }
    return t;
}