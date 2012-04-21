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
 * データ種別 DIFF のEnumによる表現です。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public enum _SetupDiff implements org.stormcat.jvbeans.config.StoredDataSpec {

    INSTANCE;

    /**
     * レコード種別ID {@code UM}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.RaceHorseMasterDto> _UM() {
        return new org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.RaceHorseMasterDto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.UM, org.stormcat.jvbeans.jvlink.definitions.dto.RaceHorseMasterDto.class);
    }

    /**
     * レコード種別ID {@code KS}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.JockeyMasterDto> _KS() {
        return new org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.JockeyMasterDto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.KS, org.stormcat.jvbeans.jvlink.definitions.dto.JockeyMasterDto.class);
    }

    /**
     * レコード種別ID {@code CH}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.TrainerMasterDto> _CH() {
        return new org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.TrainerMasterDto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.CH, org.stormcat.jvbeans.jvlink.definitions.dto.TrainerMasterDto.class);
    }

    /**
     * レコード種別ID {@code BR}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.BreederMasterDto> _BR() {
        return new org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.BreederMasterDto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.BR, org.stormcat.jvbeans.jvlink.definitions.dto.BreederMasterDto.class);
    }

    /**
     * レコード種別ID {@code BN}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.OwnerMasterDto> _BN() {
        return new org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.OwnerMasterDto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.BN, org.stormcat.jvbeans.jvlink.definitions.dto.OwnerMasterDto.class);
    }

    /**
     * レコード種別ID {@code RC}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.RecordMasterDto> _RC() {
        return new org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.RecordMasterDto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.RC, org.stormcat.jvbeans.jvlink.definitions.dto.RecordMasterDto.class);
    }

    /**
     * {@inheritDoc}
     */
    public String getName() {
        return "蓄積系ソフト用　蓄積情報";
    }

    /**
     * {@inheritDoc}
     */
    public String getValue() {
        return "DIFF";
    }

}
