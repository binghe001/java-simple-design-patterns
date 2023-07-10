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
package io.binghe.design.builder;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description Person对象的构造器
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class ManBuilder implements PersonBuilder{
    Person person;

    public ManBuilder() {
        person = new Man();
    }

    @Override
    public void buildBody() {
        person.setBody("建造男人的身体");
    }

    @Override
    public void buildFoot() {
        person.setFoot("建造男人的脚");
    }

    @Override
    public void buildHead() {
        person.setHead("建造男人的头");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
