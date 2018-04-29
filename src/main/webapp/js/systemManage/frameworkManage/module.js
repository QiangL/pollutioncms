function updataForm(form, data) {
    form.find("#id").val(data.id);
    form.find("#pid").val(data.pid);
    form.find("#name").val(data.name);
    form.find("#permission").val(data.permission);
    form.find("#comment").val(data.comment);
}