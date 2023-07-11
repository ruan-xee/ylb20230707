package com.rxee.common.enums;

public enum CodeEnum {
    CODE_200(200, "请求成功！"),
    CODE_204(204, "请求成功，但无内容！"),
    CODE_401(401, "权限不足，请申请权限！"),
    CODE_400(400, "参数错误，请检查！"),
    CODE_500(500, "系统错误！请重试！"),
    CODE_600(600, "业务异常，请重试！");




    private int code;
    private String text;

    CodeEnum(int c, String t) {
        this.code = c;
        this.text = t;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
