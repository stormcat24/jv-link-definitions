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

import org.stormcat.jvbeans.config.key.CourseFileKey;
import org.stormcat.jvbeans.jvlink.JvLinkManager;
import org.stormcat.jvbeans.jvlink.definitions.code.CourseCd;
import org.stormcat.jvbeans.jvlink.definitions.code.TrackCd;

/**
 * {@link CourseFileKey}を生成するためのstaticファクトリです。
 * <p>{@link JvLinkManager#courseFile(CourseFileKey)},
 * {@link JvLinkManager#courseFile2(CourseFileKey, String)}のkeyを生成するために使用します。
 * @author a.yamada
 * @since 0.1
 *
 */
public class CourseFileKeyFactory {

    private CourseFileKeyFactory() { }

    /**
     * {@code YYYYMMDDJJKKKKTT}形式の{@link CourseFileKey}を生成します。
     * @param holdingYear 開催年（1900から9999）
     * @param holdingMonth 開催月（1から99）
     * @param holdingDay 開催日（1から99）
     * @param courseCd 場コード
     * @param distance 距離（1から9999以内）
     * @param trackCd トラックコード
     * @return {@link CourseFileKey}
     */
    public static CourseFileKey createYYYYMMDDJJKKKKTT(int holdingYear, int holdingMonth, int holdingDay,
            CourseCd courseCd, int distance, TrackCd trackCd) {
        return new CourseFileKeyYYYYMMDDJJKKKKTT(holdingYear, holdingMonth, holdingDay, courseCd,
                distance, trackCd);
    }

    /**
     * {@code JJKKKKTT}形式の{@link CourseFileKey}を生成します。
     * @param courseCd 場コード
     * @param distance 距離（1から9999以内）
     * @param trackCd トラックコード
     * @return {@link CourseFileKey}
     */
    public static CourseFileKey createJJKKKKTT(CourseCd courseCd, int distance, TrackCd trackCd) {
        return new CourseFileKeyYYYYMMDDJJKKKKTT(9999, 99, 99, courseCd, distance, trackCd);
    }

}
