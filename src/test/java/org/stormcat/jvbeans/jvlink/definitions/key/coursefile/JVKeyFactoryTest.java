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
public class JVKeyFactoryTest {

    @Test
    public void createJVCourseKey1() {
        CourseFileKey key = CourseFileKeyFactory.createYYYYMMDDJJKKKKTT(1999, 1, 1, CourseCd.TOKYO, 1200, TrackCd.FLAT_DIRT_LEFT);
        assertEquals("1999010105120023", key.toString());
    }

    @Test
    public void createJVCourseKeyLatest1() {
        CourseFileKey key = CourseFileKeyFactory.createJJKKKKTT(CourseCd.TOKYO, 1200, TrackCd.FLAT_DIRT_LEFT);
        assertEquals("9999999905120023", key.toString());
    }
}
