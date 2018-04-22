package com.pollutioncms.web.vo;

import com.pollutioncms.service.dto.RoleDTO;

import java.util.List;

/**
 * @author liqiag
 * @discription LigerGridVo
 * @date 2018-04-22
 **/
public class LigerGridVo<T> {

    private List<T> rows;

    private int total;

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public static <T> LigerGridVo<T> Resp(List<T> rows, int total){
        LigerGridVo<T> response = new LigerGridVo<>();
        response.setRows(rows);
        response.setTotal(total);
        return response;
    }

    private LigerGridVo(){}
}
