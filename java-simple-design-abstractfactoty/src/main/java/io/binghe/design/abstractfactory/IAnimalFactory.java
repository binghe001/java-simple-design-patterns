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
package io.binghe.design.abstractfactory;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description 这个接口就是类图中标识的AbstractFactory抽象工厂
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public interface IAnimalFactory {

    /**
     * 定义创建Icat接口实例的方法
     * @return
     */
    ICat createCat();
    /**
     * 定义创建IDog接口实例的方法
     * @return
     */
    IDog createDog();
}
