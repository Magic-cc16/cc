package cn.play.blog.community.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class LoginTicketEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -5117530157959521844L;

    /*  */

    /** id */
    private Integer id;

    /** userId */
    private Integer userId;

    /** ticket */
    private String ticket;

    /** 0-有效; 1-无效; */
    private Integer status;

    /** expired */
    private Timestamp expired;


}