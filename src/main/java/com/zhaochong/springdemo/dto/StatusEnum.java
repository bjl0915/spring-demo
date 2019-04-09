package com.zhaochong.springdemo.dto;

import java.io.Serializable;

/**
 * 返回状态
 */

public enum StatusEnum implements Serializable {
    SUCC(200, "成功"),
    FAIL(500, "失败"),
    PERMISSION(506, "没有操作权限"),
    //未登录
    UNLOGIN(507, "请先登录"),
    //服务器异常
    ERROR(508, "服务器出现异常"),
    //密码错误
    UNPASSWD(509, "原密码不正确"),
    //未填写必要参数  StatusEnum.UNPARAM.getCode()
    UNPARAM(205, "请输入必要参数"),
    //登陆失败
    LOGINFAIL(208, "用户名或密码错误"),
    //锁定 202
    LOCK(202, "用户被锁定"),
    //首次登陆 203
    FIRSTLOGIN(203, "首次登陆,请修改密码"),
    //修改密码警告 204
    PSSWDWARN(204, "请及时修改密码"),
    PASSWDEXPIRED(209, "密码过期"),
    // 没有符合条件的数据
    NOTFOUND(410, "未查询到数据"),
    // 权限组已经存在 code 210
    EXISTRESNAME(210, "权限组的名称已经存在"),
    // 参数不合法code 600
    PARAMNOTLEGAL(600, "参数不合法"),
    // 创建数据已经存在 565
    EXISTSDATA(565, "数据已存在"),
    NO_USER(888,"没有该条件数据"),

    // 权限组已经存在 code 309
    DATABASEERROR(309, "数据库操作错误");


    private Integer code;
    private String message;

    StatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}