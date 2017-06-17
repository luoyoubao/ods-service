package com.xunmeng.ods.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * zeus用户中心，用户表
 * </p>
 *
 * @author Yanghu
 * @since 2017-06-18
 */
@TableName("ods_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户表，全局唯一ID，由服务生成
     */
	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 用户登录名
     */
	@TableField("login_id")
	private String loginId;
    /**
     * 用户昵称
     */
	@TableField("nick_name")
	private String nickName;
    /**
     * 登录手机
     */
	private String mobile;
    /**
     * 登录邮箱
     */
	private String email;
    /**
     * 平台类型：商宴通、费控、会务等
     */
	@TableField("platform_type")
	private String platformType;
    /**
     * 密码Hash
     */
	private String pwd;
    /**
     * 密码过期时间
     */
	@TableField("pwd_expire")
	private Date pwdExpire;
    /**
     * 密码Salt
     */
	@TableField("pwd_salt")
	private String pwdSalt;
    /**
     * 密码加密方式
     */
	@TableField("pwd_encryption")
	private String pwdEncryption;
    /**
     * 注册时间
     */
	@TableField("reg_time")
	private Date regTime;
    /**
     * 头像URL
     */
	@TableField("avatar_url")
	private String avatarUrl;
    /**
     * 状态：ACTIVE--启用, DISABLED--禁用, INACTIVE--未激活, UNVERIFIED--未认证, UNREGISTERED--未注册
     */
	private String status;
    /**
     * 微信Bind，openid
     */
	@TableField("weixin_openid")
	private String weixinOpenid;
    /**
     * 钉钉bind，dingdingcode
     */
	@TableField("dingding_openid")
	private String dingdingOpenid;
    /**
     * 微博bind，openid
     */
	@TableField("weibo_openid")
	private String weiboOpenid;
    /**
     * google oauth bind, oauth token
     */
	@TableField("google_openid")
	private String googleOpenid;
    /**
     * facebook oauth bind, oauth token
     */
	@TableField("facebook_openid")
	private String facebookOpenid;
    /**
     * twitter oauth bind, twitter oauth token
     */
	@TableField("twitter_openid")
	private String twitterOpenid;
    /**
     * oauth bind token
     */
	@TableField("oauth_openid1")
	private String oauthOpenid1;
    /**
     * oauth bind token
     */
	@TableField("oauth_openid2")
	private String oauthOpenid2;
    /**
     * oauth bind token
     */
	@TableField("oauth_openid3")
	private String oauthOpenid3;
    /**
     * oauth bind token
     */
	@TableField("oauth_openid4")
	private String oauthOpenid4;
    /**
     * 预留字段
     */
	private String custom1;
    /**
     * 预留字段
     */
	private String custom2;
    /**
     * 预留字段
     */
	private String custom3;
    /**
     * 预留字段
     */
	private String custom4;
    /**
     * 记录创建时间，创建时自动添加
     */
	@TableField("gmt_created")
	private Date gmtCreated;
    /**
     * 记录更新时间，更新时自动更新
     */
	@TableField("gmt_modified")
	private Date gmtModified;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPlatformType() {
		return platformType;
	}

	public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Date getPwdExpire() {
		return pwdExpire;
	}

	public void setPwdExpire(Date pwdExpire) {
		this.pwdExpire = pwdExpire;
	}

	public String getPwdSalt() {
		return pwdSalt;
	}

	public void setPwdSalt(String pwdSalt) {
		this.pwdSalt = pwdSalt;
	}

	public String getPwdEncryption() {
		return pwdEncryption;
	}

	public void setPwdEncryption(String pwdEncryption) {
		this.pwdEncryption = pwdEncryption;
	}

	public Date getRegTime() {
		return regTime;
	}

	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getWeixinOpenid() {
		return weixinOpenid;
	}

	public void setWeixinOpenid(String weixinOpenid) {
		this.weixinOpenid = weixinOpenid;
	}

	public String getDingdingOpenid() {
		return dingdingOpenid;
	}

	public void setDingdingOpenid(String dingdingOpenid) {
		this.dingdingOpenid = dingdingOpenid;
	}

	public String getWeiboOpenid() {
		return weiboOpenid;
	}

	public void setWeiboOpenid(String weiboOpenid) {
		this.weiboOpenid = weiboOpenid;
	}

	public String getGoogleOpenid() {
		return googleOpenid;
	}

	public void setGoogleOpenid(String googleOpenid) {
		this.googleOpenid = googleOpenid;
	}

	public String getFacebookOpenid() {
		return facebookOpenid;
	}

	public void setFacebookOpenid(String facebookOpenid) {
		this.facebookOpenid = facebookOpenid;
	}

	public String getTwitterOpenid() {
		return twitterOpenid;
	}

	public void setTwitterOpenid(String twitterOpenid) {
		this.twitterOpenid = twitterOpenid;
	}

	public String getOauthOpenid1() {
		return oauthOpenid1;
	}

	public void setOauthOpenid1(String oauthOpenid1) {
		this.oauthOpenid1 = oauthOpenid1;
	}

	public String getOauthOpenid2() {
		return oauthOpenid2;
	}

	public void setOauthOpenid2(String oauthOpenid2) {
		this.oauthOpenid2 = oauthOpenid2;
	}

	public String getOauthOpenid3() {
		return oauthOpenid3;
	}

	public void setOauthOpenid3(String oauthOpenid3) {
		this.oauthOpenid3 = oauthOpenid3;
	}

	public String getOauthOpenid4() {
		return oauthOpenid4;
	}

	public void setOauthOpenid4(String oauthOpenid4) {
		this.oauthOpenid4 = oauthOpenid4;
	}

	public String getCustom1() {
		return custom1;
	}

	public void setCustom1(String custom1) {
		this.custom1 = custom1;
	}

	public String getCustom2() {
		return custom2;
	}

	public void setCustom2(String custom2) {
		this.custom2 = custom2;
	}

	public String getCustom3() {
		return custom3;
	}

	public void setCustom3(String custom3) {
		this.custom3 = custom3;
	}

	public String getCustom4() {
		return custom4;
	}

	public void setCustom4(String custom4) {
		this.custom4 = custom4;
	}

	public Date getGmtCreated() {
		return gmtCreated;
	}

	public void setGmtCreated(Date gmtCreated) {
		this.gmtCreated = gmtCreated;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
