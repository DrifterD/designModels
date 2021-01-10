package org.yhx.design.mode.Singleton;

/**
 *  饿汉模式-懒加载。在需要使用的时候实现
 *  这里懒加载是通过 锁+二次确认实现
 * @author bigmoon
 * @date 1/9/21
 * @return
 * @see [相关类/方法]（可选）
 * @since 201126
 */
public class Singleton02 {

    private static Singleton02 SINGLETON;

    private Singleton02(){}

    //v-1 直接使用synchronized 锁住方法实现.这样是正确
//    public static synchronized Singleton02 getInstance(){
//
//        if(SINGLETON==null){
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            SINGLETON=new Singleton02();
//        }
//
//        return SINGLETON;
//    }

    //v-2 synchronized 局部块实现，但是多线程中会出现非单例情况
//    public static  Singleton02 getInstance(){
//
//        if(SINGLETON==null){
//
//            synchronized (Singleton02.class){
//                  提供线程切换效果
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                SINGLETON=new Singleton02();
//            }
//        }
//        return SINGLETON;
//    }

    //v-3 双重非空判断+synchronized实现单例
    public static Singleton02 getInstance(){
        if(SINGLETON==null){

            synchronized (Singleton02.class){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(SINGLETON==null){
                   SINGLETON=new Singleton02();
                }
            }
        }
        return SINGLETON;
    }
    public static void main(String[] args) {

        for(int i=0;i<100;i++) {
            new Thread(() -> System.out.println(Singleton02.getInstance().hashCode())).start();
        }
    }
}
