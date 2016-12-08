package com.junly.model;

import java.math.BigDecimal;
import java.util.Date;

public class TbSysUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.nickname
     *
     * @mbg.generated
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.sex
     *
     * @mbg.generated
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.phone
     *
     * @mbg.generated
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.cellphone
     *
     * @mbg.generated
     */
    private String cellphone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.education
     *
     * @mbg.generated
     */
    private String education;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.nationality
     *
     * @mbg.generated
     */
    private String nationality;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.native_place
     *
     * @mbg.generated
     */
    private String nativePlace;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.area_id
     *
     * @mbg.generated
     */
    private Long areaId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.birthday
     *
     * @mbg.generated
     */
    private String birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.shop_id
     *
     * @mbg.generated
     */
    private Long shopId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.type
     *
     * @mbg.generated
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.auth_type
     *
     * @mbg.generated
     */
    private Integer authType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.head_url
     *
     * @mbg.generated
     */
    private String headUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.score
     *
     * @mbg.generated
     */
    private Integer score;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.user_from
     *
     * @mbg.generated
     */
    private Integer userFrom;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.balance
     *
     * @mbg.generated
     */
    private BigDecimal balance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.goods_check
     *
     * @mbg.generated
     */
    private Integer goodsCheck;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.freeze_balance
     *
     * @mbg.generated
     */
    private BigDecimal freezeBalance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.cid
     *
     * @mbg.generated
     */
    private String cid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.login_count
     *
     * @mbg.generated
     */
    private Integer loginCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys_user.device_type
     *
     * @mbg.generated
     */
    private String deviceType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.id
     *
     * @return the value of tb_sys_user.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.id
     *
     * @param id the value for tb_sys_user.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.username
     *
     * @return the value of tb_sys_user.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.username
     *
     * @param username the value for tb_sys_user.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.password
     *
     * @return the value of tb_sys_user.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.password
     *
     * @param password the value for tb_sys_user.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.name
     *
     * @return the value of tb_sys_user.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.name
     *
     * @param name the value for tb_sys_user.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.nickname
     *
     * @return the value of tb_sys_user.nickname
     *
     * @mbg.generated
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.nickname
     *
     * @param nickname the value for tb_sys_user.nickname
     *
     * @mbg.generated
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.sex
     *
     * @return the value of tb_sys_user.sex
     *
     * @mbg.generated
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.sex
     *
     * @param sex the value for tb_sys_user.sex
     *
     * @mbg.generated
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.phone
     *
     * @return the value of tb_sys_user.phone
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.phone
     *
     * @param phone the value for tb_sys_user.phone
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.cellphone
     *
     * @return the value of tb_sys_user.cellphone
     *
     * @mbg.generated
     */
    public String getCellphone() {
        return cellphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.cellphone
     *
     * @param cellphone the value for tb_sys_user.cellphone
     *
     * @mbg.generated
     */
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone == null ? null : cellphone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.email
     *
     * @return the value of tb_sys_user.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.email
     *
     * @param email the value for tb_sys_user.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.education
     *
     * @return the value of tb_sys_user.education
     *
     * @mbg.generated
     */
    public String getEducation() {
        return education;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.education
     *
     * @param education the value for tb_sys_user.education
     *
     * @mbg.generated
     */
    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.nationality
     *
     * @return the value of tb_sys_user.nationality
     *
     * @mbg.generated
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.nationality
     *
     * @param nationality the value for tb_sys_user.nationality
     *
     * @mbg.generated
     */
    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.native_place
     *
     * @return the value of tb_sys_user.native_place
     *
     * @mbg.generated
     */
    public String getNativePlace() {
        return nativePlace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.native_place
     *
     * @param nativePlace the value for tb_sys_user.native_place
     *
     * @mbg.generated
     */
    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.address
     *
     * @return the value of tb_sys_user.address
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.address
     *
     * @param address the value for tb_sys_user.address
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.area_id
     *
     * @return the value of tb_sys_user.area_id
     *
     * @mbg.generated
     */
    public Long getAreaId() {
        return areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.area_id
     *
     * @param areaId the value for tb_sys_user.area_id
     *
     * @mbg.generated
     */
    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.birthday
     *
     * @return the value of tb_sys_user.birthday
     *
     * @mbg.generated
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.birthday
     *
     * @param birthday the value for tb_sys_user.birthday
     *
     * @mbg.generated
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.create_time
     *
     * @return the value of tb_sys_user.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.create_time
     *
     * @param createTime the value for tb_sys_user.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.shop_id
     *
     * @return the value of tb_sys_user.shop_id
     *
     * @mbg.generated
     */
    public Long getShopId() {
        return shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.shop_id
     *
     * @param shopId the value for tb_sys_user.shop_id
     *
     * @mbg.generated
     */
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.type
     *
     * @return the value of tb_sys_user.type
     *
     * @mbg.generated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.type
     *
     * @param type the value for tb_sys_user.type
     *
     * @mbg.generated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.auth_type
     *
     * @return the value of tb_sys_user.auth_type
     *
     * @mbg.generated
     */
    public Integer getAuthType() {
        return authType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.auth_type
     *
     * @param authType the value for tb_sys_user.auth_type
     *
     * @mbg.generated
     */
    public void setAuthType(Integer authType) {
        this.authType = authType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.status
     *
     * @return the value of tb_sys_user.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.status
     *
     * @param status the value for tb_sys_user.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.head_url
     *
     * @return the value of tb_sys_user.head_url
     *
     * @mbg.generated
     */
    public String getHeadUrl() {
        return headUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.head_url
     *
     * @param headUrl the value for tb_sys_user.head_url
     *
     * @mbg.generated
     */
    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl == null ? null : headUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.score
     *
     * @return the value of tb_sys_user.score
     *
     * @mbg.generated
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.score
     *
     * @param score the value for tb_sys_user.score
     *
     * @mbg.generated
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.user_from
     *
     * @return the value of tb_sys_user.user_from
     *
     * @mbg.generated
     */
    public Integer getUserFrom() {
        return userFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.user_from
     *
     * @param userFrom the value for tb_sys_user.user_from
     *
     * @mbg.generated
     */
    public void setUserFrom(Integer userFrom) {
        this.userFrom = userFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.balance
     *
     * @return the value of tb_sys_user.balance
     *
     * @mbg.generated
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.balance
     *
     * @param balance the value for tb_sys_user.balance
     *
     * @mbg.generated
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.goods_check
     *
     * @return the value of tb_sys_user.goods_check
     *
     * @mbg.generated
     */
    public Integer getGoodsCheck() {
        return goodsCheck;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.goods_check
     *
     * @param goodsCheck the value for tb_sys_user.goods_check
     *
     * @mbg.generated
     */
    public void setGoodsCheck(Integer goodsCheck) {
        this.goodsCheck = goodsCheck;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.freeze_balance
     *
     * @return the value of tb_sys_user.freeze_balance
     *
     * @mbg.generated
     */
    public BigDecimal getFreezeBalance() {
        return freezeBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.freeze_balance
     *
     * @param freezeBalance the value for tb_sys_user.freeze_balance
     *
     * @mbg.generated
     */
    public void setFreezeBalance(BigDecimal freezeBalance) {
        this.freezeBalance = freezeBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.cid
     *
     * @return the value of tb_sys_user.cid
     *
     * @mbg.generated
     */
    public String getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.cid
     *
     * @param cid the value for tb_sys_user.cid
     *
     * @mbg.generated
     */
    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.login_count
     *
     * @return the value of tb_sys_user.login_count
     *
     * @mbg.generated
     */
    public Integer getLoginCount() {
        return loginCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.login_count
     *
     * @param loginCount the value for tb_sys_user.login_count
     *
     * @mbg.generated
     */
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys_user.device_type
     *
     * @return the value of tb_sys_user.device_type
     *
     * @mbg.generated
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys_user.device_type
     *
     * @param deviceType the value for tb_sys_user.device_type
     *
     * @mbg.generated
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }
}