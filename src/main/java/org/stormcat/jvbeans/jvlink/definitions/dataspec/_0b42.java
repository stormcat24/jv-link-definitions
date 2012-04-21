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
 * データ種別 0B42 のEnumによる表現です。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public enum _0b42 implements org.stormcat.jvbeans.config.RealTimeDataSpec {

    INSTANCE;

    /**
     * レコード種別ID {@code O2}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.RealTimeOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.Odds2Dto> _O2() {
        return new org.stormcat.jvbeans.config.condition.RealTimeOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.Odds2Dto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.O2, org.stormcat.jvbeans.jvlink.definitions.dto.Odds2Dto.class);
    }

    /**
     * {@inheritDoc}
     */
    public String getName() {
        return "時系列オッズ（馬連）";
    }

    /**
     * {@inheritDoc}
     */
    public String getValue() {
        return "0B42";
    }

}
