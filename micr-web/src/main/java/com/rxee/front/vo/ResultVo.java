package com.rxee.front.vo;

import com.rxee.common.enums.CodeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/* 统一的应答结果类 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVo {
    private int code;
    private String msg;
    private Object data;

    public void setCodeEnum(CodeEnum codeEnum) {
        this.code = codeEnum.getCode();
        this.msg = codeEnum.getText();
    }


    // 表示成功的ResultVo对象
    public static ResultVo success(Object data) {
        ResultVo resultVo = new ResultVo();
        resultVo.setCodeEnum(CodeEnum.CODE_200);
        resultVo.setData(data);
        return resultVo;
    }
    // 表示成功的ResultVo对象
    public static ResultVo success() {
        ResultVo resultVo = new ResultVo();
        resultVo.setCodeEnum(CodeEnum.CODE_200);
        return resultVo;
    }

    // 表示失败的ResultVo对象
    public static ResultVo fail() {
        ResultVo resultVo = new ResultVo();
        resultVo.setCodeEnum(CodeEnum.CODE_500);
        return resultVo;
    }
}
