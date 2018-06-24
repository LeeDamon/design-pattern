package com.lg.pattern.prototype.deep;

public class DeepTest {

   public static void main(String[] args) {

      QiTianDaSheng qiTianDaSheng=new QiTianDaSheng();
      try {
         QiTianDaSheng clone=(QiTianDaSheng) qiTianDaSheng.clone();

         System.out.println(qiTianDaSheng.jinGuBang == clone.jinGuBang);
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();

      }


      //傻瓜式原型模式
      QiTianDaSheng qiTianDaSheng1=qiTianDaSheng.copy(qiTianDaSheng);
      System.out.println(qiTianDaSheng.jinGuBang == qiTianDaSheng1.jinGuBang);

   }

}
