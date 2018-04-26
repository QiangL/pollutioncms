var roleColumns = [
    {display: '角色名', name: 'roleName'},
    {display: '角色中文名', name: 'roleCnName'},
    {display: '角色说明', name: 'comment'},
    {
        display: '是否可以继承', name: 'canInherit', render: function (rowData) {
            if(rowData.canInherit === 'CANNOT_INHERIT'){
                return "不能";
            }else{
                return "能";
            }
        }
    }
];


function updataForm(form, data) {
    form.find("#roleId").val(data.id);
    form.find("#roleName").val(data.roleName);
    form.find("#roleCnName").val(data.roleCnName);
    form.find("#comment").val(data.comment);
    form.find("input[value=" + data.canInherit + "]").click();
}