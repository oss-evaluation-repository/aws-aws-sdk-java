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
package com.amazonaws.services.mturk.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mturk.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * HIT JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HITJsonUnmarshaller implements Unmarshaller<HIT, JsonUnmarshallerContext> {

    public HIT unmarshall(JsonUnmarshallerContext context) throws Exception {
        HIT hIT = new HIT();

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
                if (context.testExpression("HITId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hIT.setHITId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HITTypeId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hIT.setHITTypeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HITGroupId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hIT.setHITGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HITLayoutId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hIT.setHITLayoutId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hIT.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hIT.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hIT.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Question", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hIT.setQuestion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Keywords", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hIT.setKeywords(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HITStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hIT.setHITStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxAssignments", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hIT.setMaxAssignments(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Reward", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hIT.setReward(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoApprovalDelayInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hIT.setAutoApprovalDelayInSeconds(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Expiration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hIT.setExpiration(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AssignmentDurationInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hIT.setAssignmentDurationInSeconds(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("RequesterAnnotation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hIT.setRequesterAnnotation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QualificationRequirements", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hIT.setQualificationRequirements(new ListUnmarshaller<QualificationRequirement>(QualificationRequirementJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("HITReviewStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hIT.setHITReviewStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfAssignmentsPending", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hIT.setNumberOfAssignmentsPending(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfAssignmentsAvailable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hIT.setNumberOfAssignmentsAvailable(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfAssignmentsCompleted", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hIT.setNumberOfAssignmentsCompleted(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return hIT;
    }

    private static HITJsonUnmarshaller instance;

    public static HITJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HITJsonUnmarshaller();
        return instance;
    }
}
