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
public class CornerPassageRankDto {

    /** 　　コーナー */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1, byteLength = 1)
    private java.lang.Integer corner;

    /** 　　周回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 2, byteLength = 1)
    private java.lang.Integer arroundCount;

    /** 　　各通過順位 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 3, byteLength = 70)
    private java.lang.String passageRank;


    /**
     * 　　コーナーを返します。
     * @return 　　コーナー
     */
    public java.lang.Integer getCorner() {
        return corner;
    }

    /**
     * 　　コーナーを設定します。
     * @param corner 　　コーナー
     */
    public void setCorner(java.lang.Integer corner) {
        this.corner = corner;
    }

    /**
     * 　　周回数を返します。
     * @return 　　周回数
     */
    public java.lang.Integer getArroundCount() {
        return arroundCount;
    }

    /**
     * 　　周回数を設定します。
     * @param arroundCount 　　周回数
     */
    public void setArroundCount(java.lang.Integer arroundCount) {
        this.arroundCount = arroundCount;
    }

    /**
     * 　　各通過順位を返します。
     * @return 　　各通過順位
     */
    public java.lang.String getPassageRank() {
        return passageRank;
    }

    /**
     * 　　各通過順位を設定します。
     * @param passageRank 　　各通過順位
     */
    public void setPassageRank(java.lang.String passageRank) {
        this.passageRank = passageRank;
    }

}