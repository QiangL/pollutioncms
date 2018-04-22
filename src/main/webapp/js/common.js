Array.prototype.contain = function (elem) {
    for (let i in this) {
        if (this[i] === elem) return true;
    }
    return false;
};

function loadSheet(divId, columns, toolbarItems, url, method) {
    $(divId).ligerGrid({
        height: '100%',
        columns: columns,
        url: url,
        method: method,
        pageSize: 30,
        rownumbers: true,
        toolbarShowInLeft: false,
        pageParmName: 'pageNum',
        pagesizeParmName: 'count',
        root:'rows',
        record:'total',
        toolbar: {
            items: toolbarItems
        }
    });

}