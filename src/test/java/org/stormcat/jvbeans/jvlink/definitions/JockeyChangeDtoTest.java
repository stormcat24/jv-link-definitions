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

import org.junit.Test;
import org.stormcat.jvbeans.jvlink.definitions.dto.JockeyChangeDto;
import org.stormcat.jvbeans.jvlink.definitions.key.rtopen.RtOpenKeyFactory;
import org.stormcat.jvbeans.jvlink.definitions.resolver.RealTimeDataResolver;

/**
 * @author a.yamada
 *
 */
public class JockeyChangeDtoTest extends DefinitionsTestBase<JockeyChangeDto> {

    @Test
    public void test() {
        realTimeTest(RealTimeDataResolver._0B14()._JC(), RtOpenKeyFactory.createYYYYMMDD(2010, 7, 11));
    }

}
