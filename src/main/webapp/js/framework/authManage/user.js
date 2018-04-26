var userColumns = [
    {display: '用户名(登陆用，非中文)', name: 'userName'},
    {display: '用户显示名称', name: 'showName'},
    {
        display: '用户性别', name: 'userSex', render: function (rowData) {
            if (rowData.userSex === 'FEMALE') {
                return "女";
            } else {
                return "男";
            }
        }
    },
    {display: '用户电话', name: 'userTel'},
    {display: '用户邮箱', name: 'userEmail'},
    {display: '用户地址', name: 'userAddr'},
    {
        display: '用户最后操作时间', name: 'lastOptTime', render: function (rowData) {
            return new Date(rowData.lastOptTime).toLocaleString();
        }
    }
];

function updataForm(form, data) {
    form.find("#userId").val(data.id);
    form.find("#userName").val(data.userName);
    form.find("#showName").val(data.showName);
    form.find("input[value=" + data.userSex + "]").click();
    form.find("#userTel").val(data.userTel);
    form.find("#userEmail").val(data.userEmail);
    form.find("#userAddr").val(data.userAddr);
}