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
package org.stormcat.jvbeans.jvlink.definitions.key;

/**
 * {@link JvLinkManager}に渡される引数(key)を構築するための抽象クラスです。
 * <p>引数を１つのオブジェクトにまとめることで、{@link JvLinkManager}の引数の数を極力削減します。
 * @author a.yamada
 * @since 0.1
 *
 */
public abstract class AbstractKey {

    /** 開催年 */
    private Integer holdingYear;
    
    /** 開催月 */
    private Integer holdingMonth;
    
    /** 開催日 */
    private Integer holdingDay;
    
    /**
     * コンストラクタ
     * @param holdingYear 開催年（1900から9999）
     * @param holdingMonth 開催月（1から99）
     * @param holdingDay 開催日（1から99）
     */
    protected AbstractKey(Integer holdingYear, Integer holdingMonth, Integer holdingDay) {
        if (holdingYear == null || (holdingYear < 1900 && holdingYear > 9999)) {
            throw new IllegalArgumentException(
                    String.format("開催年は1900から9999以内の値を指定してください。: %d", holdingYear));
        }
        
        if (holdingMonth == null || (holdingMonth < 1 && holdingMonth > 99)) {
            throw new IllegalArgumentException(
                    String.format("開催月は1から99以内の値を指定してください。: %d", holdingMonth));            
        }
        
        if (holdingDay == null || (holdingDay < 1 && holdingDay > 99)) {
            throw new IllegalArgumentException(
                    String.format("開催日は1から99以内の値を指定してください。: %d", holdingDay));            
        }
        
        this.holdingYear = holdingYear;
        this.holdingMonth = holdingMonth;
        this.holdingDay = holdingDay;
    }

    /**
     * 開催年を返します。
     * @return holdingYear
     */
    public Integer getHoldingYear() {
        return holdingYear;
    }

    /**
     * 開催月を返します。
     * @return holdingMonth
     */
    public Integer getHoldingMonth() {
        return holdingMonth;
    }

    /**
     * 開催日を返します。
     * @return holdingDay
     */
    public Integer getHoldingDay() {
        return holdingDay;
    }
    
    /**
     * JV-Link APIに引数として渡す文字列表現を返します。
     * @return 引数として渡す文字列
     */
    public abstract String toString();
    
}
