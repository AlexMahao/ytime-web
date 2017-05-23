package com.spearbothy.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Created by Alex_MaHao on 2017/5/17.
 */
@Accessors(chain = true)
@NoArgsConstructor
@Getter
@Setter
public class User {
    private String id;
    private String name;
    private String nickName;
    private String mobile;
    private String password;
    private String openid;
    private String accessToken;
    private String createTime;
    private String updateTime;
}
