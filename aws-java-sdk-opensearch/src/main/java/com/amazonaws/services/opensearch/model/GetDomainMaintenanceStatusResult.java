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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result of a <code>GetDomainMaintenanceStatus</code> request. Contains information about the requested action.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDomainMaintenanceStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains status of the maintenance action.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Contains status message of the maintenance action.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * Contains node id of maintenance action.
     * </p>
     */
    private String nodeId;
    /**
     * <p>
     * Contains action name.
     * </p>
     */
    private String action;
    /**
     * <p>
     * Contains time at which action created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Contains time at which action updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * Contains status of the maintenance action.
     * </p>
     * 
     * @param status
     *        Contains status of the maintenance action.
     * @see MaintenanceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Contains status of the maintenance action.
     * </p>
     * 
     * @return Contains status of the maintenance action.
     * @see MaintenanceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Contains status of the maintenance action.
     * </p>
     * 
     * @param status
     *        Contains status of the maintenance action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceStatus
     */

    public GetDomainMaintenanceStatusResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Contains status of the maintenance action.
     * </p>
     * 
     * @param status
     *        Contains status of the maintenance action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceStatus
     */

    public GetDomainMaintenanceStatusResult withStatus(MaintenanceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Contains status message of the maintenance action.
     * </p>
     * 
     * @param statusMessage
     *        Contains status message of the maintenance action.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Contains status message of the maintenance action.
     * </p>
     * 
     * @return Contains status message of the maintenance action.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Contains status message of the maintenance action.
     * </p>
     * 
     * @param statusMessage
     *        Contains status message of the maintenance action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainMaintenanceStatusResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * Contains node id of maintenance action.
     * </p>
     * 
     * @param nodeId
     *        Contains node id of maintenance action.
     */

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * <p>
     * Contains node id of maintenance action.
     * </p>
     * 
     * @return Contains node id of maintenance action.
     */

    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * <p>
     * Contains node id of maintenance action.
     * </p>
     * 
     * @param nodeId
     *        Contains node id of maintenance action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainMaintenanceStatusResult withNodeId(String nodeId) {
        setNodeId(nodeId);
        return this;
    }

    /**
     * <p>
     * Contains action name.
     * </p>
     * 
     * @param action
     *        Contains action name.
     * @see MaintenanceType
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Contains action name.
     * </p>
     * 
     * @return Contains action name.
     * @see MaintenanceType
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Contains action name.
     * </p>
     * 
     * @param action
     *        Contains action name.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceType
     */

    public GetDomainMaintenanceStatusResult withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Contains action name.
     * </p>
     * 
     * @param action
     *        Contains action name.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceType
     */

    public GetDomainMaintenanceStatusResult withAction(MaintenanceType action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * Contains time at which action created.
     * </p>
     * 
     * @param createdAt
     *        Contains time at which action created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Contains time at which action created.
     * </p>
     * 
     * @return Contains time at which action created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Contains time at which action created.
     * </p>
     * 
     * @param createdAt
     *        Contains time at which action created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainMaintenanceStatusResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Contains time at which action updated.
     * </p>
     * 
     * @param updatedAt
     *        Contains time at which action updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * Contains time at which action updated.
     * </p>
     * 
     * @return Contains time at which action updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * Contains time at which action updated.
     * </p>
     * 
     * @param updatedAt
     *        Contains time at which action updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainMaintenanceStatusResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getNodeId() != null)
            sb.append("NodeId: ").append(getNodeId()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDomainMaintenanceStatusResult == false)
            return false;
        GetDomainMaintenanceStatusResult other = (GetDomainMaintenanceStatusResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getNodeId() == null ^ this.getNodeId() == null)
            return false;
        if (other.getNodeId() != null && other.getNodeId().equals(this.getNodeId()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getNodeId() == null) ? 0 : getNodeId().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public GetDomainMaintenanceStatusResult clone() {
        try {
            return (GetDomainMaintenanceStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
