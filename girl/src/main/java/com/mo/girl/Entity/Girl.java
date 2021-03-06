package com.mo.girl.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author 音神
 * @date 2018/9/18 16:42
 */

@Entity
public class Girl {
    //如果只写@GeneratedValue
    //默认的策略是GenerationType.AUTO
    //数据库中会多出一张hibernate_sequence表
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cupSize;

    @Min(value = 18, message = "未成年少女禁止入内")
    private Integer age;

    //注意Double是对象 可以是null double可不行
    @NotNull(message = "金额不能为空")
    private Double money;

    public Girl(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", cupSize='" + cupSize + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }
}
