package com.wyc.forum.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wuyin
 * @date 2020/5/26
 */
@Setter
@Getter
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
}
