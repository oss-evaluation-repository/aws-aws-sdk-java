/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Contains information about provisioned throughput for EBS storage volumes attached to kafka broker nodes.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ProvisionedThroughput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionedThroughput implements Serializable, Cloneable, StructuredPojo {

    /** Provisioned throughput is enabled or not. */
    private Boolean enabled;
    /** Throughput value of the EBS volumes for the data drive on each kafka broker node in MiB per second. */
    private Integer volumeThroughput;

    /**
     * Provisioned throughput is enabled or not.
     * 
     * @param enabled
     *        Provisioned throughput is enabled or not.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Provisioned throughput is enabled or not.
     * 
     * @return Provisioned throughput is enabled or not.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Provisioned throughput is enabled or not.
     * 
     * @param enabled
     *        Provisioned throughput is enabled or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedThroughput withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * Provisioned throughput is enabled or not.
     * 
     * @return Provisioned throughput is enabled or not.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * Throughput value of the EBS volumes for the data drive on each kafka broker node in MiB per second.
     * 
     * @param volumeThroughput
     *        Throughput value of the EBS volumes for the data drive on each kafka broker node in MiB per second.
     */

    public void setVolumeThroughput(Integer volumeThroughput) {
        this.volumeThroughput = volumeThroughput;
    }

    /**
     * Throughput value of the EBS volumes for the data drive on each kafka broker node in MiB per second.
     * 
     * @return Throughput value of the EBS volumes for the data drive on each kafka broker node in MiB per second.
     */

    public Integer getVolumeThroughput() {
        return this.volumeThroughput;
    }

    /**
     * Throughput value of the EBS volumes for the data drive on each kafka broker node in MiB per second.
     * 
     * @param volumeThroughput
     *        Throughput value of the EBS volumes for the data drive on each kafka broker node in MiB per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedThroughput withVolumeThroughput(Integer volumeThroughput) {
        setVolumeThroughput(volumeThroughput);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getVolumeThroughput() != null)
            sb.append("VolumeThroughput: ").append(getVolumeThroughput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionedThroughput == false)
            return false;
        ProvisionedThroughput other = (ProvisionedThroughput) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getVolumeThroughput() == null ^ this.getVolumeThroughput() == null)
            return false;
        if (other.getVolumeThroughput() != null && other.getVolumeThroughput().equals(this.getVolumeThroughput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getVolumeThroughput() == null) ? 0 : getVolumeThroughput().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionedThroughput clone() {
        try {
            return (ProvisionedThroughput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.ProvisionedThroughputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
