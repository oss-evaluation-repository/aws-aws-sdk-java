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
package com.amazonaws.services.pcaconnectorad.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pcaconnectorad.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SubjectNameFlagsV2 JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubjectNameFlagsV2JsonUnmarshaller implements Unmarshaller<SubjectNameFlagsV2, JsonUnmarshallerContext> {

    public SubjectNameFlagsV2 unmarshall(JsonUnmarshallerContext context) throws Exception {
        SubjectNameFlagsV2 subjectNameFlagsV2 = new SubjectNameFlagsV2();

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
                if (context.testExpression("RequireCommonName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    subjectNameFlagsV2.setRequireCommonName(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RequireDirectoryPath", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    subjectNameFlagsV2.setRequireDirectoryPath(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RequireDnsAsCn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    subjectNameFlagsV2.setRequireDnsAsCn(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RequireEmail", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    subjectNameFlagsV2.setRequireEmail(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SanRequireDirectoryGuid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    subjectNameFlagsV2.setSanRequireDirectoryGuid(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SanRequireDns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    subjectNameFlagsV2.setSanRequireDns(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SanRequireDomainDns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    subjectNameFlagsV2.setSanRequireDomainDns(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SanRequireEmail", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    subjectNameFlagsV2.setSanRequireEmail(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SanRequireSpn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    subjectNameFlagsV2.setSanRequireSpn(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SanRequireUpn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    subjectNameFlagsV2.setSanRequireUpn(context.getUnmarshaller(Boolean.class).unmarshall(context));
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

        return subjectNameFlagsV2;
    }

    private static SubjectNameFlagsV2JsonUnmarshaller instance;

    public static SubjectNameFlagsV2JsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SubjectNameFlagsV2JsonUnmarshaller();
        return instance;
    }
}
