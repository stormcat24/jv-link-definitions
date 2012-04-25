/*
 * Copyright 2009-2012 the Stormcat Project.
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
package org.stormcat.jvbeans.jvlink.definitions.dataspec;

/**
 * データ種別 0B14 のEnumによる表現です。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public enum _0b14 implements org.stormcat.jvbeans.config.RealTimeDataSpec {

    INSTANCE;

    /**
     * レコード種別ID {@code WE}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.RealTimeOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.WeatherTrackStateDto> _WE() {
        return new org.stormcat.jvbeans.config.condition.RealTimeOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.WeatherTrackStateDto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.WE, org.stormcat.jvbeans.jvlink.definitions.dto.WeatherTrackStateDto.class);
    }

    /**
     * レコード種別ID {@code AV}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.RealTimeOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.CancelExclusionDto> _AV() {
        return new org.stormcat.jvbeans.config.condition.RealTimeOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.CancelExclusionDto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.AV, org.stormcat.jvbeans.jvlink.definitions.dto.CancelExclusionDto.class);
    }

    /**
     * レコード種別ID {@code JC}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.RealTimeOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.JockeyChangeDto> _JC() {
        return new org.stormcat.jvbeans.config.condition.RealTimeOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.JockeyChangeDto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.JC, org.stormcat.jvbeans.jvlink.definitions.dto.JockeyChangeDto.class);
    }

    /**
     * レコード種別ID {@code TC}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.RealTimeOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.StartTimeChangeDto> _TC() {
        return new org.stormcat.jvbeans.config.condition.RealTimeOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.StartTimeChangeDto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.TC, org.stormcat.jvbeans.jvlink.definitions.dto.StartTimeChangeDto.class);
    }

    /**
     * レコード種別ID {@code CC}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.RealTimeOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.CourseChangeDto> _CC() {
        return new org.stormcat.jvbeans.config.condition.RealTimeOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.CourseChangeDto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.CC, org.stormcat.jvbeans.jvlink.definitions.dto.CourseChangeDto.class);
    }

    /**
     * {@inheritDoc}
     */
    public String getName() {
        return "速報開催情報(一括)";
    }

    /**
     * {@inheritDoc}
     */
    public String getValue() {
        return "0B14";
    }

}
