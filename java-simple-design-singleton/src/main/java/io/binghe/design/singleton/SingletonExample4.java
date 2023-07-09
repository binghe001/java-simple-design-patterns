/**
 * Copyright 2022-9999 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.binghe.design.singleton;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description 懒汉模式（双重锁同步锁单例模式），单例实例在第一次使用的时候进行创建，这个类不是线程安全的
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class SingletonExample4 {

    private SingletonExample4(){}

    private static SingletonExample4 instance = null;

    //线程不安全
    //当执行instance = new SingletonExample4();这行代码时，CPU会执行如下指令：
    //1.memory = allocate() 分配对象的内存空间
    //2.ctorInstance() 初始化对象
    //3.instance = memory 设置instance指向刚分配的内存
    //单纯执行以上三步没啥问题，但是在多线程情况下，可能会发生指令重排序。
    // 指令重排序对单线程没有影响，单线程下CPU可以按照顺序执行以上三个步骤，但是在多线程下，如果发生了指令重排序，则会打乱上面的三个步骤。

    //如果发生了JVM和CPU优化，发生重排序时，可能会按照下面的顺序执行：
    //1.memory = allocate() 分配对象的内存空间
    //3.instance = memory 设置instance指向刚分配的内存
    //2.ctorInstance() 初始化对象


    //假设目前有两个线程A和B同时执行getInstance()方法，A线程执行到instance = new SingletonExample4(); B线程刚执行到第一个 if (instance == null){处，
    //如果按照1.3.2的顺序，假设线程A执行到3.instance = memory 设置instance指向刚分配的内存，此时，线程B判断instance已经有值，就会直接return instance;
    //而实际上，线程A还未执行2.ctorInstance() 初始化对象，也就是说线程B拿到的instance对象还未进行初始化，这个未初始化的instance对象一旦被线程B使用，就会出现问题。


    public static SingletonExample4 getInstance(){
        if (instance == null){
            synchronized (SingletonExample4.class){
                if(instance == null){
                    instance = new SingletonExample4();
                }
            }
        }
        return instance;
    }
}
