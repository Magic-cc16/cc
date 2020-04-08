package cn.play.blog.community.entity;

import lombok.Data;
import java.sql.Timestamp;

@Data
public class MessageEntity implements java.io.Serializable {
    /**
     * 版本号
     */
    private static final long serialVersionUID = 7226131339934673638L;

    private Integer id;

    /**
     * fromId
     */
    private Integer fromId;

    /**
     * toId
     */
    private Integer toId;

    /**
     * conversationId
     */
    private String conversationId;

    /**
     * content
     */
    private String content;

    /**
     * 0-未读;1-已读;2-删除;
     */
    private Integer status;

    /**
     * createTime
     */
    private Timestamp createTime;

}