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
package org.stormcat.jvbeans.jvlink.definitions.dto.child;

 /**
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public class TotalResultInfoSimpleDto {

    /** 　　設定年 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1, byteLength = 4)
    private java.lang.Integer settingYear;

    /** 　　本賞金合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 5, byteLength = 10, correction = 100.0f)
    private java.lang.String addedMoneyTotal;

    /** 　　付加賞金合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 15, byteLength = 10, correction = 100.0f)
    private java.lang.String stakesMoneyTotal;

    /** 　　着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 25, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountItems;


    /**
     * 　　設定年を返します。
     * @return 　　設定年
     */
    public java.lang.Integer getSettingYear() {
        return settingYear;
    }

    /**
     * 　　設定年を設定します。
     * @param settingYear 　　設定年
     */
    public void setSettingYear(java.lang.Integer settingYear) {
        this.settingYear = settingYear;
    }

    /**
     * 　　本賞金合計を返します。
     * @return 　　本賞金合計
     */
    public java.lang.String getAddedMoneyTotal() {
        return addedMoneyTotal;
    }

    /**
     * 　　本賞金合計を設定します。
     * @param addedMoneyTotal 　　本賞金合計
     */
    public void setAddedMoneyTotal(java.lang.String addedMoneyTotal) {
        this.addedMoneyTotal = addedMoneyTotal;
    }

    /**
     * 　　付加賞金合計を返します。
     * @return 　　付加賞金合計
     */
    public java.lang.String getStakesMoneyTotal() {
        return stakesMoneyTotal;
    }

    /**
     * 　　付加賞金合計を設定します。
     * @param stakesMoneyTotal 　　付加賞金合計
     */
    public void setStakesMoneyTotal(java.lang.String stakesMoneyTotal) {
        this.stakesMoneyTotal = stakesMoneyTotal;
    }

    /**
     * 　　着回数を返します。
     * @return 　　着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountItems() {
        return finishCountItems;
    }

    /**
     * 　　着回数を設定します。
     * @param finishCountItems 　　着回数
     */
    public void setFinishCountItems(java.util.List<java.lang.Integer> finishCountItems) {
        this.finishCountItems = finishCountItems;
    }

}