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
 * A collection of settings specific to the problem type used to configure an AutoML job V2. There must be one and only
 * one config of the following type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AutoMLProblemTypeConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLProblemTypeConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Settings used to configure an AutoML job V2 for the image classification problem type.
     * </p>
     */
    private ImageClassificationJobConfig imageClassificationJobConfig;
    /**
     * <p>
     * Settings used to configure an AutoML job V2 for the text classification problem type.
     * </p>
     */
    private TextClassificationJobConfig textClassificationJobConfig;
    /**
     * <p>
     * Settings used to configure an AutoML job V2 for a tabular problem type (regression, classification).
     * </p>
     */
    private TabularJobConfig tabularJobConfig;

    /**
     * <p>
     * Settings used to configure an AutoML job V2 for the image classification problem type.
     * </p>
     * 
     * @param imageClassificationJobConfig
     *        Settings used to configure an AutoML job V2 for the image classification problem type.
     */

    public void setImageClassificationJobConfig(ImageClassificationJobConfig imageClassificationJobConfig) {
        this.imageClassificationJobConfig = imageClassificationJobConfig;
    }

    /**
     * <p>
     * Settings used to configure an AutoML job V2 for the image classification problem type.
     * </p>
     * 
     * @return Settings used to configure an AutoML job V2 for the image classification problem type.
     */

    public ImageClassificationJobConfig getImageClassificationJobConfig() {
        return this.imageClassificationJobConfig;
    }

    /**
     * <p>
     * Settings used to configure an AutoML job V2 for the image classification problem type.
     * </p>
     * 
     * @param imageClassificationJobConfig
     *        Settings used to configure an AutoML job V2 for the image classification problem type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLProblemTypeConfig withImageClassificationJobConfig(ImageClassificationJobConfig imageClassificationJobConfig) {
        setImageClassificationJobConfig(imageClassificationJobConfig);
        return this;
    }

    /**
     * <p>
     * Settings used to configure an AutoML job V2 for the text classification problem type.
     * </p>
     * 
     * @param textClassificationJobConfig
     *        Settings used to configure an AutoML job V2 for the text classification problem type.
     */

    public void setTextClassificationJobConfig(TextClassificationJobConfig textClassificationJobConfig) {
        this.textClassificationJobConfig = textClassificationJobConfig;
    }

    /**
     * <p>
     * Settings used to configure an AutoML job V2 for the text classification problem type.
     * </p>
     * 
     * @return Settings used to configure an AutoML job V2 for the text classification problem type.
     */

    public TextClassificationJobConfig getTextClassificationJobConfig() {
        return this.textClassificationJobConfig;
    }

    /**
     * <p>
     * Settings used to configure an AutoML job V2 for the text classification problem type.
     * </p>
     * 
     * @param textClassificationJobConfig
     *        Settings used to configure an AutoML job V2 for the text classification problem type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLProblemTypeConfig withTextClassificationJobConfig(TextClassificationJobConfig textClassificationJobConfig) {
        setTextClassificationJobConfig(textClassificationJobConfig);
        return this;
    }

    /**
     * <p>
     * Settings used to configure an AutoML job V2 for a tabular problem type (regression, classification).
     * </p>
     * 
     * @param tabularJobConfig
     *        Settings used to configure an AutoML job V2 for a tabular problem type (regression, classification).
     */

    public void setTabularJobConfig(TabularJobConfig tabularJobConfig) {
        this.tabularJobConfig = tabularJobConfig;
    }

    /**
     * <p>
     * Settings used to configure an AutoML job V2 for a tabular problem type (regression, classification).
     * </p>
     * 
     * @return Settings used to configure an AutoML job V2 for a tabular problem type (regression, classification).
     */

    public TabularJobConfig getTabularJobConfig() {
        return this.tabularJobConfig;
    }

    /**
     * <p>
     * Settings used to configure an AutoML job V2 for a tabular problem type (regression, classification).
     * </p>
     * 
     * @param tabularJobConfig
     *        Settings used to configure an AutoML job V2 for a tabular problem type (regression, classification).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLProblemTypeConfig withTabularJobConfig(TabularJobConfig tabularJobConfig) {
        setTabularJobConfig(tabularJobConfig);
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
        if (getImageClassificationJobConfig() != null)
            sb.append("ImageClassificationJobConfig: ").append(getImageClassificationJobConfig()).append(",");
        if (getTextClassificationJobConfig() != null)
            sb.append("TextClassificationJobConfig: ").append(getTextClassificationJobConfig()).append(",");
        if (getTabularJobConfig() != null)
            sb.append("TabularJobConfig: ").append(getTabularJobConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLProblemTypeConfig == false)
            return false;
        AutoMLProblemTypeConfig other = (AutoMLProblemTypeConfig) obj;
        if (other.getImageClassificationJobConfig() == null ^ this.getImageClassificationJobConfig() == null)
            return false;
        if (other.getImageClassificationJobConfig() != null && other.getImageClassificationJobConfig().equals(this.getImageClassificationJobConfig()) == false)
            return false;
        if (other.getTextClassificationJobConfig() == null ^ this.getTextClassificationJobConfig() == null)
            return false;
        if (other.getTextClassificationJobConfig() != null && other.getTextClassificationJobConfig().equals(this.getTextClassificationJobConfig()) == false)
            return false;
        if (other.getTabularJobConfig() == null ^ this.getTabularJobConfig() == null)
            return false;
        if (other.getTabularJobConfig() != null && other.getTabularJobConfig().equals(this.getTabularJobConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageClassificationJobConfig() == null) ? 0 : getImageClassificationJobConfig().hashCode());
        hashCode = prime * hashCode + ((getTextClassificationJobConfig() == null) ? 0 : getTextClassificationJobConfig().hashCode());
        hashCode = prime * hashCode + ((getTabularJobConfig() == null) ? 0 : getTabularJobConfig().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLProblemTypeConfig clone() {
        try {
            return (AutoMLProblemTypeConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutoMLProblemTypeConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
