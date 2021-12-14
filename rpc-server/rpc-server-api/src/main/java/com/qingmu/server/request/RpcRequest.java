package com.qingmu.server.request;

import java.io.Serializable;

public class RpcRequest implements Serializable {

    /**
     * 类名称
     */
    private String className;

    /**
     * 方法名称
     */
    private String methodName;

    /**
     * 参数值
     */
    private Object[] params;

    /**
     * 参数类型
     */
    private Class[] types;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Class[] getTypes() {
        return types;
    }

    public void setTypes(Class[] types) {
        this.types = types;
    }
}
