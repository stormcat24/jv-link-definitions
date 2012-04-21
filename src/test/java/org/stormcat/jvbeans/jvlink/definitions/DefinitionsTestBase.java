/*
 * Copyright 2009-2010 the Stormcat Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.stormcat.jvbeans.jvlink.definitions;

import org.junit.After;
import org.junit.Before;
import org.stormcat.jvbeans.config.DataOption;
import org.stormcat.jvbeans.config.condition.RealTimeOpenCondition;
import org.stormcat.jvbeans.config.condition.StoredOpenCondition;
import org.stormcat.jvbeans.config.key.RtOpenKey;
import org.stormcat.jvbeans.jvlink.JvBindingDto;
import org.stormcat.jvbeans.jvlink.JvComponentInjector;
import org.stormcat.jvbeans.jvlink.JvLinkManager;
import org.stormcat.jvbeans.jvlink.JvReader;

/**
 * @author a.yamada
 *
 */
public class DefinitionsTestBase <T extends JvBindingDto> {

    protected JvLinkManager manager;

    @Before
    public void setup() {
        JvComponentInjector.init("org.stormcat.jvbeans.jvlink.definitions.dto");
        manager = JvComponentInjector.createJvLinkManager();
        manager.init();
    }

    public void storedTest(StoredOpenCondition<T> condition, String fromTime, DataOption option) {
        JvReader<T> reader =
            manager.open(condition, fromTime, option);

        for (T dto : reader) {
            System.out.println(dto.toString());
        }
    }

    public void realTimeTest(RealTimeOpenCondition<T> condition, RtOpenKey rtOpenKey) {
        JvReader<T> reader =
            manager.rtOpen(condition, rtOpenKey);

        for (T dto : reader) {
            System.out.println(dto.toString());
        }
    }

    @After
    public void tearDown() {
        manager.close();
    }

}
