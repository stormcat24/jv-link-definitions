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
 * データ種別 0B15 のEnumによる表現です。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public enum _0b15 implements org.stormcat.jvbeans.config.RealTimeDataSpec {

    INSTANCE;

    /**
     * レコード種別ID {@code RA}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.RealTimeOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.RaceDetailDto> _RA() {
        return new org.stormcat.jvbeans.config.condition.RealTimeOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.RaceDetailDto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.RA, org.stormcat.jvbeans.jvlink.definitions.dto.RaceDetailDto.class);
    }

    /**
     * レコード種別ID {@code SE}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.RealTimeOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.HorseRaceInfoDto> _SE() {
        return new org.stormcat.jvbeans.config.condition.RealTimeOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.HorseRaceInfoDto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.SE, org.stormcat.jvbeans.jvlink.definitions.dto.HorseRaceInfoDto.class);
    }

    /**
     * レコード種別ID {@code HR}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.RealTimeOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.RefundDto> _HR() {
        return new org.stormcat.jvbeans.config.condition.RealTimeOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.RefundDto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.HR, org.stormcat.jvbeans.jvlink.definitions.dto.RefundDto.class);
    }

    /**
     * {@inheritDoc}
     */
    public String getName() {
        return "速報レース情報(出走馬名表～）";
    }

    /**
     * {@inheritDoc}
     */
    public String getValue() {
        return "0B15";
    }

}
