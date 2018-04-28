function updataForm(form, data) {
    form.find("#userId").val(data.id);
    form.find("#userName").val(data.userName);
    form.find("#showName").val(data.showName);
    form.find("input[value=" + data.userSex + "]").click();
    form.find("#userTel").val(data.userTel);
    form.find("#userEmail").val(data.userEmail);
    form.find("#userAddr").val(data.userAddr);
    form.find("#status").val(data.status);
}