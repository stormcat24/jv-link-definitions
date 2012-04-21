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
 * データ種別 HOYU のEnumによる表現です。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public enum _Hoyu implements org.stormcat.jvbeans.config.StoredDataSpec {

    INSTANCE;

    /**
     * レコード種別ID {@code HY}に対応するデータ取得条件を返します。
     * @return データ取得条件
     */
    public org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.HorseNameOriginDto> _HY() {
        return new org.stormcat.jvbeans.config.condition.StoredOpenCondition<org.stormcat.jvbeans.jvlink.definitions.dto.HorseNameOriginDto>(this, org.stormcat.jvbeans.jvlink.definitions.ConcreteRecordTypeId.HY, org.stormcat.jvbeans.jvlink.definitions.dto.HorseNameOriginDto.class);
    }

    /**
     * {@inheritDoc}
     */
    public String getName() {
        return "馬名の意味由来情報";
    }

    /**
     * {@inheritDoc}
     */
    public String getValue() {
        return "HOYU";
    }

}
