package com.lg.pattern.prototype.deep;

import java.io.*;
import java.util.Date;

public class QiTianDaSheng extends Monkey implements Cloneable,Serializable {

    public JinGuBang jinGuBang;
    public QiTianDaSheng() {
        this.birthDay=new Date();
        this.jinGuBang =new JinGuBang();
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
        // return super.clone();//浅clone  用这个的产生的新对象  jinGuBang 使用的是同一个引用
    }


    //深度clone 原型模式  使用的是序列化
    public Object deepClone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos=new ObjectOutputStream(bos);
            oos.writeObject(this);


            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            QiTianDaSheng copy =(QiTianDaSheng) ois.readObject();
            copy.birthDay= new Date();

            return copy;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    /**
     * 傻瓜式原型模式
     * @param target
     * @return
     */
    public QiTianDaSheng copy(QiTianDaSheng target){

        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.height = target.height;
        qiTianDaSheng.weigth = target.weigth;
        qiTianDaSheng.jinGuBang = new JinGuBang();

        qiTianDaSheng.jinGuBang.h=target.jinGuBang.h;
        qiTianDaSheng.jinGuBang.d=target.jinGuBang.d;
        qiTianDaSheng.birthDay =new Date();
        return qiTianDaSheng;

    }


}
