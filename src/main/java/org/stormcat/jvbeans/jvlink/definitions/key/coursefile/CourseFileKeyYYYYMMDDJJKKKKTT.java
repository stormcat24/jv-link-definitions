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
import org.stormcat.jvbeans.jvlink.definitions.code.CourseCd;
import org.stormcat.jvbeans.jvlink.definitions.code.TrackCd;
import org.stormcat.jvbeans.jvlink.definitions.key.AbstractKey;


/**
 * {@code YYYYMMDDJJKKKKTT}形式の{@link CourseFileKey}です。
 * @author a.yamada
 * @since 0.1
 *
 */
public class CourseFileKeyYYYYMMDDJJKKKKTT extends AbstractKey implements CourseFileKey {

    /** 場コード */
    private CourseCd courseCd;

    /** 距離 */
    private Integer distance;

    /** トラックコード */
    private TrackCd trackCd;

    /**
     *
     * コンストラクタ
     * @param holdingYear 開催年（1900から9999）
     * @param holdingMonth 開催月（1から99）
     * @param holdingDay 開催日（1から99）
     * @param courseCd 場コード
     * @param distance 距離（1から9999以内）
     * @param trackCd トラックコード
     */
    CourseFileKeyYYYYMMDDJJKKKKTT(Integer holdingYear, Integer holdingMonth, Integer holdingDay,
            CourseCd courseCd, Integer distance, TrackCd trackCd) {
        super(holdingYear, holdingMonth, holdingDay);
        if (courseCd == null) {
            throw new IllegalArgumentException("場コードがnullになっています。");
        }
        if (distance == null | (distance < 1 && distance > 9999)) {
            throw new IllegalArgumentException(
                    String.format("距離は1から9999以内の値を指定してください。: %d", distance));
        }
        if (trackCd == null) {
            throw new IllegalArgumentException("トラックコードがnullになっています。");
        }
        this.courseCd = courseCd;
        this.distance = distance;
        this.trackCd = trackCd;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return String.format("%04d%02d%02d%s%04d%s",
                getHoldingYear(),
                getHoldingMonth(),
                getHoldingDay(),
                courseCd.getValue(),
                distance,
                trackCd.getValue()
                );
    }

    /**
     * 場コードを返します。
     * @return courseCd 場コード
     */
    public CourseCd getCourseCd() {
        return courseCd;
    }

    /**
     * 距離を返します。
     * @return distance 距離
     */
    public Integer getDistance() {
        return distance;
    }

    /**
     * トラックコードを返します。
     * @return trackCd トラックコード
     */
    public TrackCd getTrackCd() {
        return trackCd;
    }

}
