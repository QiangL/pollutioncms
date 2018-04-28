function add(url, grid) {
    let form = $("#form");
    clearFormInput(form);
    form.off("submit");
    let dialog = openDialog("增加", form);
    form.on("submit", function () {
        let pwd=form.find("#pwd");
        if(pwd){
           let pwd2=form.find("#pwd2");
           if(pwd.val() !== pwd2.val()){
               $.ligerDialog.error("两次输入密码不一致");
               return false;
           }
        }
        ajaxJSONPost(url, JSON.stringify(form.serializeJSON())
            , function (res) {
                if (res.success) {
                    dialog.hide();
                    $.ligerDialog.success('增加成功');
                    grid.loadData();
                } else {
                    $.ligerDialog.error('增加失败,原因:' + res.errorCodes);
                }
            });
        return false;
    });
}
function update(url, grid) {
    let data = grid.getSelectedRow();
    let form = $("#form");
    if (!data) {
        $.ligerDialog.error('请选择更新的行');
        return;
    }
    updataForm(form, data);
    form.off("submit");
    let dialog = openDialog("更新", form);
    form.on("submit", function () {
        let pwd=form.find("#pwd");
        if(pwd){
            let pwd2=form.find("#pwd2");
            if(pwd.val() !== pwd2.val()){
                $.ligerDialog.error("两次输入密码不一致");
                return false;
            }
        }
        ajaxJSONPost(url, JSON.stringify(form.serializeJSON())
            , function (res) {
                if (res.success) {
                    dialog.hide();
                    $.ligerDialog.success('更新成功');
                    grid.loadData();
                } else {
                    $.ligerDialog.error('更新失败,原因:' + res.errorCodes);
                }
            });
        return false;
    });
}
function delet(url, grid) {
    let data = grid.getSelectedRow();
    if (!data) {
        $.ligerDialog.error('请选择删除的行');
        return;
    }
    data = filterUnderLine('_', data);
    ajaxJSONPost(url, JSON.stringify(data)
        , function (res) {
        if (res.success) {
            $.ligerDialog.success('删除成功');
            grid.loadData();
        } else {
            $.ligerDialog.error('删除失败,原因:' + res.errorCodes);
        }
    });
}

function filterUnderLine(param, dd) {
    let t = {};
    for (let o in dd) {
        if (o.indexOf(param) === -1) {
            t[o] = dd[o];
        }
    }
    return t;
}

function clearFormInput(form) {
    let inputs = form.find("input");
    for (let i = 0; i < inputs.length; i++) {
        let inp = $(inputs[i]);
        if (inp.attr("type") === 'text' ||
            inp.attr("type") === 'tel' ||
            inp.attr("type") === 'email' ||
            inp.attr("type") === 'password') {
            inp.val("");
        } else if (inp.attr("type") === 'radio') {
            inp.attr('checked', false);
        }
    }
}