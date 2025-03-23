package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;

import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 海鲜表
 *
 * @email
 * @date 2021-03-08
 */
@TableName("haixian")
public class HaixianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


    public HaixianEntity() {

    }

    public HaixianEntity(T t) {
    try {
    BeanUtils.copyProperties(this, t);
    } catch (IllegalAccessException | InvocationTargetException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
    }
    }


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 海鲜名称
     */
    @TableField(value = "hx_types")

    private Integer hxTypes;


    /**
     * 海鲜单价
     */
    @TableField(value = "money")

    private Double money;


    /**
     * 海鲜图片
     */
    @TableField(value = "img_photo")

    private String imgPhoto;


    /**
     * 海鲜描述
     */
    @TableField(value = "haixian_content")

    private String haixianContent;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：海鲜名称
	 */
    public Integer getHxTypes() {
        return hxTypes;
    }


    /**
	 * 获取：海鲜名称
	 */

    public void setHxTypes(Integer hxTypes) {
        this.hxTypes = hxTypes;
    }
    /**
	 * 设置：海鲜单价
	 */
    public Double getMoney() {
        return money;
    }


    /**
	 * 获取：海鲜单价
	 */

    public void setMoney(Double money) {
        this.money = money;
    }
    /**
	 * 设置：海鲜图片
	 */
    public String getImgPhoto() {
        return imgPhoto;
    }


    /**
	 * 获取：海鲜图片
	 */

    public void setImgPhoto(String imgPhoto) {
        this.imgPhoto = imgPhoto;
    }
    /**
	 * 设置：海鲜描述
	 */
    public String getHaixianContent() {
        return haixianContent;
    }


    /**
	 * 获取：海鲜描述
	 */

    public void setHaixianContent(String haixianContent) {
        this.haixianContent = haixianContent;
    }

    @Override
    public String toString() {
    return "Haixian{" +
            "id=" + id +
            ", hxTypes=" + hxTypes +
            ", money=" + money +
            ", imgPhoto=" + imgPhoto +
            ", haixianContent=" + haixianContent +
    "}";
    }
    }
