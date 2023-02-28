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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/CreateAccessor" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccessorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * This is a unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     * idempotent operation completes no more than once. This identifier is required only if you make a service request
     * directly using an HTTP client. It is generated automatically if you use an Amazon Web Services SDK or the Amazon
     * Web Services CLI.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The type of accessor.
     * </p>
     * <note>
     * <p>
     * Currently accessor type is restricted to <code>BILLING_TOKEN</code>.
     * </p>
     * </note>
     */
    private String accessorType;
    /**
     * <p>
     * Tags to assign to the Accessor.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. You can specify multiple key-value pairs in a single request
     * with an overall maximum of 50 tags allowed per resource.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html">Tagging
     * Resources</a> in the <i>Amazon Managed Blockchain Ethereum Developer Guide</i>, or <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     * >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * This is a unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     * idempotent operation completes no more than once. This identifier is required only if you make a service request
     * directly using an HTTP client. It is generated automatically if you use an Amazon Web Services SDK or the Amazon
     * Web Services CLI.
     * </p>
     * 
     * @param clientRequestToken
     *        This is a unique, case-sensitive identifier that you provide to ensure the idempotency of the operation.
     *        An idempotent operation completes no more than once. This identifier is required only if you make a
     *        service request directly using an HTTP client. It is generated automatically if you use an Amazon Web
     *        Services SDK or the Amazon Web Services CLI.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * This is a unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     * idempotent operation completes no more than once. This identifier is required only if you make a service request
     * directly using an HTTP client. It is generated automatically if you use an Amazon Web Services SDK or the Amazon
     * Web Services CLI.
     * </p>
     * 
     * @return This is a unique, case-sensitive identifier that you provide to ensure the idempotency of the operation.
     *         An idempotent operation completes no more than once. This identifier is required only if you make a
     *         service request directly using an HTTP client. It is generated automatically if you use an Amazon Web
     *         Services SDK or the Amazon Web Services CLI.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * This is a unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     * idempotent operation completes no more than once. This identifier is required only if you make a service request
     * directly using an HTTP client. It is generated automatically if you use an Amazon Web Services SDK or the Amazon
     * Web Services CLI.
     * </p>
     * 
     * @param clientRequestToken
     *        This is a unique, case-sensitive identifier that you provide to ensure the idempotency of the operation.
     *        An idempotent operation completes no more than once. This identifier is required only if you make a
     *        service request directly using an HTTP client. It is generated automatically if you use an Amazon Web
     *        Services SDK or the Amazon Web Services CLI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessorRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The type of accessor.
     * </p>
     * <note>
     * <p>
     * Currently accessor type is restricted to <code>BILLING_TOKEN</code>.
     * </p>
     * </note>
     * 
     * @param accessorType
     *        The type of accessor.</p> <note>
     *        <p>
     *        Currently accessor type is restricted to <code>BILLING_TOKEN</code>.
     *        </p>
     * @see AccessorType
     */

    public void setAccessorType(String accessorType) {
        this.accessorType = accessorType;
    }

    /**
     * <p>
     * The type of accessor.
     * </p>
     * <note>
     * <p>
     * Currently accessor type is restricted to <code>BILLING_TOKEN</code>.
     * </p>
     * </note>
     * 
     * @return The type of accessor.</p> <note>
     *         <p>
     *         Currently accessor type is restricted to <code>BILLING_TOKEN</code>.
     *         </p>
     * @see AccessorType
     */

    public String getAccessorType() {
        return this.accessorType;
    }

    /**
     * <p>
     * The type of accessor.
     * </p>
     * <note>
     * <p>
     * Currently accessor type is restricted to <code>BILLING_TOKEN</code>.
     * </p>
     * </note>
     * 
     * @param accessorType
     *        The type of accessor.</p> <note>
     *        <p>
     *        Currently accessor type is restricted to <code>BILLING_TOKEN</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessorType
     */

    public CreateAccessorRequest withAccessorType(String accessorType) {
        setAccessorType(accessorType);
        return this;
    }

    /**
     * <p>
     * The type of accessor.
     * </p>
     * <note>
     * <p>
     * Currently accessor type is restricted to <code>BILLING_TOKEN</code>.
     * </p>
     * </note>
     * 
     * @param accessorType
     *        The type of accessor.</p> <note>
     *        <p>
     *        Currently accessor type is restricted to <code>BILLING_TOKEN</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessorType
     */

    public CreateAccessorRequest withAccessorType(AccessorType accessorType) {
        this.accessorType = accessorType.toString();
        return this;
    }

    /**
     * <p>
     * Tags to assign to the Accessor.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. You can specify multiple key-value pairs in a single request
     * with an overall maximum of 50 tags allowed per resource.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html">Tagging
     * Resources</a> in the <i>Amazon Managed Blockchain Ethereum Developer Guide</i>, or <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     * >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * </p>
     * 
     * @return Tags to assign to the Accessor.</p>
     *         <p>
     *         Each tag consists of a key and an optional value. You can specify multiple key-value pairs in a single
     *         request with an overall maximum of 50 tags allowed per resource.
     *         </p>
     *         <p>
     *         For more information about tags, see <a
     *         href="https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html">Tagging
     *         Resources</a> in the <i>Amazon Managed Blockchain Ethereum Developer Guide</i>, or <a href=
     *         "https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     *         >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to assign to the Accessor.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. You can specify multiple key-value pairs in a single request
     * with an overall maximum of 50 tags allowed per resource.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html">Tagging
     * Resources</a> in the <i>Amazon Managed Blockchain Ethereum Developer Guide</i>, or <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     * >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        Tags to assign to the Accessor.</p>
     *        <p>
     *        Each tag consists of a key and an optional value. You can specify multiple key-value pairs in a single
     *        request with an overall maximum of 50 tags allowed per resource.
     *        </p>
     *        <p>
     *        For more information about tags, see <a
     *        href="https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html">Tagging
     *        Resources</a> in the <i>Amazon Managed Blockchain Ethereum Developer Guide</i>, or <a href=
     *        "https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     *        >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags to assign to the Accessor.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. You can specify multiple key-value pairs in a single request
     * with an overall maximum of 50 tags allowed per resource.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html">Tagging
     * Resources</a> in the <i>Amazon Managed Blockchain Ethereum Developer Guide</i>, or <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     * >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        Tags to assign to the Accessor.</p>
     *        <p>
     *        Each tag consists of a key and an optional value. You can specify multiple key-value pairs in a single
     *        request with an overall maximum of 50 tags allowed per resource.
     *        </p>
     *        <p>
     *        For more information about tags, see <a
     *        href="https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html">Tagging
     *        Resources</a> in the <i>Amazon Managed Blockchain Ethereum Developer Guide</i>, or <a href=
     *        "https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     *        >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessorRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateAccessorRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessorRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessorRequest clearTagsEntries() {
        this.tags = null;
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getAccessorType() != null)
            sb.append("AccessorType: ").append(getAccessorType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAccessorRequest == false)
            return false;
        CreateAccessorRequest other = (CreateAccessorRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getAccessorType() == null ^ this.getAccessorType() == null)
            return false;
        if (other.getAccessorType() != null && other.getAccessorType().equals(this.getAccessorType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getAccessorType() == null) ? 0 : getAccessorType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAccessorRequest clone() {
        return (CreateAccessorRequest) super.clone();
    }

}
