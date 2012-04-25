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
public class RefundWinFiveDto {

    /** 組番 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1, byteLength = 10)
    private java.lang.String pairNo;

    /** 重勝式払戻金 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 11, byteLength = 9)
    private java.lang.Long refundMoney;

    /** 的中票数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 20, byteLength = 10)
    private java.lang.String voteCount;


    /**
     * 組番を返します。
     * @return 組番
     */
    public java.lang.String getPairNo() {
        return pairNo;
    }

    /**
     * 組番を設定します。
     * @param pairNo 組番
     */
    public void setPairNo(java.lang.String pairNo) {
        this.pairNo = pairNo;
    }

    /**
     * 重勝式払戻金を返します。
     * @return 重勝式払戻金
     */
    public java.lang.Long getRefundMoney() {
        return refundMoney;
    }

    /**
     * 重勝式払戻金を設定します。
     * @param refundMoney 重勝式払戻金
     */
    public void setRefundMoney(java.lang.Long refundMoney) {
        this.refundMoney = refundMoney;
    }

    /**
     * 的中票数を返します。
     * @return 的中票数
     */
    public java.lang.String getVoteCount() {
        return voteCount;
    }

    /**
     * 的中票数を設定します。
     * @param voteCount 的中票数
     */
    public void setVoteCount(java.lang.String voteCount) {
        this.voteCount = voteCount;
    }

}