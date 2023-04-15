package com.crazywalker.fsf.vo;

/**
 * 基础视图层基础泛型类
 * @author CrazyWalker
 * @since 周六, 04/15 2023 22:11 GMT+8
 */
public class BaseVo<T> implements VoResult {

    private Integer code;

    private String message;

    private Boolean success = false;

    private T data;

    public BaseVo() {}

    public BaseVo(VoResult result) {
        this.success = result.getSuccess();
        this.message = result.getMessage();
        this.code = result.getCode();
    }

    public BaseVo(VoResult result, T data) {
        this.data = data;
        this.success = result.getSuccess();
        this.message = result.getMessage();
        this.code = result.getCode();
    }

    public BaseVo(Integer code, String message, Boolean success) {
        this.code = code;
        this.message = message;
        this.success = success;
    }

    public BaseVo(Integer code, String message, Boolean success, T data) {
        this.code = code;
        this.message = message;
        this.success = success;
        this.data = data;
    }

    public static BaseVo<?> success() {
        return new BaseVo<>(DefaultControllerResultEnum.SUCCESS);
    }
    public static <T> BaseVo<T> success(T data) {
        return new BaseVo<>(DefaultControllerResultEnum.SUCCESS, data);
    }

    public static BaseVo<?> getInstanceWithNoData(Integer code, String message, boolean success) {
        return new BaseVo<>(code, message, success);
    }

    public static BaseVo<?> getInstanceByResultEnum(VoResult controllerResultEnum) {
        return new BaseVo<>(controllerResultEnum.getCode(), controllerResultEnum.getMessage(),
                controllerResultEnum.getSuccess());
    }

    public static BaseVo<?> getInstanceByResultEnumAndMessage(VoResult controllerResultEnum, String message) {
        return new BaseVo<>(controllerResultEnum.getCode(), message, controllerResultEnum.getSuccess());
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "BaseVO{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", success=" + success +
                ", data=" + data +
                '}';
    }
}
