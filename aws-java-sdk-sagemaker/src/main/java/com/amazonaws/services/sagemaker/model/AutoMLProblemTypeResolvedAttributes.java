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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The resolved attributes specific to the problem type of an AutoML job V2.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AutoMLProblemTypeResolvedAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLProblemTypeResolvedAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the resolved attributes for the <code>TABULAR</code> problem type.
     * </p>
     */
    private TabularResolvedAttributes tabularResolvedAttributes;

    /**
     * <p>
     * Defines the resolved attributes for the <code>TABULAR</code> problem type.
     * </p>
     * 
     * @param tabularResolvedAttributes
     *        Defines the resolved attributes for the <code>TABULAR</code> problem type.
     */

    public void setTabularResolvedAttributes(TabularResolvedAttributes tabularResolvedAttributes) {
        this.tabularResolvedAttributes = tabularResolvedAttributes;
    }

    /**
     * <p>
     * Defines the resolved attributes for the <code>TABULAR</code> problem type.
     * </p>
     * 
     * @return Defines the resolved attributes for the <code>TABULAR</code> problem type.
     */

    public TabularResolvedAttributes getTabularResolvedAttributes() {
        return this.tabularResolvedAttributes;
    }

    /**
     * <p>
     * Defines the resolved attributes for the <code>TABULAR</code> problem type.
     * </p>
     * 
     * @param tabularResolvedAttributes
     *        Defines the resolved attributes for the <code>TABULAR</code> problem type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLProblemTypeResolvedAttributes withTabularResolvedAttributes(TabularResolvedAttributes tabularResolvedAttributes) {
        setTabularResolvedAttributes(tabularResolvedAttributes);
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
        if (getTabularResolvedAttributes() != null)
            sb.append("TabularResolvedAttributes: ").append(getTabularResolvedAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLProblemTypeResolvedAttributes == false)
            return false;
        AutoMLProblemTypeResolvedAttributes other = (AutoMLProblemTypeResolvedAttributes) obj;
        if (other.getTabularResolvedAttributes() == null ^ this.getTabularResolvedAttributes() == null)
            return false;
        if (other.getTabularResolvedAttributes() != null && other.getTabularResolvedAttributes().equals(this.getTabularResolvedAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTabularResolvedAttributes() == null) ? 0 : getTabularResolvedAttributes().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLProblemTypeResolvedAttributes clone() {
        try {
            return (AutoMLProblemTypeResolvedAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutoMLProblemTypeResolvedAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
