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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the data source.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data source for the AWS S3 Glue Data Catalog.
     * </p>
     */
    private S3GlueDataCatalog s3GlueDataCatalog;

    /**
     * <p>
     * The data source for the AWS S3 Glue Data Catalog.
     * </p>
     * 
     * @param s3GlueDataCatalog
     *        The data source for the AWS S3 Glue Data Catalog.
     */

    public void setS3GlueDataCatalog(S3GlueDataCatalog s3GlueDataCatalog) {
        this.s3GlueDataCatalog = s3GlueDataCatalog;
    }

    /**
     * <p>
     * The data source for the AWS S3 Glue Data Catalog.
     * </p>
     * 
     * @return The data source for the AWS S3 Glue Data Catalog.
     */

    public S3GlueDataCatalog getS3GlueDataCatalog() {
        return this.s3GlueDataCatalog;
    }

    /**
     * <p>
     * The data source for the AWS S3 Glue Data Catalog.
     * </p>
     * 
     * @param s3GlueDataCatalog
     *        The data source for the AWS S3 Glue Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceType withS3GlueDataCatalog(S3GlueDataCatalog s3GlueDataCatalog) {
        setS3GlueDataCatalog(s3GlueDataCatalog);
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
        if (getS3GlueDataCatalog() != null)
            sb.append("S3GlueDataCatalog: ").append(getS3GlueDataCatalog());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceType == false)
            return false;
        DataSourceType other = (DataSourceType) obj;
        if (other.getS3GlueDataCatalog() == null ^ this.getS3GlueDataCatalog() == null)
            return false;
        if (other.getS3GlueDataCatalog() != null && other.getS3GlueDataCatalog().equals(this.getS3GlueDataCatalog()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3GlueDataCatalog() == null) ? 0 : getS3GlueDataCatalog().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceType clone() {
        try {
            return (DataSourceType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.DataSourceTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
