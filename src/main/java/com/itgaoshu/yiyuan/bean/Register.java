package com.itgaoshu.yiyuan.bean;

import java.util.Date;

/*
住院登记
registerid	int	Not null auto_increment	Primary key,	-- 序号
userName	Varchar(200)	Not null		,	        -- 患者名字
age	Int	Not null		,	                            -- 年龄
sex	Varchar(20)	Not null		,	                    -- 性别
department	int	Not null		,	                    -- 科室 FOREIGN
doctor	int	Not null		,	                        -- 医生FOREIGN
diagnose	Varchar(500)			,	                -- 入院诊断
address	Varchar(500)			,	                    -- 地址
Phone	Varchar(30)			,	                        -- 电话
Idcard	Varchar(60)			,	                        -- 身份证号
registerDate	Date			,	                    -- 入院日期
bedNum	int ,	                                        -- 床号FOREIGN
Operator	Varchar(200)			,	                -- 操作员
money	double			,	                            -- 预交金
state	Int				                                -- 状态
 */
public class Register {
    private Integer registerid;

    private String username;

    private Integer age;

    private String sex;

    private Integer department;

    private Integer doctor;

    private String diagnose;

    private String address;

    private String phone;

    private String idcard;

    private Date registerdate;

    private Integer bednum;

    private String operator;

    private Double money;

    private Integer state;

    private Date enddate;

    private Double price;

    private String discount;

    private Date zhuan;

    public Integer getRegisterid() {
        return registerid;
    }

    public void setRegisterid(Integer registerid) {
        this.registerid = registerid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public Integer getDoctor() {
        return doctor;
    }

    public void setDoctor(Integer doctor) {
        this.doctor = doctor;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose == null ? null : diagnose.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public Date getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(Date registerdate) {
        this.registerdate = registerdate;
    }

    public Integer getBednum() {
        return bednum;
    }

    public void setBednum(Integer bednum) {
        this.bednum = bednum;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount == null ? null : discount.trim();
    }

    public Date getZhuan() {
        return zhuan;
    }

    public void setZhuan(Date zhuan) {
        this.zhuan = zhuan;
    }
}