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
import org.stormcat.jvbeans.jvlink.definitions.code.CourseCd;

/**
 * {@code YYYYMMDDJJKKHHRR}形式の{@link RtOpenKey}です。
 * @author a.yamada
 * @since 0.1
 *
 */
public class RtOpenKeyYYYYMMDDJJKKHHRR extends RtOpenKeyYYYYMMDDJJRR implements RtOpenKey {

    /** 回次 */
    private Integer holdingTimes;

    /** 日次 */
    private Integer holdingDayTimes;

    /**
     * コンストラクタ
     * @param holdingYear 開催年（1900から9999）
     * @param holdingMonth 開催月（1から99）
     * @param holdingDay 開催日（1から99）
     * @param courseCd 場コード
     * @param holdingTimes 回次（1から99）
     * @param holdingDayTimes 日次（1から99）
     * @param raceNo レース番号（1から99）
     */
    RtOpenKeyYYYYMMDDJJKKHHRR(Integer holdingYear, Integer holdingMonth, Integer holdingDay,
            CourseCd courseCd, Integer holdingTimes, Integer holdingDayTimes, Integer raceNo) {
        super(holdingYear, holdingMonth, holdingDay, courseCd,  raceNo);
        if (holdingTimes == null || (holdingTimes < 1 && holdingTimes > 99)) {
            throw new IllegalArgumentException(
                    String.format("回次は1から99以内の値を指定してください。: %d", holdingTimes));
        }

        if (holdingDayTimes == null || (holdingDayTimes < 1 && holdingDayTimes > 99)) {
            throw new IllegalArgumentException(
                    String.format("日次は1から99以内の値を指定してください。: %d", holdingDayTimes));
        }
        this.holdingTimes = holdingTimes;
        this.holdingDayTimes = holdingDayTimes;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return String.format("%04d%02d%02d%s%02d%02d%02d", getHoldingYear(), getHoldingMonth(), getHoldingDay(),
                getCourseCd().getValue(), getHoldingTimes(), getHoldingDayTimes(), getRaceNo());
    }

    /**
     * 回次を返します。
     * @return holdingTimes 回次
     */
    public Integer getHoldingTimes() {
        return holdingTimes;
    }

    /**
     * 日次を返します。
     * @return holdingDayTimes 日次
     */
    public Integer getHoldingDayTimes() {
        return holdingDayTimes;
    }

}
