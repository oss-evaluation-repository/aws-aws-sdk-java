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
 * CertificateSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CertificateSummaryJsonUnmarshaller implements Unmarshaller<CertificateSummary, JsonUnmarshallerContext> {

    public CertificateSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        CertificateSummary certificateSummary = new CertificateSummary();

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
                    certificateSummary.setCertificateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DomainName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateSummary.setDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubjectAlternativeNameSummaries", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateSummary.setSubjectAlternativeNameSummaries(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("HasAdditionalSubjectAlternativeNames", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateSummary.setHasAdditionalSubjectAlternativeNames(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateSummary.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyAlgorithm", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateSummary.setKeyAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyUsages", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateSummary.setKeyUsages(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ExtendedKeyUsages", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateSummary.setExtendedKeyUsages(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("InUse", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateSummary.setInUse(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Exported", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateSummary.setExported(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RenewalEligibility", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateSummary.setRenewalEligibility(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotBefore", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateSummary.setNotBefore(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("NotAfter", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateSummary.setNotAfter(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateSummary.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("IssuedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateSummary.setIssuedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ImportedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateSummary.setImportedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("RevokedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    certificateSummary.setRevokedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return certificateSummary;
    }

    private static CertificateSummaryJsonUnmarshaller instance;

    public static CertificateSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CertificateSummaryJsonUnmarshaller();
        return instance;
    }
}
