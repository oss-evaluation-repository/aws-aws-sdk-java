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
 * The request for a CreateChangeset operation.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateChangeset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateChangesetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A token used to ensure idempotency.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The unique identifier for the FinSpace Dataset where the Changeset will be created.
     * </p>
     */
    private String datasetId;
    /**
     * <p>
     * Option to indicate how a Changeset will be applied to a Dataset.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLACE</code> - Changeset will be considered as a replacement to all prior loaded Changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPEND</code> - Changeset will be considered as an addition to the end of all prior loaded Changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFY</code> - Changeset is considered as a replacement to a specific prior ingested Changeset.
     * </p>
     * </li>
     * </ul>
     */
    private String changeType;
    /**
     * <p>
     * Options that define the location of the data being ingested.
     * </p>
     */
    private java.util.Map<String, String> sourceParams;
    /**
     * <p>
     * Options that define the structure of the source file(s) including the format type (<code>formatType</code>),
     * header row (<code>withHeader</code>), data separation character (<code>separator</code>) and the type of
     * compression (<code>compression</code>).
     * </p>
     * <p>
     * <code>formatType</code> is a required attribute and can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PARQUET</code> - Parquet source file format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CSV</code> - CSV source file format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JSON</code> - JSON source file format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XML</code> - XML source file format.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, you could specify the following for <code>formatParams</code>:
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

    public CreateChangesetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the FinSpace Dataset where the Changeset will be created.
     * </p>
     * 
     * @param datasetId
     *        The unique identifier for the FinSpace Dataset where the Changeset will be created.
     */

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    /**
     * <p>
     * The unique identifier for the FinSpace Dataset where the Changeset will be created.
     * </p>
     * 
     * @return The unique identifier for the FinSpace Dataset where the Changeset will be created.
     */

    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * <p>
     * The unique identifier for the FinSpace Dataset where the Changeset will be created.
     * </p>
     * 
     * @param datasetId
     *        The unique identifier for the FinSpace Dataset where the Changeset will be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangesetRequest withDatasetId(String datasetId) {
        setDatasetId(datasetId);
        return this;
    }

    /**
     * <p>
     * Option to indicate how a Changeset will be applied to a Dataset.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLACE</code> - Changeset will be considered as a replacement to all prior loaded Changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPEND</code> - Changeset will be considered as an addition to the end of all prior loaded Changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFY</code> - Changeset is considered as a replacement to a specific prior ingested Changeset.
     * </p>
     * </li>
     * </ul>
     * 
     * @param changeType
     *        Option to indicate how a Changeset will be applied to a Dataset.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REPLACE</code> - Changeset will be considered as a replacement to all prior loaded Changesets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>APPEND</code> - Changeset will be considered as an addition to the end of all prior loaded
     *        Changesets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFY</code> - Changeset is considered as a replacement to a specific prior ingested Changeset.
     *        </p>
     *        </li>
     * @see ChangeType
     */

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    /**
     * <p>
     * Option to indicate how a Changeset will be applied to a Dataset.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLACE</code> - Changeset will be considered as a replacement to all prior loaded Changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPEND</code> - Changeset will be considered as an addition to the end of all prior loaded Changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFY</code> - Changeset is considered as a replacement to a specific prior ingested Changeset.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Option to indicate how a Changeset will be applied to a Dataset.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>REPLACE</code> - Changeset will be considered as a replacement to all prior loaded Changesets.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>APPEND</code> - Changeset will be considered as an addition to the end of all prior loaded
     *         Changesets.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MODIFY</code> - Changeset is considered as a replacement to a specific prior ingested Changeset.
     *         </p>
     *         </li>
     * @see ChangeType
     */

    public String getChangeType() {
        return this.changeType;
    }

    /**
     * <p>
     * Option to indicate how a Changeset will be applied to a Dataset.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLACE</code> - Changeset will be considered as a replacement to all prior loaded Changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPEND</code> - Changeset will be considered as an addition to the end of all prior loaded Changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFY</code> - Changeset is considered as a replacement to a specific prior ingested Changeset.
     * </p>
     * </li>
     * </ul>
     * 
     * @param changeType
     *        Option to indicate how a Changeset will be applied to a Dataset.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REPLACE</code> - Changeset will be considered as a replacement to all prior loaded Changesets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>APPEND</code> - Changeset will be considered as an addition to the end of all prior loaded
     *        Changesets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFY</code> - Changeset is considered as a replacement to a specific prior ingested Changeset.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeType
     */

    public CreateChangesetRequest withChangeType(String changeType) {
        setChangeType(changeType);
        return this;
    }

    /**
     * <p>
     * Option to indicate how a Changeset will be applied to a Dataset.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLACE</code> - Changeset will be considered as a replacement to all prior loaded Changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPEND</code> - Changeset will be considered as an addition to the end of all prior loaded Changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFY</code> - Changeset is considered as a replacement to a specific prior ingested Changeset.
     * </p>
     * </li>
     * </ul>
     * 
     * @param changeType
     *        Option to indicate how a Changeset will be applied to a Dataset.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REPLACE</code> - Changeset will be considered as a replacement to all prior loaded Changesets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>APPEND</code> - Changeset will be considered as an addition to the end of all prior loaded
     *        Changesets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFY</code> - Changeset is considered as a replacement to a specific prior ingested Changeset.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeType
     */

    public CreateChangesetRequest withChangeType(ChangeType changeType) {
        this.changeType = changeType.toString();
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

    public CreateChangesetRequest withSourceParams(java.util.Map<String, String> sourceParams) {
        setSourceParams(sourceParams);
        return this;
    }

    /**
     * Add a single SourceParams entry
     *
     * @see CreateChangesetRequest#withSourceParams
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangesetRequest addSourceParamsEntry(String key, String value) {
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

    public CreateChangesetRequest clearSourceParamsEntries() {
        this.sourceParams = null;
        return this;
    }

    /**
     * <p>
     * Options that define the structure of the source file(s) including the format type (<code>formatType</code>),
     * header row (<code>withHeader</code>), data separation character (<code>separator</code>) and the type of
     * compression (<code>compression</code>).
     * </p>
     * <p>
     * <code>formatType</code> is a required attribute and can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PARQUET</code> - Parquet source file format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CSV</code> - CSV source file format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JSON</code> - JSON source file format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XML</code> - XML source file format.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, you could specify the following for <code>formatParams</code>:
     * </p>
     * 
     * @return Options that define the structure of the source file(s) including the format type (
     *         <code>formatType</code>), header row (<code>withHeader</code>), data separation character (
     *         <code>separator</code>) and the type of compression (<code>compression</code>). </p>
     *         <p>
     *         <code>formatType</code> is a required attribute and can have the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PARQUET</code> - Parquet source file format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CSV</code> - CSV source file format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>JSON</code> - JSON source file format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>XML</code> - XML source file format.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, you could specify the following for <code>formatParams</code>:
     */

    public java.util.Map<String, String> getFormatParams() {
        return formatParams;
    }

    /**
     * <p>
     * Options that define the structure of the source file(s) including the format type (<code>formatType</code>),
     * header row (<code>withHeader</code>), data separation character (<code>separator</code>) and the type of
     * compression (<code>compression</code>).
     * </p>
     * <p>
     * <code>formatType</code> is a required attribute and can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PARQUET</code> - Parquet source file format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CSV</code> - CSV source file format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JSON</code> - JSON source file format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XML</code> - XML source file format.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, you could specify the following for <code>formatParams</code>:
     * </p>
     * 
     * @param formatParams
     *        Options that define the structure of the source file(s) including the format type (<code>formatType</code>
     *        ), header row (<code>withHeader</code>), data separation character (<code>separator</code>) and the type
     *        of compression (<code>compression</code>). </p>
     *        <p>
     *        <code>formatType</code> is a required attribute and can have the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PARQUET</code> - Parquet source file format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CSV</code> - CSV source file format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>JSON</code> - JSON source file format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XML</code> - XML source file format.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, you could specify the following for <code>formatParams</code>:
     */

    public void setFormatParams(java.util.Map<String, String> formatParams) {
        this.formatParams = formatParams;
    }

    /**
     * <p>
     * Options that define the structure of the source file(s) including the format type (<code>formatType</code>),
     * header row (<code>withHeader</code>), data separation character (<code>separator</code>) and the type of
     * compression (<code>compression</code>).
     * </p>
     * <p>
     * <code>formatType</code> is a required attribute and can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PARQUET</code> - Parquet source file format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CSV</code> - CSV source file format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JSON</code> - JSON source file format.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XML</code> - XML source file format.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, you could specify the following for <code>formatParams</code>:
     * </p>
     * 
     * @param formatParams
     *        Options that define the structure of the source file(s) including the format type (<code>formatType</code>
     *        ), header row (<code>withHeader</code>), data separation character (<code>separator</code>) and the type
     *        of compression (<code>compression</code>). </p>
     *        <p>
     *        <code>formatType</code> is a required attribute and can have the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PARQUET</code> - Parquet source file format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CSV</code> - CSV source file format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>JSON</code> - JSON source file format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XML</code> - XML source file format.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, you could specify the following for <code>formatParams</code>:
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangesetRequest withFormatParams(java.util.Map<String, String> formatParams) {
        setFormatParams(formatParams);
        return this;
    }

    /**
     * Add a single FormatParams entry
     *
     * @see CreateChangesetRequest#withFormatParams
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangesetRequest addFormatParamsEntry(String key, String value) {
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

    public CreateChangesetRequest clearFormatParamsEntries() {
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
        if (getChangeType() != null)
            sb.append("ChangeType: ").append(getChangeType()).append(",");
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

        if (obj instanceof CreateChangesetRequest == false)
            return false;
        CreateChangesetRequest other = (CreateChangesetRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDatasetId() == null ^ this.getDatasetId() == null)
            return false;
        if (other.getDatasetId() != null && other.getDatasetId().equals(this.getDatasetId()) == false)
            return false;
        if (other.getChangeType() == null ^ this.getChangeType() == null)
            return false;
        if (other.getChangeType() != null && other.getChangeType().equals(this.getChangeType()) == false)
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
        hashCode = prime * hashCode + ((getChangeType() == null) ? 0 : getChangeType().hashCode());
        hashCode = prime * hashCode + ((getSourceParams() == null) ? 0 : getSourceParams().hashCode());
        hashCode = prime * hashCode + ((getFormatParams() == null) ? 0 : getFormatParams().hashCode());
        return hashCode;
    }

    @Override
    public CreateChangesetRequest clone() {
        return (CreateChangesetRequest) super.clone();
    }

}
