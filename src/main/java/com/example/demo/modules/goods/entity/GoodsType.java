package com.example.demo.modules.goods.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author muzi
 * @since 2023-07-26
 */
@TableName("goods_type")
public class GoodsType extends Model<GoodsType> {

    private static final long serialVersionUID = 1L;

    @TableId("Type_id")
    private String typeId;
    @TableField("type_name")
    private String typeName;
    private String content;


    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    protected Serializable pkVal() {
        return this.typeId;
    }

    @Override
    public String toString() {
        return "GoodsType{" +
        ", typeId=" + typeId +
        ", typeName=" + typeName +
        ", content=" + content +
        "}";
    }
}
