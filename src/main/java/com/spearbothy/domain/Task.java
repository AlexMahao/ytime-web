package com.spearbothy.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Created by Alex_MaHao on 2017/5/22.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class Task {
    private String id;
    private String userTaskId;
    private String userId;
    private String createTime;
    private String endTime; //
    private String status; // 任务完成状态
    private String priority; // 任务优先级
}
