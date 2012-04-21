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
package org.stormcat.jvbeans.jvlink.definitions.key.rtopen;

import org.stormcat.jvbeans.config.key.RtOpenKey;
import org.stormcat.jvbeans.jvlink.JvLinkManager;
import org.stormcat.jvbeans.jvlink.definitions.code.CourseCd;

/**
 * {@link RtOpenKey}を生成するためのstaticファクトリです。
 * <p>{@link JvLinkManager#rtOpen(org.stormcat.jvbeans.config.RealTimeDataSpec, RtOpenKey)}
 * のkeyを生成するために使用します。
 * @author a.yamada
 * @since 0.1
 *
 */
public class RtOpenKeyFactory {

    private RtOpenKeyFactory() { }

    /**
     * {@code YYYYMMDD}形式の{@link RtOpenKey}を生成します。
     * @param holdingYear 開催年（1900から9999）
     * @param holdingMonth 開催月（1から99）
     * @param holdingDay 開催日（1から99）
     * @return {@link RtOpenKey}
     */
    public static RtOpenKey createYYYYMMDD(int holdingYear, int holdingMonth, int holdingDay) {
        return new RtOpenKeyYYYYMMDD(holdingYear, holdingMonth, holdingDay);
    }

    /**
     * {@code YYYYMMDDJJRR}形式の{@link RtOpenKey}を生成します。
     * @param holdingYear 開催年（1900から9999）
     * @param holdingMonth 開催月（1から99）
     * @param holdingDay 開催日（1から99）
     * @param courseCd 場コード
     * @param raceNo レース番号（1から99）
     * @return {@link RtOpenKey}
     */
    public static RtOpenKey createYYYYMMDDJJRR(int holdingYear, int holdingMonth, int holdingDay,
            CourseCd courseCd, int raceNo) {
        return new RtOpenKeyYYYYMMDDJJRR(holdingYear, holdingMonth, holdingDay, courseCd, raceNo);
    }

    /**
     * {@code YYYYMMDDJJKKHHRR}形式の{@link RtOpenKey}を生成します。
     * @param holdingYear 開催年（1900から9999）
     * @param holdingMonth 開催月（1から99）
     * @param holdingDay 開催日（1から99）
     * @param courseCd 場コード
     * @param holdingTimes 回次（1から99）
     * @param holdingDayTimes 日次（1から99）
     * @param raceNo レース番号（1から99）
     * @return {@link RtOpenKey}
     */
    public static RtOpenKey createYYYYMMDDJJKKHHRR(int holdingYear, int holdingMonth, int holdingDay,
            CourseCd courseCd, int holdingTimes, int holdingDayTimes, int raceNo) {
        return new RtOpenKeyYYYYMMDDJJKKHHRR(holdingYear, holdingMonth, holdingDay,
                courseCd, holdingTimes, holdingDayTimes, raceNo);
    }

}
