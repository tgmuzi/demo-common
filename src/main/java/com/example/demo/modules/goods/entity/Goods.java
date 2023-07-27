package com.example.demo.modules.goods.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author muzi
 * @since 2023-07-26
 */
public class Goods extends Model<Goods> {

    private static final long serialVersionUID = 1L;

    /**
     * 商品编号
     */
    @TableId("goods_id")
    private String goodsId;
    /**
     * 商品名称
     */
    @TableField("goods_name")
    private String goodsName;
    /**
     * 商品价格
     */
    private String price;
    /**
     * 状态
     */
    @TableField("goods_type")
    private String goodsType;
    /**
     * 产地
     */
    private String place;


    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    protected Serializable pkVal() {
        return this.goodsId;
    }

    @Override
    public String toString() {
        return "Goods{" +
        ", goodsId=" + goodsId +
        ", goodsName=" + goodsName +
        ", price=" + price +
        ", goodsType=" + goodsType +
        ", place=" + place +
        "}";
    }
}
