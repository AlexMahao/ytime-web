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

    private String user_id;
    private String password;
    private String username;
}
