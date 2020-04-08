package cn.play.blog.community.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class User implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -1415691052967737866L;

    /** id */
    private Integer id;

    /** username */
    private String username;

    /** password */
    private String password;

    /** 盐随机5位 */
    private String salt;

    /** email */
    private String email;

    /** 0-普通用户; 1-超级管理员; 2-版主; */
    private Integer type;

    /** 0-未激活; 1-已激活; */
    private Integer status;

    /** activationCode */
    private String activationCode;

    /** headerUrl */
    private String headerUrl;

    /** createTime */
    private Timestamp createTime;

}