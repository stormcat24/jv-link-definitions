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
public class HorseWeightInfoDto {

    /** 　　馬番 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1, byteLength = 2)
    private java.lang.Integer horseNo;

    /** 　　馬名 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 3, byteLength = 36)
    private java.lang.String horseName;

    /** 　　馬体重 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 39, byteLength = 3)
    private java.lang.Integer horseWeight;

    /** 　　増減符号 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 42, byteLength = 1)
    private java.lang.Character changeSign;

    /** 　　増減差 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 43, byteLength = 3)
    private java.lang.Integer changeAmount;


    /**
     * 　　馬番を返します。
     * @return 　　馬番
     */
    public java.lang.Integer getHorseNo() {
        return horseNo;
    }

    /**
     * 　　馬番を設定します。
     * @param horseNo 　　馬番
     */
    public void setHorseNo(java.lang.Integer horseNo) {
        this.horseNo = horseNo;
    }

    /**
     * 　　馬名を返します。
     * @return 　　馬名
     */
    public java.lang.String getHorseName() {
        return horseName;
    }

    /**
     * 　　馬名を設定します。
     * @param horseName 　　馬名
     */
    public void setHorseName(java.lang.String horseName) {
        this.horseName = horseName;
    }

    /**
     * 　　馬体重を返します。
     * @return 　　馬体重
     */
    public java.lang.Integer getHorseWeight() {
        return horseWeight;
    }

    /**
     * 　　馬体重を設定します。
     * @param horseWeight 　　馬体重
     */
    public void setHorseWeight(java.lang.Integer horseWeight) {
        this.horseWeight = horseWeight;
    }

    /**
     * 　　増減符号を返します。
     * @return 　　増減符号
     */
    public java.lang.Character getChangeSign() {
        return changeSign;
    }

    /**
     * 　　増減符号を設定します。
     * @param changeSign 　　増減符号
     */
    public void setChangeSign(java.lang.Character changeSign) {
        this.changeSign = changeSign;
    }

    /**
     * 　　増減差を返します。
     * @return 　　増減差
     */
    public java.lang.Integer getChangeAmount() {
        return changeAmount;
    }

    /**
     * 　　増減差を設定します。
     * @param changeAmount 　　増減差
     */
    public void setChangeAmount(java.lang.Integer changeAmount) {
        this.changeAmount = changeAmount;
    }

}