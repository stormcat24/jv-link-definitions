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
public class VoteCountTrioDto {

    /** 　　組番 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1, byteLength = 6)
    private java.lang.String pairNo;

    /** 　　票数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 7, byteLength = 11)
    private java.lang.String voteCount;

    /** 　　人気順 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 18, byteLength = 3)
    private java.lang.String betRank;


    /**
     * 　　組番を返します。
     * @return 　　組番
     */
    public java.lang.String getPairNo() {
        return pairNo;
    }

    /**
     * 　　組番を設定します。
     * @param pairNo 　　組番
     */
    public void setPairNo(java.lang.String pairNo) {
        this.pairNo = pairNo;
    }

    /**
     * 　　票数を返します。
     * @return 　　票数
     */
    public java.lang.String getVoteCount() {
        return voteCount;
    }

    /**
     * 　　票数を設定します。
     * @param voteCount 　　票数
     */
    public void setVoteCount(java.lang.String voteCount) {
        this.voteCount = voteCount;
    }

    /**
     * 　　人気順を返します。
     * @return 　　人気順
     */
    public java.lang.String getBetRank() {
        return betRank;
    }

    /**
     * 　　人気順を設定します。
     * @param betRank 　　人気順
     */
    public void setBetRank(java.lang.String betRank) {
        this.betRank = betRank;
    }

}