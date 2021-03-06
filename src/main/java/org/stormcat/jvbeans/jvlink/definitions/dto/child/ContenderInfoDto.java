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
public class ContenderInfoDto {

    /** 　　血統登録番号 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1, byteLength = 10)
    private java.lang.String bloodRegistNo;

    /** 　　馬名 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 11, byteLength = 36)
    private java.lang.String horseName;


    /**
     * 　　血統登録番号を返します。
     * @return 　　血統登録番号
     */
    public java.lang.String getBloodRegistNo() {
        return bloodRegistNo;
    }

    /**
     * 　　血統登録番号を設定します。
     * @param bloodRegistNo 　　血統登録番号
     */
    public void setBloodRegistNo(java.lang.String bloodRegistNo) {
        this.bloodRegistNo = bloodRegistNo;
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

}