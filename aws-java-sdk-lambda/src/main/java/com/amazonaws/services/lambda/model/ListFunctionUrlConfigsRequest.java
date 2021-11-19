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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListFunctionUrlConfigs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFunctionUrlConfigsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String functionName;

    private String marker;

    private Integer maxItems;

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

    public ListFunctionUrlConfigsRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * @param marker
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * @return
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * @param marker
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFunctionUrlConfigsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * @param maxItems
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * @return
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * @param maxItems
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFunctionUrlConfigsRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFunctionUrlConfigsRequest == false)
            return false;
        ListFunctionUrlConfigsRequest other = (ListFunctionUrlConfigsRequest) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListFunctionUrlConfigsRequest clone() {
        return (ListFunctionUrlConfigsRequest) super.clone();
    }

}
