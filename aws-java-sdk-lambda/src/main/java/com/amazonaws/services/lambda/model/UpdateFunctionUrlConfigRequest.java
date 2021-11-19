/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateFunctionUrlConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFunctionUrlConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String functionName;

    private String qualifier;

    private String authorizationType;

    private Cors cors;

    /**
     * @param functionName
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * @return
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @param functionName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionUrlConfigRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * @param qualifier
     */

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /**
     * @return
     */

    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @param qualifier
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionUrlConfigRequest withQualifier(String qualifier) {
        setQualifier(qualifier);
        return this;
    }

    /**
     * @param authorizationType
     * @see AuthorizationType
     */

    public void setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
    }

    /**
     * @return
     * @see AuthorizationType
     */

    public String getAuthorizationType() {
        return this.authorizationType;
    }

    /**
     * @param authorizationType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizationType
     */

    public UpdateFunctionUrlConfigRequest withAuthorizationType(String authorizationType) {
        setAuthorizationType(authorizationType);
        return this;
    }

    /**
     * @param authorizationType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizationType
     */

    public UpdateFunctionUrlConfigRequest withAuthorizationType(AuthorizationType authorizationType) {
        this.authorizationType = authorizationType.toString();
        return this;
    }

    /**
     * @param cors
     */

    public void setCors(Cors cors) {
        this.cors = cors;
    }

    /**
     * @return
     */

    public Cors getCors() {
        return this.cors;
    }

    /**
     * @param cors
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionUrlConfigRequest withCors(Cors cors) {
        setCors(cors);
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
        if (getFunctionName() != null)
            sb.append("FunctionName: ").append(getFunctionName()).append(",");
        if (getQualifier() != null)
            sb.append("Qualifier: ").append(getQualifier()).append(",");
        if (getAuthorizationType() != null)
            sb.append("AuthorizationType: ").append(getAuthorizationType()).append(",");
        if (getCors() != null)
            sb.append("Cors: ").append(getCors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFunctionUrlConfigRequest == false)
            return false;
        UpdateFunctionUrlConfigRequest other = (UpdateFunctionUrlConfigRequest) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getQualifier() == null ^ this.getQualifier() == null)
            return false;
        if (other.getQualifier() != null && other.getQualifier().equals(this.getQualifier()) == false)
            return false;
        if (other.getAuthorizationType() == null ^ this.getAuthorizationType() == null)
            return false;
        if (other.getAuthorizationType() != null && other.getAuthorizationType().equals(this.getAuthorizationType()) == false)
            return false;
        if (other.getCors() == null ^ this.getCors() == null)
            return false;
        if (other.getCors() != null && other.getCors().equals(this.getCors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getQualifier() == null) ? 0 : getQualifier().hashCode());
        hashCode = prime * hashCode + ((getAuthorizationType() == null) ? 0 : getAuthorizationType().hashCode());
        hashCode = prime * hashCode + ((getCors() == null) ? 0 : getCors().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFunctionUrlConfigRequest clone() {
        return (UpdateFunctionUrlConfigRequest) super.clone();
    }

}
