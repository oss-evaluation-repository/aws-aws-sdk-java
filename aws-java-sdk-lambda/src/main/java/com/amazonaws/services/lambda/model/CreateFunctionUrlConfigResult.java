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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateFunctionUrlConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFunctionUrlConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String functionUrl;

    private String functionArn;

    private String authorizationType;

    private Cors cors;

    private String creationTime;

    /**
     * @param functionUrl
     */

    public void setFunctionUrl(String functionUrl) {
        this.functionUrl = functionUrl;
    }

    /**
     * @return
     */

    public String getFunctionUrl() {
        return this.functionUrl;
    }

    /**
     * @param functionUrl
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionUrlConfigResult withFunctionUrl(String functionUrl) {
        setFunctionUrl(functionUrl);
        return this;
    }

    /**
     * @param functionArn
     */

    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }

    /**
     * @return
     */

    public String getFunctionArn() {
        return this.functionArn;
    }

    /**
     * @param functionArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionUrlConfigResult withFunctionArn(String functionArn) {
        setFunctionArn(functionArn);
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

    public CreateFunctionUrlConfigResult withAuthorizationType(String authorizationType) {
        setAuthorizationType(authorizationType);
        return this;
    }

    /**
     * @param authorizationType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizationType
     */

    public CreateFunctionUrlConfigResult withAuthorizationType(AuthorizationType authorizationType) {
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

    public CreateFunctionUrlConfigResult withCors(Cors cors) {
        setCors(cors);
        return this;
    }

    /**
     * @param creationTime
     */

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * @return
     */

    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @param creationTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionUrlConfigResult withCreationTime(String creationTime) {
        setCreationTime(creationTime);
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
        if (getFunctionUrl() != null)
            sb.append("FunctionUrl: ").append(getFunctionUrl()).append(",");
        if (getFunctionArn() != null)
            sb.append("FunctionArn: ").append(getFunctionArn()).append(",");
        if (getAuthorizationType() != null)
            sb.append("AuthorizationType: ").append(getAuthorizationType()).append(",");
        if (getCors() != null)
            sb.append("Cors: ").append(getCors()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFunctionUrlConfigResult == false)
            return false;
        CreateFunctionUrlConfigResult other = (CreateFunctionUrlConfigResult) obj;
        if (other.getFunctionUrl() == null ^ this.getFunctionUrl() == null)
            return false;
        if (other.getFunctionUrl() != null && other.getFunctionUrl().equals(this.getFunctionUrl()) == false)
            return false;
        if (other.getFunctionArn() == null ^ this.getFunctionArn() == null)
            return false;
        if (other.getFunctionArn() != null && other.getFunctionArn().equals(this.getFunctionArn()) == false)
            return false;
        if (other.getAuthorizationType() == null ^ this.getAuthorizationType() == null)
            return false;
        if (other.getAuthorizationType() != null && other.getAuthorizationType().equals(this.getAuthorizationType()) == false)
            return false;
        if (other.getCors() == null ^ this.getCors() == null)
            return false;
        if (other.getCors() != null && other.getCors().equals(this.getCors()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionUrl() == null) ? 0 : getFunctionUrl().hashCode());
        hashCode = prime * hashCode + ((getFunctionArn() == null) ? 0 : getFunctionArn().hashCode());
        hashCode = prime * hashCode + ((getAuthorizationType() == null) ? 0 : getAuthorizationType().hashCode());
        hashCode = prime * hashCode + ((getCors() == null) ? 0 : getCors().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public CreateFunctionUrlConfigResult clone() {
        try {
            return (CreateFunctionUrlConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
