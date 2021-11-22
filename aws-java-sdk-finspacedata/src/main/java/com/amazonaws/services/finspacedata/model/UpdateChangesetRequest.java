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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Request to update an existing changeset.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/UpdateChangeset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateChangesetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A token used to ensure idempotency.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The unique identifier for the FinSpace Dataset in which the Changeset is created.
     * </p>
     */
    private String datasetId;
    /**
     * <p>
     * The unique identifier for the Changeset to update.
     * </p>
     */
    private String changesetId;
    /**
     * <p>
     * Options that define the location of the data being ingested.
     * </p>
     */
    private java.util.Map<String, String> sourceParams;
    /**
     * <p>
     * Options that define the structure of the source file(s).
     * </p>
     */
    private java.util.Map<String, String> formatParams;

    /**
     * <p>
     * A token used to ensure idempotency.
     * </p>
     * 
     * @param clientToken
     *        A token used to ensure idempotency.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token used to ensure idempotency.
     * </p>
     * 
     * @return A token used to ensure idempotency.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token used to ensure idempotency.
     * </p>
     * 
     * @param clientToken
     *        A token used to ensure idempotency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChangesetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the FinSpace Dataset in which the Changeset is created.
     * </p>
     * 
     * @param datasetId
     *        The unique identifier for the FinSpace Dataset in which the Changeset is created.
     */

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    /**
     * <p>
     * The unique identifier for the FinSpace Dataset in which the Changeset is created.
     * </p>
     * 
     * @return The unique identifier for the FinSpace Dataset in which the Changeset is created.
     */

    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * <p>
     * The unique identifier for the FinSpace Dataset in which the Changeset is created.
     * </p>
     * 
     * @param datasetId
     *        The unique identifier for the FinSpace Dataset in which the Changeset is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChangesetRequest withDatasetId(String datasetId) {
        setDatasetId(datasetId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the Changeset to update.
     * </p>
     * 
     * @param changesetId
     *        The unique identifier for the Changeset to update.
     */

    public void setChangesetId(String changesetId) {
        this.changesetId = changesetId;
    }

    /**
     * <p>
     * The unique identifier for the Changeset to update.
     * </p>
     * 
     * @return The unique identifier for the Changeset to update.
     */

    public String getChangesetId() {
        return this.changesetId;
    }

    /**
     * <p>
     * The unique identifier for the Changeset to update.
     * </p>
     * 
     * @param changesetId
     *        The unique identifier for the Changeset to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChangesetRequest withChangesetId(String changesetId) {
        setChangesetId(changesetId);
        return this;
    }

    /**
     * <p>
     * Options that define the location of the data being ingested.
     * </p>
     * 
     * @return Options that define the location of the data being ingested.
     */

    public java.util.Map<String, String> getSourceParams() {
        return sourceParams;
    }

    /**
     * <p>
     * Options that define the location of the data being ingested.
     * </p>
     * 
     * @param sourceParams
     *        Options that define the location of the data being ingested.
     */

    public void setSourceParams(java.util.Map<String, String> sourceParams) {
        this.sourceParams = sourceParams;
    }

    /**
     * <p>
     * Options that define the location of the data being ingested.
     * </p>
     * 
     * @param sourceParams
     *        Options that define the location of the data being ingested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChangesetRequest withSourceParams(java.util.Map<String, String> sourceParams) {
        setSourceParams(sourceParams);
        return this;
    }

    /**
     * Add a single SourceParams entry
     *
     * @see UpdateChangesetRequest#withSourceParams
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChangesetRequest addSourceParamsEntry(String key, String value) {
        if (null == this.sourceParams) {
            this.sourceParams = new java.util.HashMap<String, String>();
        }
        if (this.sourceParams.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.sourceParams.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SourceParams.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChangesetRequest clearSourceParamsEntries() {
        this.sourceParams = null;
        return this;
    }

    /**
     * <p>
     * Options that define the structure of the source file(s).
     * </p>
     * 
     * @return Options that define the structure of the source file(s).
     */

    public java.util.Map<String, String> getFormatParams() {
        return formatParams;
    }

    /**
     * <p>
     * Options that define the structure of the source file(s).
     * </p>
     * 
     * @param formatParams
     *        Options that define the structure of the source file(s).
     */

    public void setFormatParams(java.util.Map<String, String> formatParams) {
        this.formatParams = formatParams;
    }

    /**
     * <p>
     * Options that define the structure of the source file(s).
     * </p>
     * 
     * @param formatParams
     *        Options that define the structure of the source file(s).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChangesetRequest withFormatParams(java.util.Map<String, String> formatParams) {
        setFormatParams(formatParams);
        return this;
    }

    /**
     * Add a single FormatParams entry
     *
     * @see UpdateChangesetRequest#withFormatParams
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChangesetRequest addFormatParamsEntry(String key, String value) {
        if (null == this.formatParams) {
            this.formatParams = new java.util.HashMap<String, String>();
        }
        if (this.formatParams.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.formatParams.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FormatParams.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChangesetRequest clearFormatParamsEntries() {
        this.formatParams = null;
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDatasetId() != null)
            sb.append("DatasetId: ").append(getDatasetId()).append(",");
        if (getChangesetId() != null)
            sb.append("ChangesetId: ").append(getChangesetId()).append(",");
        if (getSourceParams() != null)
            sb.append("SourceParams: ").append(getSourceParams()).append(",");
        if (getFormatParams() != null)
            sb.append("FormatParams: ").append(getFormatParams());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateChangesetRequest == false)
            return false;
        UpdateChangesetRequest other = (UpdateChangesetRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDatasetId() == null ^ this.getDatasetId() == null)
            return false;
        if (other.getDatasetId() != null && other.getDatasetId().equals(this.getDatasetId()) == false)
            return false;
        if (other.getChangesetId() == null ^ this.getChangesetId() == null)
            return false;
        if (other.getChangesetId() != null && other.getChangesetId().equals(this.getChangesetId()) == false)
            return false;
        if (other.getSourceParams() == null ^ this.getSourceParams() == null)
            return false;
        if (other.getSourceParams() != null && other.getSourceParams().equals(this.getSourceParams()) == false)
            return false;
        if (other.getFormatParams() == null ^ this.getFormatParams() == null)
            return false;
        if (other.getFormatParams() != null && other.getFormatParams().equals(this.getFormatParams()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDatasetId() == null) ? 0 : getDatasetId().hashCode());
        hashCode = prime * hashCode + ((getChangesetId() == null) ? 0 : getChangesetId().hashCode());
        hashCode = prime * hashCode + ((getSourceParams() == null) ? 0 : getSourceParams().hashCode());
        hashCode = prime * hashCode + ((getFormatParams() == null) ? 0 : getFormatParams().hashCode());
        return hashCode;
    }

    @Override
    public UpdateChangesetRequest clone() {
        return (UpdateChangesetRequest) super.clone();
    }

}
