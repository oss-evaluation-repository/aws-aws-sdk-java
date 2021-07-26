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
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/VisualReferenceInput" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VisualReferenceInput implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<BaseScreenshot> baseScreenshots;

    private String baseCanaryRunId;

    /**
     * @return
     */

    public java.util.List<BaseScreenshot> getBaseScreenshots() {
        return baseScreenshots;
    }

    /**
     * @param baseScreenshots
     */

    public void setBaseScreenshots(java.util.Collection<BaseScreenshot> baseScreenshots) {
        if (baseScreenshots == null) {
            this.baseScreenshots = null;
            return;
        }

        this.baseScreenshots = new java.util.ArrayList<BaseScreenshot>(baseScreenshots);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBaseScreenshots(java.util.Collection)} or {@link #withBaseScreenshots(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param baseScreenshots
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisualReferenceInput withBaseScreenshots(BaseScreenshot... baseScreenshots) {
        if (this.baseScreenshots == null) {
            setBaseScreenshots(new java.util.ArrayList<BaseScreenshot>(baseScreenshots.length));
        }
        for (BaseScreenshot ele : baseScreenshots) {
            this.baseScreenshots.add(ele);
        }
        return this;
    }

    /**
     * @param baseScreenshots
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisualReferenceInput withBaseScreenshots(java.util.Collection<BaseScreenshot> baseScreenshots) {
        setBaseScreenshots(baseScreenshots);
        return this;
    }

    /**
     * @param baseCanaryRunId
     */

    public void setBaseCanaryRunId(String baseCanaryRunId) {
        this.baseCanaryRunId = baseCanaryRunId;
    }

    /**
     * @return
     */

    public String getBaseCanaryRunId() {
        return this.baseCanaryRunId;
    }

    /**
     * @param baseCanaryRunId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisualReferenceInput withBaseCanaryRunId(String baseCanaryRunId) {
        setBaseCanaryRunId(baseCanaryRunId);
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
        if (getBaseScreenshots() != null)
            sb.append("BaseScreenshots: ").append(getBaseScreenshots()).append(",");
        if (getBaseCanaryRunId() != null)
            sb.append("BaseCanaryRunId: ").append(getBaseCanaryRunId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VisualReferenceInput == false)
            return false;
        VisualReferenceInput other = (VisualReferenceInput) obj;
        if (other.getBaseScreenshots() == null ^ this.getBaseScreenshots() == null)
            return false;
        if (other.getBaseScreenshots() != null && other.getBaseScreenshots().equals(this.getBaseScreenshots()) == false)
            return false;
        if (other.getBaseCanaryRunId() == null ^ this.getBaseCanaryRunId() == null)
            return false;
        if (other.getBaseCanaryRunId() != null && other.getBaseCanaryRunId().equals(this.getBaseCanaryRunId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaseScreenshots() == null) ? 0 : getBaseScreenshots().hashCode());
        hashCode = prime * hashCode + ((getBaseCanaryRunId() == null) ? 0 : getBaseCanaryRunId().hashCode());
        return hashCode;
    }

    @Override
    public VisualReferenceInput clone() {
        try {
            return (VisualReferenceInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.synthetics.model.transform.VisualReferenceInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
