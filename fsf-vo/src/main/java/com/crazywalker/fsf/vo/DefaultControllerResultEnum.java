package com.crazywalker.fsf.vo;

/**
 * @author CrazyWalker
 * @since 周六, 04/15 2023 22:17 GMT+8
 */
public enum DefaultControllerResultEnum implements VoResult {

    SUCCESS(true, 0, "Success.");

    private final String message;

    private final Boolean success;

    private final Integer code;

    DefaultControllerResultEnum(Boolean success, Integer code, String message) {
        this.message = message;
        this.success = success;
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Boolean getSuccess() {
        return success;
    }

    @Override
    public Integer getCode() {
        return code;
    }
}
