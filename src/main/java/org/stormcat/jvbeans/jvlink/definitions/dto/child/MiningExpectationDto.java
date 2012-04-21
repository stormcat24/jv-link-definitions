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
package org.stormcat.jvbeans.jvlink.definitions.dto.child;

 /**
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public class MiningExpectationDto {

    /** 馬番 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1, byteLength = 2)
    private java.lang.Integer horseNo;

    /** 予想走破タイム */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 3, byteLength = 5)
    private java.lang.String expectationRunningTime;

    /** 予想誤差(信頼度)＋ */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 8, byteLength = 4)
    private java.lang.String expectationErrorPlus;

    /** 予想誤差(信頼度)－ */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 12, byteLength = 4)
    private java.lang.String expectationErrorMinus;


    /**
     * 馬番を返します。
     * @return 馬番
     */
    public java.lang.Integer getHorseNo() {
        return horseNo;
    }

    /**
     * 馬番を設定します。
     * @param horseNo 馬番
     */
    public void setHorseNo(java.lang.Integer horseNo) {
        this.horseNo = horseNo;
    }

    /**
     * 予想走破タイムを返します。
     * @return 予想走破タイム
     */
    public java.lang.String getExpectationRunningTime() {
        return expectationRunningTime;
    }

    /**
     * 予想走破タイムを設定します。
     * @param expectationRunningTime 予想走破タイム
     */
    public void setExpectationRunningTime(java.lang.String expectationRunningTime) {
        this.expectationRunningTime = expectationRunningTime;
    }

    /**
     * 予想誤差(信頼度)＋を返します。
     * @return 予想誤差(信頼度)＋
     */
    public java.lang.String getExpectationErrorPlus() {
        return expectationErrorPlus;
    }

    /**
     * 予想誤差(信頼度)＋を設定します。
     * @param expectationErrorPlus 予想誤差(信頼度)＋
     */
    public void setExpectationErrorPlus(java.lang.String expectationErrorPlus) {
        this.expectationErrorPlus = expectationErrorPlus;
    }

    /**
     * 予想誤差(信頼度)－を返します。
     * @return 予想誤差(信頼度)－
     */
    public java.lang.String getExpectationErrorMinus() {
        return expectationErrorMinus;
    }

    /**
     * 予想誤差(信頼度)－を設定します。
     * @param expectationErrorMinus 予想誤差(信頼度)－
     */
    public void setExpectationErrorMinus(java.lang.String expectationErrorMinus) {
        this.expectationErrorMinus = expectationErrorMinus;
    }

}