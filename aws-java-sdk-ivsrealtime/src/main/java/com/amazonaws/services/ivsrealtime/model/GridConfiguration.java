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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information specific to Grid layout, for server-side composition. See "Layouts" in <a
 * href="https://docs.aws.amazon.com/ivs/latest/RealTimeUserGuide/server-side-composition.html">Server-Side
 * Composition</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GridConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GridConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This attribute name identifies the featured slot. A participant with this attribute set to <code>"true"</code>
     * (as a string value) in <a>ParticipantTokenConfiguration</a> is placed in the featured slot.
     * </p>
     */
    private String featuredParticipantAttribute;

    /**
     * <p>
     * This attribute name identifies the featured slot. A participant with this attribute set to <code>"true"</code>
     * (as a string value) in <a>ParticipantTokenConfiguration</a> is placed in the featured slot.
     * </p>
     * 
     * @param featuredParticipantAttribute
     *        This attribute name identifies the featured slot. A participant with this attribute set to
     *        <code>"true"</code> (as a string value) in <a>ParticipantTokenConfiguration</a> is placed in the featured
     *        slot.
     */

    public void setFeaturedParticipantAttribute(String featuredParticipantAttribute) {
        this.featuredParticipantAttribute = featuredParticipantAttribute;
    }

    /**
     * <p>
     * This attribute name identifies the featured slot. A participant with this attribute set to <code>"true"</code>
     * (as a string value) in <a>ParticipantTokenConfiguration</a> is placed in the featured slot.
     * </p>
     * 
     * @return This attribute name identifies the featured slot. A participant with this attribute set to
     *         <code>"true"</code> (as a string value) in <a>ParticipantTokenConfiguration</a> is placed in the featured
     *         slot.
     */

    public String getFeaturedParticipantAttribute() {
        return this.featuredParticipantAttribute;
    }

    /**
     * <p>
     * This attribute name identifies the featured slot. A participant with this attribute set to <code>"true"</code>
     * (as a string value) in <a>ParticipantTokenConfiguration</a> is placed in the featured slot.
     * </p>
     * 
     * @param featuredParticipantAttribute
     *        This attribute name identifies the featured slot. A participant with this attribute set to
     *        <code>"true"</code> (as a string value) in <a>ParticipantTokenConfiguration</a> is placed in the featured
     *        slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GridConfiguration withFeaturedParticipantAttribute(String featuredParticipantAttribute) {
        setFeaturedParticipantAttribute(featuredParticipantAttribute);
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
        if (getFeaturedParticipantAttribute() != null)
            sb.append("FeaturedParticipantAttribute: ").append(getFeaturedParticipantAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GridConfiguration == false)
            return false;
        GridConfiguration other = (GridConfiguration) obj;
        if (other.getFeaturedParticipantAttribute() == null ^ this.getFeaturedParticipantAttribute() == null)
            return false;
        if (other.getFeaturedParticipantAttribute() != null && other.getFeaturedParticipantAttribute().equals(this.getFeaturedParticipantAttribute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeaturedParticipantAttribute() == null) ? 0 : getFeaturedParticipantAttribute().hashCode());
        return hashCode;
    }

    @Override
    public GridConfiguration clone() {
        try {
            return (GridConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivsrealtime.model.transform.GridConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
