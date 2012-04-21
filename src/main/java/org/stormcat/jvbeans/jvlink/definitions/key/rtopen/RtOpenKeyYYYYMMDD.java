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
import org.stormcat.jvbeans.jvlink.definitions.key.AbstractKey;

/**
 * {@code YYYYMMDD}形式の{@link RtOpenKey}です。
 * @author a.yamada
 * @since 0.1
 *
 */
public class RtOpenKeyYYYYMMDD extends AbstractKey implements RtOpenKey {

    /**
     * コンストラクタ
     * @param holdingYear 開催年（1900から9999）
     * @param holdingMonth 開催月（1から99）
     * @param holdingDay 開催日（1から99）
     */
    RtOpenKeyYYYYMMDD(Integer holdingYear, Integer holdingMonth, Integer holdingDay) {
        super(holdingYear, holdingMonth, holdingDay);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return String.format("%04d%02d%02d", getHoldingYear(), getHoldingMonth(), getHoldingDay());
    }

}
