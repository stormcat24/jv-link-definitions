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
package org.stormcat.jvbeans.jvlink.definitions.key.coursefile;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.stormcat.jvbeans.config.key.CourseFileKey;
import org.stormcat.jvbeans.jvlink.definitions.code.CourseCd;
import org.stormcat.jvbeans.jvlink.definitions.code.TrackCd;

/**
 * @author a.yamada
 *
 */
public class CourseFileKeyFactoryTest {

    @Test
    public void createJJKKKKTT1() {

        CourseFileKey actual = CourseFileKeyFactory.createJJKKKKTT(
                CourseCd.SAPPORO, 2000, TrackCd.FLAT_TURF_RIGHT);
        assertEquals("9999999901200017", actual.toString());

    }

    @Test
    public void createYYYYMMDDJJKKKKTT() {

        CourseFileKey actual = CourseFileKeyFactory.createYYYYMMDDJJKKKKTT(
                2010, 1, 11, CourseCd.NAKAYAMA, 2000, TrackCd.FLAT_TURF_RIGHT);
        assertEquals("2010011106200017", actual.toString());

    }
}
