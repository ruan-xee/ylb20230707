package com.rxee.front.vo;

import com.rxee.common.enums.CodeEnum;
import com.rxee.front.pageInfo.PageInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/* 统一的应答结果类 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVo {
    private int code;
    private String msg;
    private Object data;
    private List list;
    private PageInfo page;

    public void setCodeEnum(CodeEnum codeEnum) {
        this.code = codeEnum.getCode();
        this.msg = codeEnum.getText();
    }


    /**
     * 表示请求成功的ResultVo对象
     */
    public static ResultVo success(Object data) {
        ResultVo resultVo = new ResultVo();
        resultVo.setCodeEnum(CodeEnum.CODE_200);
        resultVo.setData(data);
        return resultVo;
    }

    /**
     * 表示请求成功的ResultVo对象
     */
    public static ResultVo success() {
        ResultVo resultVo = new ResultVo();
        resultVo.setCodeEnum(CodeEnum.CODE_200);
        return resultVo;
    }

    /**
     * 表示请求成功但无内容的ResultVo对象
     */
    public static ResultVo fail_204() {
        ResultVo resultVo = new ResultVo();
        resultVo.setCodeEnum(CodeEnum.CODE_204);
        return resultVo;
    }

    /**
     * 表示服务器系统错误的ResultVo对象
     */
    public static ResultVo fail_500() {
        ResultVo resultVo = new ResultVo();
        resultVo.setCodeEnum(CodeEnum.CODE_500);
        return resultVo;
    }

    /**
     * 表示参数错误的ResultVo对象
     */
    public static ResultVo fail_400() {
        ResultVo resultVo = new ResultVo();
        resultVo.setCodeEnum(CodeEnum.CODE_400);
        return resultVo;
    }

    /**
     * 自定义错误的ResultVo对象
     */
    public static ResultVo fail(CodeEnum codeEnum) {
        ResultVo resultVo = new ResultVo();
        resultVo.setCodeEnum(codeEnum);
        return resultVo;
    }
}
