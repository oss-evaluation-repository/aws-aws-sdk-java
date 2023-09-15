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
package com.amazonaws.services.certificatemanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.certificatemanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CertificateDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CertificateDetailJsonUnmarshaller implements Unmarshaller<CertificateDetail, JsonUnmarshallerContext> {

    public CertificateDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        CertificateDetail certificateDetail = new CertificateDetail();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("CertificateArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateDetail.setCertificateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DomainName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateDetail.setDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubjectAlternativeNames", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateDetail.setSubjectAlternativeNames(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DomainValidationOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateDetail.setDomainValidationOptions(new ListUnmarshaller<DomainValidation>(DomainValidationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Serial", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateDetail.setSerial(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Subject", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateDetail.setSubject(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Issuer", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateDetail.setIssuer(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateDetail.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("IssuedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateDetail.setIssuedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ImportedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateDetail.setImportedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateDetail.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RevokedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateDetail.setRevokedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("RevocationReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateDetail.setRevocationReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotBefore", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateDetail.setNotBefore(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("NotAfter", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateDetail.setNotAfter(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("KeyAlgorithm", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateDetail.setKeyAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SignatureAlgorithm", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateDetail.setSignatureAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InUseBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateDetail.setInUseBy(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateDetail.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateDetail.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RenewalSummary", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateDetail.setRenewalSummary(RenewalSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KeyUsages", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateDetail.setKeyUsages(new ListUnmarshaller<KeyUsage>(KeyUsageJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ExtendedKeyUsages", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateDetail.setExtendedKeyUsages(new ListUnmarshaller<ExtendedKeyUsage>(ExtendedKeyUsageJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CertificateAuthorityArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateDetail.setCertificateAuthorityArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RenewalEligibility", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateDetail.setRenewalEligibility(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Options", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateDetail.setOptions(CertificateOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (token == FIELD_NAME && !knownMember) {
                    context.nextToken();
                    com.amazonaws.transform.UnknownMemberJsonUnmarshaller.getInstance().unmarshall(context);
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return certificateDetail;
    }

    private static CertificateDetailJsonUnmarshaller instance;

    public static CertificateDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CertificateDetailJsonUnmarshaller();
        return instance;
    }
}
