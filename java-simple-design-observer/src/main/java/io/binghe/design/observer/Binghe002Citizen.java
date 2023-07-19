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
package io.binghe.design.observer;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description ConcreteSubject
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class Binghe002Citizen extends Citizen{

    public Binghe002Citizen(Policeman pol) {
        setPolicemen();
        register(pol);
    }

    @Override
    public void sendMessage(String help) {
        setHelp(help);
        for(int i = 0; i < pols.size(); i++) {
            Policeman pol = pols.get(i);
            //通知警察行动
            pol.action(this);
        }
    }
}
