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
package com.amazonaws.services.customerprofiles.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.customerprofiles.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetDomainResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDomainResultJsonUnmarshaller implements Unmarshaller<GetDomainResult, JsonUnmarshallerContext> {

    public GetDomainResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDomainResult getDomainResult = new GetDomainResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getDomainResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("DomainName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainResult.setDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultExpirationDays", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainResult.setDefaultExpirationDays(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DefaultEncryptionKey", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainResult.setDefaultEncryptionKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeadLetterQueueUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainResult.setDeadLetterQueueUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Stats", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainResult.setStats(DomainStatsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Matching", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainResult.setMatching(MatchingResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RuleBasedMatching", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainResult.setRuleBasedMatching(RuleBasedMatchingResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainResult.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
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

        return getDomainResult;
    }

    private static GetDomainResultJsonUnmarshaller instance;

    public static GetDomainResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDomainResultJsonUnmarshaller();
        return instance;
    }
}
