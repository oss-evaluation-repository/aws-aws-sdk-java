/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * ~~~[ TODO: ADD DESCRIPTION HERE ]~~~
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/Grant" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Grant implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ~~~[ TODO: ADD DESCRIPTION HERE ]~~~
     * </p>
     */
    private AuthorizationCodeGrant authorizationCode;
    /**
     * <p>
     * ~~~[ TODO: ADD DESCRIPTION HERE ]~~~
     * </p>
     */
    private JwtBearerGrant jwtBearer;

    /**
     * <p>
     * ~~~[ TODO: ADD DESCRIPTION HERE ]~~~
     * </p>
     * 
     * @param authorizationCode
     *        ~~~[ TODO: ADD DESCRIPTION HERE ]~~~
     */

    public void setAuthorizationCode(AuthorizationCodeGrant authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    /**
     * <p>
     * ~~~[ TODO: ADD DESCRIPTION HERE ]~~~
     * </p>
     * 
     * @return ~~~[ TODO: ADD DESCRIPTION HERE ]~~~
     */

    public AuthorizationCodeGrant getAuthorizationCode() {
        return this.authorizationCode;
    }

    /**
     * <p>
     * ~~~[ TODO: ADD DESCRIPTION HERE ]~~~
     * </p>
     * 
     * @param authorizationCode
     *        ~~~[ TODO: ADD DESCRIPTION HERE ]~~~
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Grant withAuthorizationCode(AuthorizationCodeGrant authorizationCode) {
        setAuthorizationCode(authorizationCode);
        return this;
    }

    /**
     * <p>
     * ~~~[ TODO: ADD DESCRIPTION HERE ]~~~
     * </p>
     * 
     * @param jwtBearer
     *        ~~~[ TODO: ADD DESCRIPTION HERE ]~~~
     */

    public void setJwtBearer(JwtBearerGrant jwtBearer) {
        this.jwtBearer = jwtBearer;
    }

    /**
     * <p>
     * ~~~[ TODO: ADD DESCRIPTION HERE ]~~~
     * </p>
     * 
     * @return ~~~[ TODO: ADD DESCRIPTION HERE ]~~~
     */

    public JwtBearerGrant getJwtBearer() {
        return this.jwtBearer;
    }

    /**
     * <p>
     * ~~~[ TODO: ADD DESCRIPTION HERE ]~~~
     * </p>
     * 
     * @param jwtBearer
     *        ~~~[ TODO: ADD DESCRIPTION HERE ]~~~
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Grant withJwtBearer(JwtBearerGrant jwtBearer) {
        setJwtBearer(jwtBearer);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAuthorizationCode() != null)
            sb.append("AuthorizationCode: ").append(getAuthorizationCode()).append(",");
        if (getJwtBearer() != null)
            sb.append("JwtBearer: ").append(getJwtBearer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Grant == false)
            return false;
        Grant other = (Grant) obj;
        if (other.getAuthorizationCode() == null ^ this.getAuthorizationCode() == null)
            return false;
        if (other.getAuthorizationCode() != null && other.getAuthorizationCode().equals(this.getAuthorizationCode()) == false)
            return false;
        if (other.getJwtBearer() == null ^ this.getJwtBearer() == null)
            return false;
        if (other.getJwtBearer() != null && other.getJwtBearer().equals(this.getJwtBearer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorizationCode() == null) ? 0 : getAuthorizationCode().hashCode());
        hashCode = prime * hashCode + ((getJwtBearer() == null) ? 0 : getJwtBearer().hashCode());
        return hashCode;
    }

    @Override
    public Grant clone() {
        try {
            return (Grant) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssoadmin.model.transform.GrantMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
