function add(url,grid) {
    let form = $("#form");
    clearFormInput(form);
    form.off("submit");

    let dialog=openDialog("增加", form);
    form.on("submit", function () {

        $.ajax(url,{
            method:'POST',
            data:JSON.stringify(form.serializeJSON()),
            dataType:'json',
            contentType:"application/json",
            success:function (res) {
                if (res.success) {
                    dialog.hide();
                    $.ligerDialog.success('增加成功');
                    grid.loadData();
                } else {
                    $.ligerDialog.error('增加失败,原因:'+res.errorCodes);
                }
            }

        });
        return false;
    });
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
                $.ligerDialog.error('删除失败,原因:'+res.errorCodes);
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

function clearFormInput(form){
    let inputs=form.find("input");
    for(let i=0;i<inputs.length;i++){
        let inp=$(inputs[i]);
        if(inp.attr("type") === 'text'){
            inp.val("");
        }else if(inp.attr("type") === 'radio'){
            inp.attr('checked',false);
        }
    }
}