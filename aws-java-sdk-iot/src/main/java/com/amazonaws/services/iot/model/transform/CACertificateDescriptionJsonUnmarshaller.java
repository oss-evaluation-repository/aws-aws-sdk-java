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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CACertificateDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CACertificateDescriptionJsonUnmarshaller implements Unmarshaller<CACertificateDescription, JsonUnmarshallerContext> {

    public CACertificateDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        CACertificateDescription cACertificateDescription = new CACertificateDescription();

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
                if (context.testExpression("certificateArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cACertificateDescription.setCertificateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("certificateId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cACertificateDescription.setCertificateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cACertificateDescription.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("certificatePem", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cACertificateDescription.setCertificatePem(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ownedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cACertificateDescription.setOwnedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cACertificateDescription.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("autoRegistrationStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cACertificateDescription.setAutoRegistrationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cACertificateDescription.setLastModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("customerVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cACertificateDescription.setCustomerVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("generationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cACertificateDescription.setGenerationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("validity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cACertificateDescription.setValidity(CertificateValidityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("certificateMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cACertificateDescription.setCertificateMode(context.getUnmarshaller(String.class).unmarshall(context));
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

        return cACertificateDescription;
    }

    private static CACertificateDescriptionJsonUnmarshaller instance;

    public static CACertificateDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CACertificateDescriptionJsonUnmarshaller();
        return instance;
    }
}
