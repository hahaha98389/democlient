package com.example.democlient.testGoF23;
//懒汉式单例
public class LazyMan {

    private LazyMan(){}

    private volatile static LazyMan lazyMan;//volatile 保证原子性操作，避免指令重排

    public static LazyMan getInstance(){

        //双重检测锁模式（这样多线程时候就不会出现问题了）
        if(lazyMan == null){//减少线程对锁的竞争
            synchronized (LazyMan.class){

                if (lazyMan == null){//保证单例
                    lazyMan = new LazyMan(); //不是原子性操作
                    /**
                     * 1,分配内存空间
                     * 2，执行构造方法，初始化对象
                     * 3，把这个对象指向空间
                     *
                     *
                     *
                     * 123
                     * 132 A线程
                     *
                     */
                }
            }
        }

        return lazyMan;
    }

}
