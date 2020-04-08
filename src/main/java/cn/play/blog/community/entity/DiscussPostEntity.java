package cn.play.blog.community.entity;

import lombok.Data;

import java.sql.Timestamp;


@Data
public class DiscussPostEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 2354512169990160425L;


    /** id */

    private Integer id;

    /** userId */
    private Integer userId;

    /** title */
    private String title;

    /** content */
    private String content;

    /** 0-普通; 1-置顶; */
    private Integer type;

    /** 0-正常; 1-精华; 2-拉黑; */
    private Integer status;

    /** createTime */
    private Timestamp createTime;

    /** commentCount */
    private Integer commentCount;

    /** score */
    private Double score;

}