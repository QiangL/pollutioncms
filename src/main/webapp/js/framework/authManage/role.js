function updataForm(form, data) {
    form.find("#roleId").val(data.id);
    form.find("#roleName").val(data.roleName);
    form.find("#roleCnName").val(data.roleCnName);
    form.find("#comment").val(data.comment);
    form.find("input[value=" + data.canInherit + "]").click();
}