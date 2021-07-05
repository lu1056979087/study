package com.wlh;

public class EnumDemo {

    public static void main(String[] args) {

    }

}


enum Sex {

    NAN(1, "男"),
    NV(2, "女");


    Sex(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private static Integer getCodeByMsg(String msg) {
        Sex[] values = Sex.values();
        Integer code = null;
        for (Sex sex : values) {
            if (msg.equals(sex.getMsg())) {
                code = sex.getCode();
            }
        }
        return code;
    }

    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}