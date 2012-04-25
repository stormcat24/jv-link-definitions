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
 * データ種別 0B20 のEnumによる表現です。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public enum _0b20 implements org.stormcat.jvbeans.config.RealTimeDataSpec {

    INSTANCE;

    /**
     * レコード種別ID {@code H1}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.RealTimeOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.VoteCount1Dto> _H1() {
        return new org.stormcat.jvbeans.config.condition.RealTimeOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.VoteCount1Dto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.H1, org.stormcat.jvbeans.jvlink.definitions.dto.VoteCount1Dto.class);
    }

    /**
     * レコード種別ID {@code H6}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.RealTimeOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.VoteCount6Dto> _H6() {
        return new org.stormcat.jvbeans.config.condition.RealTimeOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.VoteCount6Dto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.H6, org.stormcat.jvbeans.jvlink.definitions.dto.VoteCount6Dto.class);
    }

    /**
     * {@inheritDoc}
     */
    public String getName() {
        return "速報票数(全賭式)";
    }

    /**
     * {@inheritDoc}
     */
    public String getValue() {
        return "0B20";
    }

}
