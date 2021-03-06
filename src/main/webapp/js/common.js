/** 封装一层加载表格 **/
function loadSheet(divId, columns, toolbarItems, url,urlParam, method) {
    $(divId).ligerGrid({
        height: '100%',
        columns: columns,
        url: url,
        urlParms:urlParam,
        method: method,
        pageSize: 15,
        rownumbers: true,
        toolbarShowInLeft: false,
        pageParmName: 'pageNum',
        pagesizeParmName: 'count',
        root: 'rows',
        record: 'total',
        toolbar: {
            items: toolbarItems
        }
    });
}
/** 封装一层打开对话框**/
function openDialog(title, target) {
    return $.ligerDialog.open({
        width: 700,
        title: title,
        top: 50,
        target: target
    });
}
function ajaxJSONPost(url,data,successFunc){
    $.ajax(url,{
        method:'POST',
        data:data,
        dataType:'json',
        contentType:"application/json",
        success:successFunc
    });
}

function loadTree(url,divId,successFunc){
    $(divId).ligerTree({
        url:url,
        checkbox: false,
        idFieldName: 'id',
        parentIDFieldName :'pid',
        isExpand: false,
        slide: false,
        single:true,
        ajaxType:'GET',
        onSelect:successFunc
    })
}