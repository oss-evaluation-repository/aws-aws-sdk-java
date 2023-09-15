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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CrawlerHistory JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CrawlerHistoryJsonUnmarshaller implements Unmarshaller<CrawlerHistory, JsonUnmarshallerContext> {

    public CrawlerHistory unmarshall(JsonUnmarshallerContext context) throws Exception {
        CrawlerHistory crawlerHistory = new CrawlerHistory();

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
                if (context.testExpression("CrawlId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawlerHistory.setCrawlId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawlerHistory.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawlerHistory.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawlerHistory.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Summary", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawlerHistory.setSummary(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ErrorMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawlerHistory.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LogGroup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawlerHistory.setLogGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LogStream", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawlerHistory.setLogStream(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MessagePrefix", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawlerHistory.setMessagePrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DPUHour", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    crawlerHistory.setDPUHour(context.getUnmarshaller(Double.class).unmarshall(context));
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

        return crawlerHistory;
    }

    private static CrawlerHistoryJsonUnmarshaller instance;

    public static CrawlerHistoryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CrawlerHistoryJsonUnmarshaller();
        return instance;
    }
}
