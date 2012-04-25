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
public class RefundSpareDto {

    /** 　　予備 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1, byteLength = 4)
    private java.lang.String spare1;

    /** 　　予備 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 5, byteLength = 9)
    private java.lang.String spare2;

    /** 　　予備 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 14, byteLength = 3)
    private java.lang.String spare3;


    /**
     * 　　予備を返します。
     * @return 　　予備
     */
    public java.lang.String getSpare1() {
        return spare1;
    }

    /**
     * 　　予備を設定します。
     * @param spare1 　　予備
     */
    public void setSpare1(java.lang.String spare1) {
        this.spare1 = spare1;
    }

    /**
     * 　　予備を返します。
     * @return 　　予備
     */
    public java.lang.String getSpare2() {
        return spare2;
    }

    /**
     * 　　予備を設定します。
     * @param spare2 　　予備
     */
    public void setSpare2(java.lang.String spare2) {
        this.spare2 = spare2;
    }

    /**
     * 　　予備を返します。
     * @return 　　予備
     */
    public java.lang.String getSpare3() {
        return spare3;
    }

    /**
     * 　　予備を設定します。
     * @param spare3 　　予備
     */
    public void setSpare3(java.lang.String spare3) {
        this.spare3 = spare3;
    }

}