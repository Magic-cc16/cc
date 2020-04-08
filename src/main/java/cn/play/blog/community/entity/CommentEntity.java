package cn.play.blog.community.entity;

import lombok.Data;
import java.sql.Timestamp;


@Data
public class CommentEntity implements java.io.Serializable {
    /**
     * 版本号
     */
    private static final long serialVersionUID = 2083627781782871718L;

    /**
     * id
     */
    private Integer id;

    /**
     * userId
     */
    private Integer userId;

    /**
     * entityType
     */
    private Integer entityType;

    /**
     * entityId
     */
    private Integer entityId;

    /**
     * targetId
     */
    private Integer targetId;

    /**
     * content
     */
    private String content;

    /**
     * status
     */
    private Integer status;

    /**
     * createTime
     */
    private Timestamp createTime;


}