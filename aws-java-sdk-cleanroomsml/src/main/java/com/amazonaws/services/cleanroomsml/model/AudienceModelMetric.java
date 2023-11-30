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
package com.amazonaws.services.cleanroomsml.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The audience model metrics.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/AudienceModelMetric" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudienceModelMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of users that were used to generate these model metrics.
     * </p>
     */
    private Integer forTopKItemPredictions;
    /**
     * <p>
     * The audience model metric.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The value of the audience model metric
     * </p>
     */
    private Double value;

    /**
     * <p>
     * The number of users that were used to generate these model metrics.
     * </p>
     * 
     * @param forTopKItemPredictions
     *        The number of users that were used to generate these model metrics.
     */

    public void setForTopKItemPredictions(Integer forTopKItemPredictions) {
        this.forTopKItemPredictions = forTopKItemPredictions;
    }

    /**
     * <p>
     * The number of users that were used to generate these model metrics.
     * </p>
     * 
     * @return The number of users that were used to generate these model metrics.
     */

    public Integer getForTopKItemPredictions() {
        return this.forTopKItemPredictions;
    }

    /**
     * <p>
     * The number of users that were used to generate these model metrics.
     * </p>
     * 
     * @param forTopKItemPredictions
     *        The number of users that were used to generate these model metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudienceModelMetric withForTopKItemPredictions(Integer forTopKItemPredictions) {
        setForTopKItemPredictions(forTopKItemPredictions);
        return this;
    }

    /**
     * <p>
     * The audience model metric.
     * </p>
     * 
     * @param type
     *        The audience model metric.
     * @see AudienceModelMetricType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The audience model metric.
     * </p>
     * 
     * @return The audience model metric.
     * @see AudienceModelMetricType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The audience model metric.
     * </p>
     * 
     * @param type
     *        The audience model metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudienceModelMetricType
     */

    public AudienceModelMetric withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The audience model metric.
     * </p>
     * 
     * @param type
     *        The audience model metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudienceModelMetricType
     */

    public AudienceModelMetric withType(AudienceModelMetricType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The value of the audience model metric
     * </p>
     * 
     * @param value
     *        The value of the audience model metric
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the audience model metric
     * </p>
     * 
     * @return The value of the audience model metric
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the audience model metric
     * </p>
     * 
     * @param value
     *        The value of the audience model metric
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudienceModelMetric withValue(Double value) {
        setValue(value);
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
        if (getForTopKItemPredictions() != null)
            sb.append("ForTopKItemPredictions: ").append(getForTopKItemPredictions()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudienceModelMetric == false)
            return false;
        AudienceModelMetric other = (AudienceModelMetric) obj;
        if (other.getForTopKItemPredictions() == null ^ this.getForTopKItemPredictions() == null)
            return false;
        if (other.getForTopKItemPredictions() != null && other.getForTopKItemPredictions().equals(this.getForTopKItemPredictions()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getForTopKItemPredictions() == null) ? 0 : getForTopKItemPredictions().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public AudienceModelMetric clone() {
        try {
            return (AudienceModelMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanroomsml.model.transform.AudienceModelMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
