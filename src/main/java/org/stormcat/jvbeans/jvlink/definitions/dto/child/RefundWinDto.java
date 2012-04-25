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
public class RefundWinDto {

    /** 　　馬番 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1, byteLength = 2)
    private java.lang.Integer horseNo;

    /** 　　払戻金 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 3, byteLength = 9)
    private java.lang.Long refundMoney;

    /** 　　人気順 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 12, byteLength = 2)
    private java.lang.Integer betRank;


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
     * 　　払戻金を返します。
     * @return 　　払戻金
     */
    public java.lang.Long getRefundMoney() {
        return refundMoney;
    }

    /**
     * 　　払戻金を設定します。
     * @param refundMoney 　　払戻金
     */
    public void setRefundMoney(java.lang.Long refundMoney) {
        this.refundMoney = refundMoney;
    }

    /**
     * 　　人気順を返します。
     * @return 　　人気順
     */
    public java.lang.Integer getBetRank() {
        return betRank;
    }

    /**
     * 　　人気順を設定します。
     * @param betRank 　　人気順
     */
    public void setBetRank(java.lang.Integer betRank) {
        this.betRank = betRank;
    }

}