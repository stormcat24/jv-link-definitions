/*
 * Copyright 2009-2011 the Stormcat Project.
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
 * データ種別 RACE のEnumによる表現です。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public enum _Race implements org.stormcat.jvbeans.config.StoredDataSpec {

    INSTANCE;

    /**
     * レコード種別ID {@code RA}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.RaceDetailDto> _RA() {
        return new org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.RaceDetailDto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.RA, org.stormcat.jvbeans.jvlink.definitions.dto.RaceDetailDto.class);
    }

    /**
     * レコード種別ID {@code SE}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.HorseRaceInfoDto> _SE() {
        return new org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.HorseRaceInfoDto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.SE, org.stormcat.jvbeans.jvlink.definitions.dto.HorseRaceInfoDto.class);
    }

    /**
     * レコード種別ID {@code HR}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.RefundDto> _HR() {
        return new org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.RefundDto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.HR, org.stormcat.jvbeans.jvlink.definitions.dto.RefundDto.class);
    }

    /**
     * レコード種別ID {@code H1}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.VoteCount1Dto> _H1() {
        return new org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.VoteCount1Dto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.H1, org.stormcat.jvbeans.jvlink.definitions.dto.VoteCount1Dto.class);
    }

    /**
     * レコード種別ID {@code H6}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.VoteCount6Dto> _H6() {
        return new org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.VoteCount6Dto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.H6, org.stormcat.jvbeans.jvlink.definitions.dto.VoteCount6Dto.class);
    }

    /**
     * レコード種別ID {@code O1}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.Odds1Dto> _O1() {
        return new org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.Odds1Dto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.O1, org.stormcat.jvbeans.jvlink.definitions.dto.Odds1Dto.class);
    }

    /**
     * レコード種別ID {@code O2}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.Odds2Dto> _O2() {
        return new org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.Odds2Dto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.O2, org.stormcat.jvbeans.jvlink.definitions.dto.Odds2Dto.class);
    }

    /**
     * レコード種別ID {@code O3}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.Odds3Dto> _O3() {
        return new org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.Odds3Dto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.O3, org.stormcat.jvbeans.jvlink.definitions.dto.Odds3Dto.class);
    }

    /**
     * レコード種別ID {@code O4}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.Odds4Dto> _O4() {
        return new org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.Odds4Dto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.O4, org.stormcat.jvbeans.jvlink.definitions.dto.Odds4Dto.class);
    }

    /**
     * レコード種別ID {@code O5}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.Odds5Dto> _O5() {
        return new org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.Odds5Dto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.O5, org.stormcat.jvbeans.jvlink.definitions.dto.Odds5Dto.class);
    }

    /**
     * レコード種別ID {@code O6}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.Odds6Dto> _O6() {
        return new org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.Odds6Dto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.O6, org.stormcat.jvbeans.jvlink.definitions.dto.Odds6Dto.class);
    }

    /**
     * {@inheritDoc}
     */
    public String getName() {
        return "レース情報";
    }

    /**
     * {@inheritDoc}
     */
    public String getValue() {
        return "RACE";
    }

}
