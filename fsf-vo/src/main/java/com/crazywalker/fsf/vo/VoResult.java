package com.crazywalker.fsf.vo;

/**
 * 视图层非数据返回结果
 * @author CrazyWalker
 * @since 周六, 04/15 2023 22:14 GMT+8
 */
public interface VoResult {

    Integer getCode();

    String getMessage();

    Boolean getSuccess();
}
