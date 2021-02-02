package org.yhx.design.mode.template;

/**
 * 模板方法设计模式:
 * 重点：
 * 1.主要是通过将变化内容抽象成方法，让子类去实现。
 * 2.父类只需要保证算法一定顺序
 * 3.模板模式一般有两种方法：
 *     基本方法；需要通过子类来实现的
 *     模板方法：基本不需要被重写，主要用于把控框架和基本方法的流程顺序
 * 注意:
 * 模板方法尽量是final的修饰，避免不必要的重现，以至于让模板失效
 *
 * 其他：
 * 这个设计又称作，钩子，回调
 * @author bigmoon
 * @date 1/24/21
 * @return
 * @see [相关类/方法]（可选）
 * @since 201126
 */
public class Main {
    public static void main(String[] args) {

//        TemplateObj templateObj=new TemplateSon();
        TemplateObj templateObj=new TemplateSon2();
        templateObj.templateMethod();
    }

    abstract static class TemplateObj {

        //基本方法
        protected abstract void method1();
        //基本方法
        protected abstract void method2();

        /**
         * 这里是模板方法，使用final修饰
         */
        public  final void templateMethod() {
            System.out.println("this is template method ");
            method1();
            method2();
        }
    }

    public  static class TemplateSon extends TemplateObj{
        @Override
        protected void method1() {
            System.out.println(TemplateSon.class.getClass().getName()+" method1");
        }

        @Override
        protected void method2() {
            System.out.println(TemplateSon.class.getClass().getName()+" method2");
        }
    }


    public  static class TemplateSon2 extends TemplateObj{
        @Override
        protected void method1() {
            System.out.println(this.getClass().getName()+" method1");
        }

        @Override
        protected void method2() {
            System.out.println(this.getClass().getName()+" method2");
        }
    }

}
