package com.wyc.forum.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wuyin
 * @date 2020/5/25
 */
@Getter
@Setter
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
